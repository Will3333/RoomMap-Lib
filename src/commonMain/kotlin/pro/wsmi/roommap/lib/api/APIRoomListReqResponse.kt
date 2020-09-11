package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIRoomListReqResponse (@SerialName("matrix_rooms") val matrixRooms: Map<MatrixServer, List<MatrixRoom>>) : APIResponse