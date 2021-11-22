package com.fillmore_labs.kafka.sensors.topology.context;

import static com.fillmore_labs.kafka.sensors.serde.json.JsonModule.JSON;

import com.fillmore_labs.kafka.sensors.model.Reading;
import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.topology.TopologySettings;
import dagger.Module;
import dagger.Provides;
import java.util.Properties;
import java.util.Random;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.streams.TestInputTopic;
import org.apache.kafka.streams.TestOutputTopic;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.TopologyTestDriver;

@Module
public abstract class TestModule {
  private static final String INPUT_TOPIC = "input-topic-";
  private static final String RESULT_TOPIC = "result-topic-";
  private static final String STORE_NAME = "duration-store-";

  private TestModule() {}

  @Provides
  @Singleton
  /* package */ static TopologyTestDriver topologyTestDriver(Topology topology, Properties config) {
    return new TopologyTestDriver(topology, config);
  }

  @Provides
  @Singleton
  /* package */ static TestInputTopic<String, SensorState> inputTopic(
      TopologyTestDriver testDriver, TopologySettings settings) {
    return testDriver.createInputTopic(
        settings.inputTopic(), new StringSerializer(), settings.inputSerde().serializer());
  }

  @Provides
  @Singleton
  /* package */ static TestOutputTopic<String, StateDuration> resultTopic(
      TopologyTestDriver testDriver, TopologySettings settings) {
    return testDriver.createOutputTopic(
        settings.resultTopic(), new StringDeserializer(), settings.resultSerde().deserializer());
  }

  @Provides
  @Singleton
  /* package */ static TopologySettings topologySettings(
      @Named(JSON) Serde<SensorState> inputSerde,
      @Named(JSON) Serde<Reading> storeSerde,
      @Named(JSON) Serde<StateDuration> resultSerde) {
    var random = new Random().nextInt(10_000);
    var inputTopic = INPUT_TOPIC + random;
    var resultTopic = RESULT_TOPIC + random;
    var storeName = STORE_NAME + random;

    return TopologySettings.builder()
        .inputSerde(inputSerde)
        .inputTopic(inputTopic)
        .storeSerde(storeSerde)
        .storeName(storeName)
        .resultSerde(resultSerde)
        .resultTopic(resultTopic)
        .build();
  }
}
