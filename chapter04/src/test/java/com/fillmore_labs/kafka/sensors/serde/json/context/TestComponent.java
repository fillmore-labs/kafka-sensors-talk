package com.fillmore_labs.kafka.sensors.serde.json.context;

import static com.fillmore_labs.kafka.sensors.serde.json.JsonModule.JSON;

import com.fillmore_labs.kafka.sensors.model.Reading;
import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.serde.json.JsonModule;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

@Singleton
@Component(modules = {TestComponent.TestModule.class})
public interface TestComponent {
  TestComponent TEST_COMPONENT = create();

  static TestComponent create() {
    return DaggerTestComponent.create();
  }

  Serializer<Reading> serializerReading();

  Deserializer<Reading> deserializerReading();

  Serializer<SensorState> serializer();

  Deserializer<SensorState> deserializer();

  Serializer<StateDuration> serializerDuration();

  Deserializer<StateDuration> deserializerDuration();

  @Module(includes = JsonModule.class)
  /* package */ abstract class TestModule {
    private TestModule() {}

    @Provides
    /* package */ static Serializer<Reading> serializerReading(@Named(JSON) Serde<Reading> serde) {
      return serde.serializer();
    }

    @Provides
    /* package */ static Deserializer<Reading> deserializerReading(
        @Named(JSON) Serde<Reading> serde) {
      return serde.deserializer();
    }

    @Provides
    /* package */ static Serializer<SensorState> serializer(@Named(JSON) Serde<SensorState> serde) {
      return serde.serializer();
    }

    @Provides
    /* package */ static Deserializer<SensorState> deserializer(
        @Named(JSON) Serde<SensorState> serde) {
      return serde.deserializer();
    }

    @Provides
    /* package */ static Serializer<StateDuration> serializerDuration(
        @Named(JSON) Serde<StateDuration> serde) {
      return serde.serializer();
    }

    @Provides
    /* package */ static Deserializer<StateDuration> deserializerDuration(
        @Named(JSON) Serde<StateDuration> serde) {
      return serde.deserializer();
    }
  }
}
