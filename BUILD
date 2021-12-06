load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier")

alias(
    name = "kafka-sensors",
    actual = "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/app",
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
