load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "gson_faster",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson/serialization",
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson_faster/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
