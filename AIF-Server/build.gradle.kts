import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion = "1.3.21"
val grpcVersion = "1.19.0"
val ktorVersion = "1.1.3"

plugins {
    java
    idea
    application
    kotlin("jvm") version "1.3.21"
    id("com.google.protobuf") version "0.8.8"
    id("com.github.johnrengelman.shadow") version "4.0.3"
}

group = "aiflagship"
version = "1.0.1"

application {
    mainClassName = "MainKt"
}

repositories {
    mavenCentral()
    jcenter()
    maven("https://plugins.gradle.org/m2/")
    maven("https://dl.bintray.com/kotlin/ktor")
    maven("http://repo.spring.io/milestone")

}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.protobuf", "protobuf-java", "3.7.0")
    implementation("com.google.guava", "guava", "27.0.1-jre")

    implementation("io.grpc", "grpc-netty-shaded", grpcVersion)
    implementation("io.grpc", "grpc-protobuf", grpcVersion)
    implementation("io.grpc", "grpc-stub", grpcVersion)

    implementation("com.google.api-client", "google-api-client", "1.23.0")
    implementation("com.google.oauth-client", "google-oauth-client-jetty", "1.23.0")
    implementation("com.google.apis", "google-api-services-calendar", "v3-rev305-1.23.0")

    implementation("io.projectreactor", "reactor-core", "3.2.6.RELEASE")

    implementation("io.ktor", "ktor-server-core", ktorVersion)
    implementation("io.ktor", "ktor-server-netty", ktorVersion)
    implementation("io.ktor", "ktor-html-builder", ktorVersion)

    implementation("javax.annotation", "javax.annotation-api", "1.3.1")
}

sourceSets {
    this["main"].proto {
        srcDir("../protos")
    }
    this["main"].java {
        srcDirs(
            "build/generated/source/proto/main/grpc",
            "build/generated/source/proto/main/java"
        )
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.7.0"
    }

    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc")
            }
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<ShadowJar> {
    destinationDir = file("../")
    baseName = "aif-demo-server"
    classifier = ""

}