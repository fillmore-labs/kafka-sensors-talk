package com.fillmore_labs.kafka.sensors.topology.context;

import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.topology.server.EmbeddedKafka;
import org.apache.kafka.streams.TestInputTopic;
import org.apache.kafka.streams.TestOutputTopic;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.junit.rules.ExternalResource;

public final class TestResource extends ExternalResource {
  private final EmbeddedKafka embeddedKafka;

  private @MonotonicNonNull TestComponent testComponent;

  public TestResource(EmbeddedKafka embeddedKafka) {
    this.embeddedKafka = embeddedKafka;
  }

  @Override
  @EnsuresNonNull("testComponent")
  protected void before() {
    testComponent = TestComponent.builder().embeddedKafka(embeddedKafka).build();
  }

  @Override
  protected void after() {
    assert testComponent != null : "@AssumeAssertion(nullness): before() not called";
    testComponent.testDriver().close();
  }

  public TestInputTopic<String, SensorState> inputTopic() {
    assert testComponent != null : "@AssumeAssertion(nullness): before() not called";
    return testComponent.inputTopic();
  }

  public TestOutputTopic<String, StateDuration> resultTopic() {
    assert testComponent != null : "@AssumeAssertion(nullness): before() not called";
    return testComponent.resultTopic();
  }
}
