package com.fillmore_labs.kafka.sensors.serde.json;

import static com.fillmore_labs.kafka.sensors.serde.json.context.TestComponent.TEST_COMPONENT;

import com.fillmore_labs.kafka.sensors.model.SensorState;

public final class SerdeTest extends SerdeTestBase<SensorState> {
  public SerdeTest() {
    super(
        TEST_COMPONENT.serializer(),
        TEST_COMPONENT.deserializer(),
        TestHelper.standardSensorState());
  }
}
