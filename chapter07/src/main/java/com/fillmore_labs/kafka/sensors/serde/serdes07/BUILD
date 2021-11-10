load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serdes07",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    visibility = ["//visibility:public"],
    deps = [
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/json",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/ion",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/mixin",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/proto",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
