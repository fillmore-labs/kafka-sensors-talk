load("@io_bazel_rules_scala//thrift:thrift.bzl", "thrift_library")
load("@io_bazel_rules_scala//twitter_scrooge:twitter_scrooge.bzl", "scrooge_java_library")
load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "v1",
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift:__subpackages__",
        "//chapter07/src/test:__subpackages__",
    ],
    exports = [
        ":sensor_state_java",
        ":state_duration_java",
    ],
)

scrooge_java_library(
    name = "sensor_state_java",
    deps = [":sensor_state_thrift"],
)

scrooge_java_library(
    name = "state_duration_java",
    deps = [":state_duration_thrift"],
)

thrift_library(
    name = "sensor_state_thrift",
    srcs = ["sensor_state.thrift"],
    absolute_prefix = "chapter07/src/main/thrift",
    visibility = ["//chapter07/src/test/thrift:__subpackages__"],
)

thrift_library(
    name = "state_duration_thrift",
    srcs = ["state_duration.thrift"],
    absolute_prefix = "chapter07/src/main/thrift",
    deps = [":sensor_state_thrift"],
)
