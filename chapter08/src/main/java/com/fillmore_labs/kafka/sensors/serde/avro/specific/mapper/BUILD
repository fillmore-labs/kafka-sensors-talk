load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mapper",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=MapperImpl$$"],
    visibility = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific:__pkg__",
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific_faster/mapper:__pkg__",
    ],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/mapping",
        "//chapter08/src/main/avro/com/fillmore_labs/kafka/sensors/avro",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
