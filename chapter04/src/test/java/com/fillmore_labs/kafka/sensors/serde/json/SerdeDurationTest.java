package com.fillmore_labs.kafka.sensors.serde.json;

import static com.fillmore_labs.kafka.sensors.serde.json.context.TestComponent.TEST_COMPONENT;

import com.fillmore_labs.kafka.sensors.model.StateDuration;

public final class SerdeDurationTest extends SerdeTestBase<StateDuration> {
  public SerdeDurationTest() {
    super(
        TEST_COMPONENT.serializerDuration(),
        TEST_COMPONENT.deserializerDuration(),
        TestHelper.standardStateDuration());
  }
}
