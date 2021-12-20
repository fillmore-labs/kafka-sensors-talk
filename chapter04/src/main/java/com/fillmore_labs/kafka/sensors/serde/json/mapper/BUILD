load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mapper",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=MapperImpl$$"],
    visibility = [
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/json:__pkg__",
    ],
    deps = [
        "//chapter02/src/main/java/com/fillmore_labs/kafka/sensors/model",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/json/serialization",
        "//chapter03/src/main/java/com/fillmore_labs/kafka/sensors/serde/serializer/mapped",
        "//chapter04/src/main/java/com/fillmore_labs/kafka/sensors/serde/mapping",
        "//toolchain:checker",
        "//toolchain:dagger",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_google_errorprone_error_prone_annotations",
    ],
)
