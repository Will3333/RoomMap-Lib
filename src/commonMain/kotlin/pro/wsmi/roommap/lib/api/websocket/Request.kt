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

import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

interface Request : Message
{
    val reqId: String

    companion object
    {
        @Suppress("unused")
        const val API_PATH = "/websocket_api"

        fun PolymorphicModuleBuilder<Request>.registerSubclasses()
        {
            subclass(MatrixRoomPublicDataListChangeSubReq::class)
            subclass(MatrixRoomTagPublicDataListChangeSubReq::class)
            subclass(MatrixServerPublicDataListChangeSubReq::class)
            subclass(UnsubReq::class)
        }
    }
}