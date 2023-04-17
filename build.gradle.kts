plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example.approval"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("com.approvaltests:approvaltests:18.6.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}