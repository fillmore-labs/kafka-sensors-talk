load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "generic",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/generic/mapper",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/generic/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
