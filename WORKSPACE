workspace(name = "com_fillmore_labs_kafka_sensors_talk")

register_toolchains("//toolchain:toolchain_java17_definition")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "af87959afe497dc8dfd4c6cb66e1279cb98ccc84284619ebfec27d9c09a903de",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.2.0/bazel-skylib-1.2.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.2.0/bazel-skylib-1.2.0.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "d6b2513456fe2229811da7eb67a444be7785f5323c6708b38d851d2b51e54d83",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.30.0/rules_go-v0.30.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.30.0/rules_go-v0.30.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "de69a09dc70417580aabf20a28619bb3ef60d038470c7cf8442fafcf627c21cb",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.24.0/bazel-gazelle-v0.24.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.24.0/bazel-gazelle-v0.24.0.tar.gz",
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
    sha256 = "af52e0f30b92404f2cb3e139f9cba162672b26a90d0454b6adc231f177a30f59",
    strip_prefix = "protobuf-a112c4ab9642b13b648b19d3a416cfcf9994f3fd",
    url = "https://github.com/protocolbuffers/protobuf/archive/a112c4ab9642b13b648b19d3a416cfcf9994f3fd.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "2cd77de091e5376afaf9cc391c15f093ebd0105192373b334f0a855d89092ad5",
    strip_prefix = "rules_jvm_external-4.2",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.2.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "715da897d36a0b25edee070c432faa55037be622255c9c03599418849e6cd5a9",
    strip_prefix = "rules_scala-3fe4b9f6417d62d80abe67fc20ff448840c0276b",
    url = "https://github.com/bazelbuild/rules_scala/archive/3fe4b9f6417d62d80abe67fc20ff448840c0276b.tar.gz",
)

http_archive(
    name = "com_google_dagger",
    sha256 = "f42ad246629eb127a56372a5ec2b2f977617dcefcf514c68a7a264c1fdd1bb82",
    strip_prefix = "dagger-dagger-2.40.5",
    url = "https://github.com/google/dagger/archive/dagger-2.40.5.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "",
    strip_prefix = "buildtools-4.2.4",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/4.2.4.tar.gz",
)

http_archive(
    name = "google_bazel_common",
    sha256 = "b4165070a44b3929513c4797d5dcc034916aeac105a3d30c840cf8dc0156117b",
    strip_prefix = "bazel-common-bf8e5ef95b118d1716b0cb4982cf15b6ed1c896f",
    url = "https://github.com/google/bazel-common/archive/bf8e5ef95b118d1716b0cb4982cf15b6ed1c896f.tar.gz",
)

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.17.5")

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

scala_config(scala_version = "2.13.7")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.7",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
            "sha256": "a450602f03a4686919e60d1aeced549559f1eaffbaf30ffa7987c8d97e3e79a9",
        },
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.7",
            "sha256": "a8bc08f3b9ff93d0496032bf2677163071b8d212992f41dbf04212e07d91616b",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.7",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
            "sha256": "a7bc4eca6970083d426a8d081aec313c7b7207d5f83b6724995e34078edc5cbb",
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
        "com.amazon.ion:ion-java:1.9.0",
        "com.fasterxml.jackson.core:jackson-annotations:2.13.1",
        "com.fasterxml.jackson.core:jackson-core:2.13.1",
        "com.fasterxml.jackson.core:jackson-databind:2.13.1",
        "com.fasterxml.jackson.datatype:jackson-datatype-guava:2.13.1",
        "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.13.1",
        "com.fasterxml.jackson.datatype:jackson-datatype-joda:2.13.1",
        "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.1",
        "com.fasterxml.jackson.module:jackson-module-blackbird:2.13.1",
        "com.fasterxml.jackson.module:jackson-module-parameter-names:2.13.1",
        "com.google.code.findbugs:jsr305:3.0.2",
        "com.google.code.gson:gson:2.8.9",
        "com.google.errorprone:error_prone_annotations:2.10.0",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:31.0.1-jre",
        "com.google.j2objc:j2objc-annotations:1.3",
        "info.picocli:picocli:4.6.2",
        "io.helidon.config:helidon-config-object-mapping:2.4.1",
        "io.helidon.config:helidon-config-yaml:2.4.1",
        "io.helidon.config:helidon-config:2.4.1",
        "jakarta.annotation:jakarta.annotation-api:1.3.5",
        "javax.inject:javax.inject:1",
        "org.apache.kafka:kafka-clients:3.0.0",
        "org.apache.kafka:kafka-raft:3.0.0",
        "org.apache.kafka:kafka-streams:3.0.0",
        "org.apache.kafka:kafka_2.13:3.0.0",
        "org.apache.thrift:libthrift:0.15.0",
        "org.checkerframework:checker-qual:3.21.1",
        "org.checkerframework:checker-util:3.21.1",
        "org.checkerframework:checker:3.21.1",
        "org.immutables:gson:2.9.0-rc1",
        "org.immutables:value-annotations:2.9.0-rc1",
        "org.immutables:value-processor:2.9.0-rc1",
        "org.mapstruct:mapstruct-processor:1.5.0.Beta2",
        "org.mapstruct:mapstruct:1.5.0.Beta2",
        "org.openjdk.jmh:jmh-core:1.34",
        "org.openjdk.jmh:jmh-generator-annprocess:1.34",
        "org.slf4j:slf4j-api:2.0.0-alpha5",
        "org.slf4j:slf4j-jdk14:2.0.0-alpha5",
    ] + testonly_artifacts([
        "com.google.testparameterinjector:test-parameter-injector:1.7",
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth.extensions:truth-liteproto-extension:1.1.3",
        "com.google.truth.extensions:truth-proto-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "com.networknt:json-schema-validator:1.0.65",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.8.2",
        "org.apache.kafka:kafka-streams-test-utils:3.0.0",
        "org.mockito:mockito-core:4.2.0",
        "org.mockito:mockito-errorprone:4.2.0",
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
