package pro.wsmi.roommap.lib.api

import kotlinx.serialization.Serializable

@Serializable
enum class MatrixRoomListSortingElement {
    NUM_JOINED_MEMBERS,
    SERVER_NAME,
    ROOM_NAME
}