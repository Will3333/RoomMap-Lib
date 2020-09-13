package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIServerListReqResponse (
        @SerialName("servers")
        val servers : Map<String, MatrixServer>,
) : APIResponse