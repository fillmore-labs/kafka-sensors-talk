load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "thrift",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift/mapper",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift/serialization",
        "//chapter07/src/main/thrift/fillmore_labs/kafka/sensors/thrift/v1",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
