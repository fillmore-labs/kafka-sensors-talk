load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "proto",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter07/src/main/proto/fillmore_labs/kafka/sensors/proto/v1",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/proto/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@com_google_protobuf//:protobuf_java",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
