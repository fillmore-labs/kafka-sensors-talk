load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "proto",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/proto/serialization:__pkg__",
        "//chapter07/src/test:__subpackages__",
    ],
    deps = [
        "//toolchain:checker",
        "@com_google_protobuf//:protobuf_java",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
