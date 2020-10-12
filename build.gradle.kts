plugins {
    kotlin("multiplatform") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
    `maven-publish`
}

group = "pro.wsmi"
version = "0.1.0"

val SERIALIZATION_VERSION = "1.0.0"
val KWSMILIB_VERSION = "0.10.0"

repositories {
    mavenCentral()
    jcenter()
    mavenLocal()
}

kotlin {

    jvm()
    js().browser()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$SERIALIZATION_VERSION")
                implementation("pro.wsmi:kwsmilib:$KWSMILIB_VERSION")
            }
        }
    }
}