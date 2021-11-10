load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "confluent",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/generic",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/json",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/proto",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/reflect",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/specific",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
    ],
)
