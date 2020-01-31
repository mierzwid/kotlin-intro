plugins {
    kotlin("jvm") version "1.3.61"
}

group = "kotlin-intro"
version = "1.0-SNAPSHOT"

defaultTasks("test")

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.0")
    testImplementation("org.slf4j:slf4j-simple:1.7.5")
    testImplementation("org.slf4j:slf4j-api:1.6.4")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}