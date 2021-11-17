load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.(Immutable|GsonAdapters)[A-Z][A-Za-z0-9]*$$"],
    visibility = [
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson_faster:__subpackages__",
        "//chapter11/src/test:__subpackages__",
    ],
    deps = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
