load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "serialization",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Immutable[A-Z][A-Za-z0-9]*$$"],
    visibility = [
        "//chapter03/src/test:__subpackages__",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/json:__subpackages__",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/json:__subpackages__",
        "//chapter09/src/test:__subpackages__",
    ],
    deps = [
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/json",
        "//toolchain:checker",
        "//toolchain:dagger",
        "//toolchain:immutables",
        "@maven//:com_fasterxml_jackson_core_jackson_annotations",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_fasterxml_jackson_datatype_jackson_datatype_guava",
        "@maven//:com_fasterxml_jackson_datatype_jackson_datatype_jdk8",
        "@maven//:com_fasterxml_jackson_datatype_jackson_datatype_jsr310",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
