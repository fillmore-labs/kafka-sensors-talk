load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter08/src/main/avro/com/fillmore_labs/kafka/sensors/avro",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/logicaltypes",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
