/*
 * Copyright 2020 William Smith
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package pro.wsmi.roommap.lib.api.websocket

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import pro.wsmi.roommap.lib.api.websocket.Notification.Companion.registerSubclasses
import pro.wsmi.roommap.lib.api.websocket.Request.Companion.registerSubclasses
import pro.wsmi.roommap.lib.api.websocket.Response.Companion.registerSubclasses

interface Message
{
    companion object
    {
        @Suppress("unused")
        const val API_PATH = "/websocket_api"

        @ExperimentalSerializationApi
        @Suppress("unused")
        val serializerModule = SerializersModule {
            polymorphic(Request::class) {
                registerSubclasses()
            }
            polymorphic(Response::class) {
                registerSubclasses()
            }
            polymorphic(Notification::class) {
                registerSubclasses()
            }
            polymorphic(Message::class) {
                subclass(GlobalError::class)
            }
        }
    }
}