load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mapper",
    srcs = glob(["*.java"]),
    javacopts = [
        "-Amapstruct.suppressGeneratorTimestamp=true",
        "-AskipDefs=MapperImpl$$",
    ],
    visibility = [
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/reflect:__pkg__",
    ],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/mapping",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/reflect/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
