package com.fillmore_labs.kafka.sensors.serde.serdes08;

import com.fillmore_labs.kafka.sensors.model.Reading;
import com.fillmore_labs.kafka.sensors.serde.serdes08.context.SingleTestComponent;
import com.fillmore_labs.kafka.sensors.serde.serdes08.context.TestComponent;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public final class SerdeReadingTest extends SerdeTestBase<Reading> {
  public SerdeReadingTest(String description, SingleTestComponent singleTestComponent) {
    super(
        singleTestComponent.serializerReading(),
        singleTestComponent.deserializerReading(),
        TestHelper.standardReading());
  }

  @Parameters(name = "{index}: {0}")
  public static Iterable<Object[]> parameters() {
    return TestComponent.create().parameters();
  }
}
