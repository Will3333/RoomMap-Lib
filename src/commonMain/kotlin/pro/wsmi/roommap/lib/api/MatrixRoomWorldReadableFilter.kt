package pro.wsmi.roommap.lib.api

import kotlinx.serialization.Serializable

@Serializable
enum class MatrixRoomWorldReadableFilter
{
    NO_FILTER,
    IS_WORLD_READABLE,
    IS_NOT_WORLD_READABLE
}