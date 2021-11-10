load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "logicaltypes",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro:__subpackages__",
        "//chapter08/src/test:__subpackages__",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent:__subpackages__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//toolchain:checker",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:org_apache_avro_avro",
    ],
)
