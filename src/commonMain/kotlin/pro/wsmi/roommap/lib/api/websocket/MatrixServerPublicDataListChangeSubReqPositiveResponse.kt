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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import pro.wsmi.roommap.lib.api.MatrixServerPublicData

@ExperimentalSerializationApi
@Serializable
@SerialName("matrix_server_public_data_list_change_subscription_request_positive_response")
@Suppress("unused")
data class MatrixServerPublicDataListChangeSubReqPositiveResponse (
    @SerialName("request_id")
    override val reqId: String,
    @SerialName("subscription_id")
    override val subId: String,
    @SerialName("servers")
    val servers : List<MatrixServerPublicData>
) : SubPositiveResponse