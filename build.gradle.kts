import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.71"
}

val awssdkVersion : String by ext
val awssdkService : String by ext

group = "net.highteq.cylab"
version = "${awssdkVersion}-ALPHA"
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
