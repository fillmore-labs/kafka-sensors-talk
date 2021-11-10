load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/proto/serialization",
        "//chapter07/src/main/proto/fillmore_labs/kafka/sensors/proto/v1",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/proto/serialization",
        "//chapter09/src/test/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@com_google_protobuf//:protobuf_java",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
