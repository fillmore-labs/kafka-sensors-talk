load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "context",
    testonly = True,
    srcs = glob(["*.java"]),
    javacopts = [
        "-Xlint:-cast",
        "-AskipDefs=\\.Dagger",
    ],
    visibility = ["//chapter04/src/test/java/com/fillmore_labs/kafka/sensors/serde/json:__pkg__"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/json",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
