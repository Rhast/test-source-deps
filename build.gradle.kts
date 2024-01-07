plugins {
    kotlin("jvm") version "1.9.21"
}

allprojects {
    group = "com.lerw"
    version = "1.0"

    repositories {
        mavenCentral()
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}