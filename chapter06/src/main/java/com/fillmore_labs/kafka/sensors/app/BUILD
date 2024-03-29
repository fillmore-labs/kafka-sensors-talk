load("@rules_java//java:defs.bzl", "java_binary", "java_library")

DATA = [
    "//conf",
    "//conf:logging",
]

JVM_FLAGS = [
    "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
    "-Dorg.apache.avro.fastread=true",  # https://issues.apache.org/jira/browse/AVRO-2247
    "-Dorg.apache.avro.specific.use_custom_coders=true",  # https://issues.apache.org/jira/browse/AVRO-2090
    "-XX:+CrashOnOutOfMemoryError",
]

java_library(
    name = "app_library",
    srcs = glob(["*.java"]),
    data = [
        "//conf",
        "//conf:logging",
    ],
    visibility = ["//visibility:public"],
    runtime_deps = [
        "@maven//:com_google_flogger_flogger_system_backend",
        "@maven//:io_helidon_config_helidon_config_yaml",
        "@maven//:org_slf4j_slf4j_jdk14",
    ],
    deps = [
        "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/app/context",
        "//chapter06/src/main/java/com/fillmore_labs/kafka/sensors/lifecycle",
        "//toolchain:checker",
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_google_flogger_flogger",
        "@maven//:info_picocli_picocli",
        "@maven//:io_helidon_config_helidon_config",
    ],
)

java_binary(
    name = "app",
    data = DATA,
    jvm_flags = JVM_FLAGS,
    main_class = "com.fillmore_labs.kafka.sensors.app.Main",
    visibility = ["//visibility:public"],
    runtime_deps = [":app_library"],
)
