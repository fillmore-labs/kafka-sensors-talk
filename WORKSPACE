workspace(name = "com_fillmore_labs_kafka_sensors_talk")

register_toolchains("//toolchain:toolchain_java17_definition")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "66ffd9315665bfaafc96b52278f57c7e2dd09f5ede279ea6d39b2be471e7e3aa",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.4.2/bazel-skylib-1.4.2.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.4.2/bazel-skylib-1.4.2.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "16e9fca53ed6bd4ff4ad76facc9b7b651a89db1689a2877d6fd7b82aa824e366",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.34.0/rules_go-v0.34.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.34.0/rules_go-v0.34.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "efbbba6ac1a4fd342d5122cbdfdb82aeb2cf2862e35022c752eaddffada7c3f3",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.27.0/bazel-gazelle-v0.27.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.27.0/bazel-gazelle-v0.27.0.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "66bfdf8782796239d3875d37e7de19b1d94301e8972b3cbd2446b332429b4df1",
    strip_prefix = "rules_proto-4.0.0",
    urls = [
        "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
    ],
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "7d688f4af01570718d3908c3379a314117c900fd106e0cb3a004a04e4c018b4a",
    strip_prefix = "protobuf-3.21.12",
    url = "https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.21.12.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "8ac1c5c2a8681c398883bb2cabc18f913337f165059f24e8c55714e05757761e",
    strip_prefix = "rules_jvm_external-5.3",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/5.3.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "31dac610fe73d7211ea2083540d085a8f8b582ac8afc3f449173309eda7fc7df",
    strip_prefix = "rules_scala-b17e9e0580ba28f95559676dd88cd99ec4f08195",
    url = "https://github.com/bazelbuild/rules_scala/archive/b17e9e0580ba28f95559676dd88cd99ec4f08195.tar.gz",
)

http_archive(
    name = "com_google_dagger",
    sha256 = "764b5a3d42d162869b2da3cf5fbf153ccd46475970c37349c4f5dd56bb4534e1",
    strip_prefix = "dagger-dagger-2.41",
    url = "https://github.com/google/dagger/archive/dagger-2.41.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "42968f9134ba2c75c03bb271bd7bb062afb7da449f9b913c96e5be4ce890030a",
    strip_prefix = "buildtools-6.3.3",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/v6.3.3.tar.gz",
)

http_archive(
    name = "google_bazel_common",
    sha256 = "0de64d8ab5bfa70fc106597bf78cb7380b523647b3ca4a75bdb077902dae90c3",
    strip_prefix = "bazel-common-c805fdbef7a7927606a2a48e08683952f58a2b71",
    url = "https://github.com/google/bazel-common/archive/c805fdbef7a7927606a2a48e08683952f58a2b71.tar.gz",
)

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.17.7")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

# ---

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

bind(
    name = "error_prone_annotations",
    actual = "@maven//:com_google_errorprone_error_prone_annotations",
)

bind(
    name = "gson",
    actual = "@maven//:com_google_code_gson_gson",
)

bind(
    name = "guava",
    actual = "@maven//:com_google_guava_guava",
)

bind(
    name = "jsr305",
    actual = "@maven//:com_google_code_findbugs_jsr305",
)

bind(
    name = "j2objc_annotations",
    actual = "@maven//:com_google_j2objc_j2objc_annotations",
)

# ---

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# ---

bind(
    name = "io_bazel_rules_scala/dependency/scala/guava",
    actual = "@maven//:com_google_guava_guava",
)

bind(
    name = "io_bazel_rules_scala/dependency/thrift/javax_annotation_api",
    actual = "@maven//:jakarta_annotation_jakarta_annotation_api",
)

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.8")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.8",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
            "sha256": "b248cb6f390ee8bceb912af3da471146fdf003702a173d750f986b1d4a3362e6",
        },
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.8",
            "sha256": "a0882b82514190c2bac7d1a459872a75f005fc0f3e88b2bc0390367146e35db7",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.8",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
            "sha256": "fdfbcc92e87f424578b303bcb47e0f55fee990c4b6da0006c9e75879d1e442e4",
        },
    },
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains", "scala_register_unused_deps_toolchains")

scala_register_toolchains()

load("@io_bazel_rules_scala//twitter_scrooge:twitter_scrooge.bzl", "twitter_scrooge")

twitter_scrooge(libthrift = "@maven//:org_apache_thrift_libthrift")

scala_register_unused_deps_toolchains()

# ---

load("@com_google_dagger//:workspace_defs.bzl", "DAGGER_ARTIFACTS")

