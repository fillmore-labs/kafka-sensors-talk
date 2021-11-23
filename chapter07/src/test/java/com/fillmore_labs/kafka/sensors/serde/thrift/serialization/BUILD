load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/thrift",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/thrift/serialization",
        "//chapter07/src/main/thrift/fillmore_labs/kafka/sensors/thrift/v1",
        "//chapter07/src/test/thrift/fillmore_labs/kafka/sensors/thrift/v1",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
