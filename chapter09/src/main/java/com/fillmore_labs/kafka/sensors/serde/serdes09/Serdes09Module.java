package com.fillmore_labs.kafka.sensors.serde.serdes09;

import com.fillmore_labs.kafka.sensors.serde.avro.AvroModule;
import com.fillmore_labs.kafka.sensors.serde.confluent.ConfluentModule;
import com.fillmore_labs.kafka.sensors.serde.gson.GsonModule;
import com.fillmore_labs.kafka.sensors.serde.ion.IonModule;
import com.fillmore_labs.kafka.sensors.serde.json.JsonModule;
import com.fillmore_labs.kafka.sensors.serde.mixin.MixInModule;
import com.fillmore_labs.kafka.sensors.serde.proto.ProtoModule;
import com.fillmore_labs.kafka.sensors.serde.thrift.ThriftModule;
import dagger.Module;

@Module(
    includes = {
      AvroModule.class,
      ConfluentModule.class,
      GsonModule.class,
      IonModule.class,
      JsonModule.class,
      MixInModule.class,
      ProtoModule.class,
      ThriftModule.class,
    })
public abstract class Serdes09Module {
  private Serdes09Module() {}
}
