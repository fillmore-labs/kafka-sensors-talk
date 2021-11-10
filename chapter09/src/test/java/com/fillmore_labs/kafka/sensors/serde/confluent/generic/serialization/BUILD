load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic/serialization",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/logicaltypes",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/generic/serialization",
        "//chapter09/src/test/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
