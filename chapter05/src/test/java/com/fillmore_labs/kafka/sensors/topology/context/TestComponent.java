package com.fillmore_labs.kafka.sensors.topology.context;

import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.serde.json.JsonModule;
import com.fillmore_labs.kafka.sensors.topology.server.EmbeddedKafka;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import org.apache.kafka.streams.TestInputTopic;
import org.apache.kafka.streams.TestOutputTopic;
import org.apache.kafka.streams.TopologyTestDriver;

@Singleton
@Component(modules = {JsonModule.class, TestModule.class})
public interface TestComponent {
  static Builder builder() {
    return DaggerTestComponent.builder();
  }

  TopologyTestDriver testDriver();

  TestInputTopic<String, SensorState> inputTopic();

  TestOutputTopic<String, StateDuration> resultTopic();

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder embeddedKafka(EmbeddedKafka embeddedKafka);

    TestComponent build();
  }
}
