package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIServerReqResponse (
        @SerialName("server_id")
        val serverId: String,
        @SerialName("server")
        val server: MatrixServer
) : APIResponse