""" Apache Avro dependencies. """

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_file")

def avro_repositories():
    http_file(
        name = "avro_tools",
        sha256 = "ab158f4af8f767d2358a29d8678939b2a0f96017490acfb4e7ed0708cea07913",
        urls = ["https://archive.apache.org/dist/avro/avro-1.10.2/java/avro-tools-1.10.2.jar"],
    )

AVRO_ARTIFACTS = ["org.apache.avro:avro:1.10.2"]
