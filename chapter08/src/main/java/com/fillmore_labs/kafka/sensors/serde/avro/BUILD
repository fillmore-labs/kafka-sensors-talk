load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "avro",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/reflect",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_avro_avro",
    ],
)
