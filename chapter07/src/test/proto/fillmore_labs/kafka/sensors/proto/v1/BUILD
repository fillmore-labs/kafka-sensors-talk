load("@rules_java//java:defs.bzl", "java_library", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

java_library(
    name = "v1",
    testonly = True,
    visibility = ["//chapter07/src/test:__subpackages__"],
    exports = [
        ":state_duration_java",
    ],
)

java_proto_library(
    name = "state_duration_java",
    deps = [":state_duration_proto"],
)

proto_library(
    name = "state_duration_proto",
    srcs = ["state_duration.proto"],
    strip_import_prefix = "/chapter07/src/test/proto",
    deps = [
        "//chapter07/src/main/proto/fillmore_labs/kafka/sensors/proto/v1:sensor_state_proto",
        "@com_google_protobuf//:duration_proto",
    ],
)
