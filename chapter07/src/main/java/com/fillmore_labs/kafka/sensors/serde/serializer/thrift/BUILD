load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "thrift",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift/serialization:__pkg__",
        "//chapter07/src/test:__subpackages__",
    ],
    deps = [
        "//toolchain:checker",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_kafka_kafka_clients",
        "@maven//:org_apache_thrift_libthrift",
    ],
)
