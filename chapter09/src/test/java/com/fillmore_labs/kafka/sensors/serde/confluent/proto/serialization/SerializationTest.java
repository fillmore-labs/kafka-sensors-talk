package com.fillmore_labs.kafka.sensors.serde.confluent.proto.serialization;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.extensions.proto.ProtoTruth.assertThat;
import static org.junit.Assert.assertThrows;

import com.fillmore_labs.kafka.sensors.proto.v1.Reading;
import com.fillmore_labs.kafka.sensors.proto.v1.StateDuration;
import com.fillmore_labs.kafka.sensors.serde.confluent.common.Confluent;
import com.fillmore_labs.kafka.sensors.serde.confluent.common.SchemaRegistryModule;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import dagger.Component;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;
import org.junit.Test;

public final class SerializationTest {
  private static final String TOPIC = "topic";

  private final Serializer<StateDuration> serializer;
  private final Deserializer<StateDuration> deserializer;

  public SerializationTest() {
    var testComponent = TestComponent.create();
    this.serializer = testComponent.serializer();
    this.deserializer = testComponent.deserializer();
  }

  @Test
  public void canDecode() {
    var reading =
        Reading.newBuilder()
            .setTime(Timestamp.newBuilder().setSeconds(443634300L))
            .setPosition(Reading.Position.POSITION_ON);

    var sensorState =
        StateDuration.newBuilder()
            .setId("7331")
            .setReading(reading)
            .setDuration(Duration.newBuilder().setSeconds(15L))
            .build();

    var encoded = serializer.serialize(TOPIC, sensorState);

    // Check for “Magic Byte”
    // https://docs.confluent.io/current/schema-registry/serializer-formatter.html#wire-format
    assertThat(encoded[0]).isEqualTo((byte) 0);

    var decoded = deserializer.deserialize(TOPIC, encoded);

    assertThat(decoded).isEqualTo(sensorState);
  }

  @Test
  @SuppressWarnings("nullness:argument")
  public void notNull() {
    assertThrows(
        NullPointerException.class,
        () ->
            Reading.newBuilder()
                .setTime(Timestamp.newBuilder().setSeconds(443634300L))
                .setPosition(null)
                .build());
  }

  @Singleton
  @Component(modules = {SerializationModule.class, SchemaRegistryModule.class})
  public interface TestComponent {
    static TestComponent create() {
      return DaggerSerializationTest_TestComponent.create();
    }

    @Confluent
    Serializer<StateDuration> serializer();

    @Confluent
    Deserializer<StateDuration> deserializer();
  }
}