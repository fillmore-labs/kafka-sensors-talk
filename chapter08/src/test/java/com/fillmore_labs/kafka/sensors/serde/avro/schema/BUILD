load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    deps = [
        "//chapter08/src/main/avro/com/fillmore_labs/kafka/sensors/avro",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic/serialization",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/reflect/serialization",
        "//toolchain:checker",
        "//toolchain:test",
        "@maven//:com_google_testparameterinjector_test_parameter_injector",
        "@maven//:org_apache_avro_avro",
    ],
)
