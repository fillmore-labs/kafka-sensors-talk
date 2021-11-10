package com.fillmore_labs.kafka.sensors.topology.context;

import static com.fillmore_labs.kafka.sensors.serde.json.JsonModule.JSON;

import com.fillmore_labs.kafka.sensors.model.Reading;
import com.fillmore_labs.kafka.sensors.model.SensorState;
import com.fillmore_labs.kafka.sensors.model.StateDuration;
import com.fillmore_labs.kafka.sensors.topology.TopologyModule;
import com.fillmore_labs.kafka.sensors.topology.TopologySettings;
import com.fillmore_labs.kafka.sensors.topology.server.EmbeddedKafka;
import dagger.Module;
import dagger.Provides;
import java.util.Properties;
import java.util.Random;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.TestInputTopic;
import org.apache.kafka.streams.TestOutputTopic;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.TopologyTestDriver;

@Module(includes = TopologyModule.class)
/* package */ public abstract class TestModule {

  private static final String APPLICATION_ID = "topology-test";
  private static final String PARTITIONS = "1";
  private static final String INPUT_TOPIC = "input-topic-";
  private static final String RESULT_TOPIC = "result-topic-";
  private static final String STORE_NAME = "duration-store-";

  private TestModule() {}

  @Provides
  @Singleton
  /* package */ static Properties configuration(EmbeddedKafka kafkaTestResource) {
    var settings = new Properties();
    settings.put(StreamsConfig.APPLICATION_ID_CONFIG, APPLICATION_ID);
    settings.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaTestResource.getBrokerList());
    settings.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.StringSerde.class.getName());
    settings.put(StreamsConfig.NUM_STREAM_THREADS_CONFIG, PARTITIONS);

    return settings;
  }

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
    var random = new Random().nextInt(10000);
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
