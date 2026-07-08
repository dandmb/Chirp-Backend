plugins {
    id("java-library")
    id("chirp.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "org.dmb"
version = "unspecified"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation(projects.common)
    testImplementation(kotlin("test"))
    implementation(libs.spring.boot.starter.amqp)
    implementation(libs.spring.boot.starter.thymeleaf)
    implementation(libs.spring.boot.starter.mail)
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}