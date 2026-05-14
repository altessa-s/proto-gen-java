plugins {
    `java-library`
    `maven-publish`
}

group = "io.altessa"

// Version: PROTO_VERSION env (set by proto-publish.yml on tag); fall back
// to `git describe --tags`; finally to 0.0.0-SNAPSHOT for local builds.
version = run {
    val envVersion = System.getenv("PROTO_VERSION")
    if (!envVersion.isNullOrBlank()) {
        envVersion.removePrefix("v")
    } else {
        val gitDescribe = providers.exec {
            commandLine("git", "describe", "--tags", "--always", "--dirty")
            isIgnoreExitValue = true
        }.standardOutput.asText.get().trim().removePrefix("v")
        if (gitDescribe.isBlank()) "0.0.0-SNAPSHOT" else gitDescribe
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.protobuf:protobuf-java:4.34.1")
    api("io.grpc:grpc-stub:1.68.1")
    api("io.grpc:grpc-protobuf:1.68.1")
    api("io.grpc:grpc-api:1.68.1")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "proto-gen-java"
            pom {
                name.set("proto-gen-java")
                description.set("Generated Java bindings for the altessa-s/proto schemas.")
                url.set("https://github.com/altessa-s/proto-gen-java")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/altessa-s/proto-gen-java")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
