package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class APIRoomListReq (
        @SerialName("start")
        val start: Int = 0,
        @SerialName("end")
        val end: Int? = null,
        @SerialName("sorting_element")
        val sortingElement: MatrixRoomListSortingElement = MatrixRoomListSortingElement.NUM_JOINED_MEMBERS,
        @SerialName("descending_sort")
        val descendingSort: Boolean = false
) : APIRequest
{
    companion object {
        const val REQ_PATH = APIRequest.API_PATH + "/rooms"
    }

    override fun getReqPath(): String = REQ_PATH
}