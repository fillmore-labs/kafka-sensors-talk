load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Dagger"],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/test/java/com/fillmore_labs/kafka/sensors/helper/json",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/mixin/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:test",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_networknt_json_schema_validator",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
