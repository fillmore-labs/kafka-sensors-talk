load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    deps = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/converter",
        "//toolchain:checker",
        "//toolchain:test",
    ],
)
