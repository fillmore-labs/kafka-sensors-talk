load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/json:__pkg__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/json/serialization",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@confluent_schema_registry//:kafka-json-schema-serializer",
        "@confluent_schema_registry//:kafka-schema-serializer",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
