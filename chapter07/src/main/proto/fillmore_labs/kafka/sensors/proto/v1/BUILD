load("@rules_java//java:defs.bzl", "java_library", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

java_library(
    name = "v1",
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/proto:__subpackages__",
        "//chapter07/src/test:__subpackages__",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/proto:__subpackages__",
        "//chapter09/src/test:__subpackages__",
    ],
    exports = [
        ":sensor_state_java",
        ":state_duration_java",
    ],
)

java_proto_library(
    name = "sensor_state_java",
    deps = [":sensor_state_proto"],
)

java_proto_library(
    name = "state_duration_java",
    deps = [":state_duration_proto"],
)

proto_library(
    name = "sensor_state_proto",
    srcs = ["sensor_state.proto"],
    strip_import_prefix = "/chapter07/src/main/proto",
    visibility = ["//chapter07/src/test/proto:__subpackages__"],
    deps = ["@com_google_protobuf//:timestamp_proto"],
)

proto_library(
    name = "state_duration_proto",
    srcs = ["state_duration.proto"],
    strip_import_prefix = "/chapter07/src/main/proto",
    deps = [
        ":sensor_state_proto",
        "@com_google_protobuf//:duration_proto",
    ],
)
