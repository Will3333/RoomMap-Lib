package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalSerializationApi
@Serializable
data class APIRoomListReqResponse (override val id: Long, @SerialName("matrix_rooms") val matrixRooms: Map<MatrixServer, MatrixRoom>) : APIResponse