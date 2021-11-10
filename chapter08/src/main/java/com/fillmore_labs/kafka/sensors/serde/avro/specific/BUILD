load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "specific",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter08/src/main/avro/com/fillmore_labs/kafka/sensors/avro",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific/mapper",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
