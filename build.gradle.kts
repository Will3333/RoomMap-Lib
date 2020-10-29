/*
 * Copyright 2020 William Smith
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

plugins {
    kotlin("multiplatform") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
    `maven-publish`
}

group = "pro.wsmi"
version = "0.1.1-beta"

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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$SERIALIZATION_VERSION")
                implementation("pro.wsmi:kwsmilib:$KWSMILIB_VERSION")
            }
        }
    }
}