load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic/mapper",
        "//toolchain:checker",
        "//toolchain:test",
        "@maven//:com_google_testparameterinjector_test_parameter_injector",
        "@maven//:org_apache_avro_avro",
    ],
)
