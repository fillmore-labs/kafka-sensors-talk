load("//third_party/avro:rules_avro.bzl", "avro_java_library")

avro_java_library(
    name = "avro",
    srcs = glob(["*.avsc"]),
    javacopts = ["-XepDisableAllChecks"],
    strings = True,
    visibility = [
        "//chapter08/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific:__subpackages__",
        "//chapter08/src/test:__subpackages__",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/avro_demo:__pkg__",
        "//chapter09/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/specific:__subpackages__",
        "//chapter09/src/test:__subpackages__",
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/avro/specific_faster:__subpackages__",
        "//chapter11/src/main/java/com/fillmore_labs/kafka/sensors/serde/confluent/specific_faster:__subpackages__",
    ],
)
