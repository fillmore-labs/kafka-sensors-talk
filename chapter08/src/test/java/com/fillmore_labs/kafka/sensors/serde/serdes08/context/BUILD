load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "context",
    testonly = True,
    srcs = glob(["*.java"]),
    javacopts = [
        "-Xlint:-cast",
        "-AskipDefs=\\.Dagger",
    ],
    visibility = ["//chapter08/src/test/java/com/fillmore_labs/kafka/sensors/serde/serdes08:__pkg__"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/schema_store",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/serdes08",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
