package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIRoomListReqResponse (
    @SerialName("servers")
    val servers : List<MatrixServer>,
    @SerialName("rooms")
    val rooms: Map<String, List<MatrixRoom>>
) : APIResponse