load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/proto:__pkg__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter07/src/main/proto/fillmore_labs/kafka/sensors/proto/v1",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@com_google_protobuf//:protobuf_java",
        "@confluent_schema_registry//:kafka_protobuf_serializer",
        "@confluent_schema_registry//:kafka_schema_serializer",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
