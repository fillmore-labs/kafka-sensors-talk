load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter03/src/test/java/com/fillmore_labs/kafka/sensors/helper/json",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/converter",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson/serialization",
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson_faster/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
