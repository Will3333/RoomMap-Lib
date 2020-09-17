package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class APIRoomListReq (
        @SerialName("filtering_guest_can_join")
        val filteringGuestCanJoin: MatrixRoomGuestCanJoinFilter = MatrixRoomGuestCanJoinFilter.NO_FILTER,
        @SerialName("filtering_world_readable")
        val filteringWorldReadable: MatrixRoomWorldReadableFilter = MatrixRoomWorldReadableFilter.NO_FILTER,
        @SerialName("filtering_num_joined_members_is_greater_than_or_equal_to")
        val filteringNumJoinedMembersGTE: Int? = null,
        @SerialName("filtering_num_joined_members_is_lower_than_or_equal_to")
        val filteringNumJoinedMembersLTE: Int? = null,
        @SerialName("sorting_element")
        val sortingElement: MatrixRoomListSortingElement = MatrixRoomListSortingElement.NUM_JOINED_MEMBERS,
        @SerialName("descending_sort")
        val descendingSort: Boolean = true,
        @SerialName("start")
        val start: Int = 0,
        @SerialName("end")
        val end: Int? = null
) : APIRequest
{
    companion object {
        const val REQ_PATH = APIRequest.API_PATH + "/rooms"
    }

    override fun getReqPath(): String = REQ_PATH
}