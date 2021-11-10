load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mapper",
    srcs = glob(["*.java"]),
    visibility = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic:__pkg__",
    ],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/generic/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
    ],
)
