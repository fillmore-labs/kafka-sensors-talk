load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    deps = [
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//toolchain:checker",
        "//toolchain:mockito",
        "//toolchain:test",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
