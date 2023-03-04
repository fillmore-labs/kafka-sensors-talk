""" Confluent dependencies. """

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

CONFLUENT_ARTIFACTS = [
    "com.github.erosb:everit-json-schema:1.14.0",
    "com.google.api.grpc:proto-google-common-protos:2.7.4",
    "com.kjetland:mbknor-jackson-jsonschema_2.13:1.0.39",
    "com.squareup.wire:wire-runtime:3.7.1",
    "com.squareup.wire:wire-schema:3.7.1",
    "io.swagger:swagger-annotations:1.6.5",
    "jakarta.servlet:jakarta.servlet-api:4.0.4",
    "jakarta.validation:jakarta.validation-api:2.0.2",
    "jakarta.ws.rs:jakarta.ws.rs-api:2.1.6",
    "org.jetbrains.kotlin:kotlin-stdlib:1.5.32",
    "org.json:json:20211205",
]

def confluent_repositories():
    http_archive(
        name = "confluent_common",
        build_file = "//third_party/confluent:BUILD.common.bazel",
        sha256 = "5544d5e7c1b605985fa9d12b4093bb15ff937f5e154809f71ea0766a6a36c28f",
        strip_prefix = "common-7.3.2",
        urls = ["https://github.com/confluentinc/common/archive/refs/tags/v7.3.2.tar.gz"],
    )
    http_archive(
        name = "confluent_schema_registry",
        build_file = "//third_party/confluent:BUILD.schema_registry.bazel",
        sha256 = "d655fd144d0bcf3d13cb427772b428f05b20e06c04ea17243d02f75d97028cfa",
        strip_prefix = "schema-registry-7.3.1",
        urls = ["https://github.com/confluentinc/schema-registry/archive/refs/tags/v7.3.1.tar.gz"],
    )
