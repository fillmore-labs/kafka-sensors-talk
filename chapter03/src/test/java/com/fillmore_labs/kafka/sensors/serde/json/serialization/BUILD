load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/json/serialization",
        "//chapter03/src/test/java/com/fillmore_labs/kafka/sensors/helper/json",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:com_google_guava_guava",
        "@maven//:com_networknt_json_schema_validator",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
