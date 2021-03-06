package com.fillmore_labs.kafka.sensors.serde.serdes09;

import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.serde.serdes09.context.SingleTestComponent;
import com.fillmore_labs.kafka.sensors.serde.serdes09.context.TestComponent;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public final class SerdeDurationTest extends SerdeTestBase<StateDuration> {
  public SerdeDurationTest(String description, SingleTestComponent singleTestComponent) {
    super(
        singleTestComponent.serializerDuration(),
        singleTestComponent.deserializerDuration(),
        TestHelper.standardStateDuration());
  }

  @Parameters(name = "{index}: {0}")
  public static Iterable<Object[]> parameters() {
    return TestComponent.create().parameters();
  }
}
