load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mapper",
    srcs = glob(["*.java"]),
    javacopts = [
        "-Amapstruct.suppressGeneratorTimestamp=true",
        "-AskipDefs=MapperImpl$$",
    ],
    visibility = [
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson:__pkg__",
    ],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/mapping",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/converter",
        "//chapter07/src/main/java/com/fillmore_labs/kafka/sensors/serde/gson/serialization",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_google_errorprone_error_prone_annotations",
    ],
)
