import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.71"
    id("com.vanniktech.maven.publish") version "0.11.1"
    id("maven")
}

buildscript {
    // dokka requires a repository from which to download dokka-fatjar on demand
    configure(listOf(repositories, project.repositories)) {
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
    }
}

val awssdkVersion : String by ext
val awssdkService : String by ext
val GROUP : String by ext
val VERSION_NAME : String by ext

group = GROUP
version = VERSION_NAME
java.sourceCompatibility = JavaVersion.VERSION_1_8

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(platform("software.amazon.awssdk:bom:$awssdkVersion"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("software.amazon.awssdk:utils")
    implementation("software.amazon.awssdk:$awssdkService")
}
