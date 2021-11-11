load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier", "buildifier_test")

alias(
    name = "kafka-sensors",
    actual = "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/app",
)

alias(
    name = "confluent-avro-demo",
    actual = "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/avro_demo:main",
)

alias(
    name = "bench10",
    actual = "//chapter10/src/main/java/com/fillmore_labs/kafka/sensors/bench10",
)

alias(
    name = "benchmark",
    actual = "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/benchmark",
)

buildifier(
    name = "lint_fix",
    lint_mode = "fix",
    lint_warnings = ["all"],
    mode = "fix",
)

buildifier_test(
    name = "lint_check",
    size = "small",
    srcs = glob([
        "**/*.bzl",
        "**/BUILD",
        "**/BUILD.*.bazel",
        "**/BUILD.bazel",
        "**/WORKSPACE",
        "**/WORKSPACE.*.bazel",
        "**/WORKSPACE.bazel",
    ]),
    lint_mode = "warn",
    lint_warnings = ["all"],
    mode = "diff",
)
