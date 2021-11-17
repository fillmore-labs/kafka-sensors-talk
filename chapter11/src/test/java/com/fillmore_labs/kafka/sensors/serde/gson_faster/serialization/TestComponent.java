package com.fillmore_labs.kafka.sensors.serde.gson_faster.serialization;

import com.fillmore_labs.kafka.sensors.serde.gson.serialization.SensorStateGson;
import com.fillmore_labs.kafka.sensors.serde.gson.serialization.StateDurationGson;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

@Singleton
@Component(
    modules = {
      com.fillmore_labs.kafka.sensors.serde.gson.serialization.SerializationModule.class,
      SerializationModule.class
    })
public interface TestComponent {
  static TestComponent create() {
    return DaggerTestComponent.create();
  }

  @Named("faster")
  Deserializer<SensorStateGson> deserializer();

  Serializer<StateDurationGson> serializerDuration();

  @Named("faster")
  Deserializer<StateDurationGson> deserializerDuration();
}
