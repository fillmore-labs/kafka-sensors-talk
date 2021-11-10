load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    tags = ["small"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/serdes09",
        "//chapter09/src/test/java/com/fillmore_labs/kafka/sensors/serde/serdes09/context",
        "//toolchain:checker",
        "//toolchain:test",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
