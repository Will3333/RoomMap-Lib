package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIRoomListReqResponse (
    @SerialName("rooms")
    val rooms: List<MatrixRoom>,
    @SerialName("rooms_total_num")
    val roomsTotalNum: Int
) : APIResponse