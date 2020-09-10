plugins {
    kotlin("multiplatform") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
}

group = "pro.wsmi"
version = "0.1"

val SERIALIZATION_VERSION = "1.0.0-RC"
val KWSMILIB_VERSION = "0.6.0"

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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$SERIALIZATION_VERSION")
                implementation("pro.wsmi:kwsmilib:$KWSMILIB_VERSION")
            }
        }
    }
}