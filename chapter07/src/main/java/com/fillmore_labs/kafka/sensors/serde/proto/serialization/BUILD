load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/proto:__subpackages__",
        "//chapter07/src/test:__subpackages__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/proto",
        "//chapter07/src/main/proto/fillmore_labs/kafka/sensors/proto/v1",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
