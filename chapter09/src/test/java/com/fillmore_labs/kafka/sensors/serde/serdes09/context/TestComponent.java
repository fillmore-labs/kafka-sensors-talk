package com.fillmore_labs.kafka.sensors.serde.serdes09.context;

import com.fillmore_labs.kafka.sensors.model.Reading;
import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.serde.confluent.common.SchemaRegistryModule;
import com.fillmore_labs.kafka.sensors.serde.serdes09.Serdes09Module;
import dagger.Component;
import dagger.Module;
import java.util.Map;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Serde;

@Singleton
@Component(modules = {TestComponent.TestModule.class})
public interface TestComponent {
  static TestComponent create() {
    return DaggerTestComponent.create();
  }

  @Named("encoding")
  Map<String, String> encodings();

  Map<String, Serde<Reading>> serdeMapReading();

  Map<String, Serde<SensorState>> serdeMap();

  Map<String, Serde<StateDuration>> serdeDurationMap();

  Parameters parameters();

  @Module(
      includes = {Serdes09Module.class, SchemaRegistryModule.class},
      subcomponents = SingleTestComponent.class)
  /* package */ abstract class TestModule {
    private TestModule() {}
  }
}
