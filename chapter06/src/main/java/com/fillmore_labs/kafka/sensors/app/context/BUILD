load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "context",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    visibility = ["//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/app:__pkg__"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/json",
        "//chapter05/src/main/java/com/fillmore_labs/kafka/sensors/topology",
        "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/configuration",
        "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/lifecycle",
        "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/streams",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:io_helidon_config_helidon_config",
        "@maven//:org_apache_kafka_kafka_clients",
        "@maven//:org_apache_kafka_kafka_streams",
    ],
)
