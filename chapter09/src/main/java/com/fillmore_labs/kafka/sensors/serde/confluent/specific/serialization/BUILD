load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/specific:__pkg__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter08/src/main/avro/com/fillmore_labs/kafka/sensors/avro",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/confluent",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@confluent_schema_registry//:kafka-schema-serializer",
        "@confluent_schema_registry//:kafka-streams-avro-serde",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
