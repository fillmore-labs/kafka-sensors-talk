load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/generic:__subpackages__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic/serialization",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/confluent",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@confluent_schema_registry//:kafka_schema_serializer",
        "@confluent_schema_registry//:kafka_streams_avro_serde",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
