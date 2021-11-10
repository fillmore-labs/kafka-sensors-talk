package com.fillmore_labs.kafka.sensors.serde.serdes07;

import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.serde.serdes07.context.SingleTestComponent;
import com.fillmore_labs.kafka.sensors.serde.serdes07.context.TestComponent;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public final class SerdeTest extends SerdeTestBase<SensorState> {
  public SerdeTest(String description, SingleTestComponent singleTestComponent) {
    super(
        singleTestComponent.serializer(),
        singleTestComponent.deserializer(),
        com.fillmore_labs.kafka.sensors.serde.serdes07.TestHelper.standardSensorState());
  }

  @Parameters(name = "{index}: {0}")
  public static Iterable<Object[]> parameters() {
    return TestComponent.create().parameters();
  }
}
