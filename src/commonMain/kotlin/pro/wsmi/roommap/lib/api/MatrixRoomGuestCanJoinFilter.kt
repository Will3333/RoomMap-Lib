package pro.wsmi.roommap.lib.api

import kotlinx.serialization.Serializable

@Serializable
enum class MatrixRoomGuestCanJoinFilter
{
    NO_FILTER,
    CAN_JOIN,
    CAN_NOT_JOIN
}