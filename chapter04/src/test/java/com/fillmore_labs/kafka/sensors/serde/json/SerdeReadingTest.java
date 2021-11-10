package com.fillmore_labs.kafka.sensors.serde.json;

import static com.fillmore_labs.kafka.sensors.serde.json.context.TestComponent.TEST_COMPONENT;

import com.fillmore_labs.kafka.sensors.model.Reading;

public final class SerdeReadingTest extends SerdeTestBase<Reading> {
  public SerdeReadingTest() {
    super(
        TEST_COMPONENT.serializerReading(),
        TEST_COMPONENT.deserializerReading(),
        TestHelper.standardReading());
  }
}
