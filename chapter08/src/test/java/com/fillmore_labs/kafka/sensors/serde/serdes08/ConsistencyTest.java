package com.fillmore_labs.kafka.sensors.serde.serdes08;

import com.fillmore_labs.kafka.sensors.serde.serdes08.context.TestComponent;
import java.util.List;

public final class ConsistencyTest extends ConsistencyTestBase {
  private static final String[] ENCODING_VALUES = {
    "avro", "ion", "json", "protobuf", "thrift",
  };

  private static final TestComponent TEST_COMPONENT = TestComponent.create();

  public ConsistencyTest() {
    super(
        TEST_COMPONENT.encodings(),
        TEST_COMPONENT.serdeMapReading(),
        TEST_COMPONENT.serdeMap(),
        TEST_COMPONENT.serdeDurationMap());
  }

  @Override
  protected List<String> encodingValues() {
    return List.of(ENCODING_VALUES);
  }
}
