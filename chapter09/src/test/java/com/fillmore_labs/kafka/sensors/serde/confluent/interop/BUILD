load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/interop",
        "//chapter09/src/test/java/com/fillmore_labs/kafka/sensors/serde/confluent/common",
        "//chapter09/src/test/java/com/fillmore_labs/kafka/sensors/serde/confluent/interop/context",
        "//toolchain:checker",
        "//toolchain:mockito",
        "//toolchain:test",
        "@confluent_schema_registry//:kafka_schema_registry_client",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
        "@maven//:org_checkerframework_checker_util",
    ],
)