# ---

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()

# ---

load("//third_party/avro:defs.bzl", "AVRO_ARTIFACTS", "avro_repositories")

avro_repositories()

# ---

load("//third_party/confluent:defs.bzl", "CONFLUENT_ARTIFACTS", "confluent_repositories")

confluent_repositories()

# ---

load("//third_party/async_profiler:defs.bzl", "async_profiler_repositories")

async_profiler_repositories()

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("//toolchain:defs.bzl", "testonly_artifacts")

maven_install(
    artifacts = [
        "com.amazon.ion:ion-java:1.10.5",
        "com.fasterxml.jackson.core:jackson-annotations:2.15.2",
        "com.fasterxml.jackson.core:jackson-core:2.15.2",
        "com.fasterxml.jackson.core:jackson-databind:2.15.2",
        "com.fasterxml.jackson.datatype:jackson-datatype-guava:2.15.2",
        "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.15.2",
        "com.fasterxml.jackson.datatype:jackson-datatype-joda:2.15.2",
        "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.2",
        "com.fasterxml.jackson.module:jackson-module-blackbird:2.15.2",
        "com.fasterxml.jackson.module:jackson-module-parameter-names:2.15.2",
        "com.google.code.findbugs:jsr305:3.0.2",
        "com.google.code.gson:gson:2.10.1",
        "com.google.errorprone:error_prone_annotations:2.22.0",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:32.1.2-jre",
        "com.google.j2objc:j2objc-annotations:2.8",
        "info.picocli:picocli:4.7.5",
        "io.helidon.config:helidon-config-object-mapping:3.2.2",
        "io.helidon.config:helidon-config-yaml:3.2.2",
        "io.helidon.config:helidon-config:3.2.2",
        "jakarta.annotation:jakarta.annotation-api:2.1.1",
        "javax.inject:javax.inject:1",
        "org.apache.kafka:kafka-clients:3.5.1",
        "org.apache.kafka:kafka-raft:3.5.1",
        "org.apache.kafka:kafka-streams:3.5.1",
        "org.apache.kafka:kafka_2.13:3.5.1",
        "org.apache.thrift:libthrift:0.19.0",
        "org.checkerframework:checker-qual:3.38.0",
        "org.checkerframework:checker-util:3.38.0",
        "org.checkerframework:checker:3.39.0",
        "org.immutables:gson:2.9.3",
        "org.immutables:value-annotations:2.9.3",
        "org.immutables:value-processor:2.9.3",
        "org.mapstruct:mapstruct-processor:1.5.5.Final",
        "org.mapstruct:mapstruct:1.5.5.Final",
        "org.openjdk.jmh:jmh-core:1.37",
        "org.openjdk.jmh:jmh-generator-annprocess:1.37",
        "org.slf4j:slf4j-api:2.0.9",
        "org.slf4j:slf4j-jdk14:2.0.9",
    ] + testonly_artifacts([
        "com.google.testparameterinjector:test-parameter-injector:1.8",
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth.extensions:truth-liteproto-extension:1.1.3",
        "com.google.truth.extensions:truth-proto-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "com.networknt:json-schema-validator:1.0.66",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.9",
        "org.apache.kafka:kafka-streams-test-utils:3.1.0",
        "org.mockito:mockito-core:4.3.1",
        "org.mockito:mockito-errorprone:4.3.1",
    ]) + DAGGER_ARTIFACTS + AVRO_ARTIFACTS + CONFLUENT_ARTIFACTS,
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    override_targets = {
        "com.google.protobuf:protobuf-java": "@com_google_protobuf//:protobuf_java",
        "com.google.protobuf:protobuf-java-util": "@com_google_protobuf//:protobuf_java_util",
        "javax.annotation:javax.annotation-api": ":jakarta_annotation_jakarta_annotation_api",
        "javax.servlet:javax.servlet-api": ":jakarta_servlet_jakarta_servlet_api",
        "javax.validation:validation-api": ":jakarta_validation_jakarta_validation_api",
        "javax.ws.rs:javax.ws.rs-api": ":jakarta_ws_rs_jakarta_ws_rs_api",
        "org.scala-lang:scala-library": "@io_bazel_rules_scala_scala_library",
        "org.scala-lang:scala-reflect": "@io_bazel_rules_scala_scala_reflect",
    },
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://repo.maven.apache.org/maven2",
        "https://maven-central-eu.storage-download.googleapis.com/maven2",
    ],
    strict_visibility = True,
)

# ---

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
