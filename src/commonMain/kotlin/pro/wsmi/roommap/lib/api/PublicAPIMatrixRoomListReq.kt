/*
 * Copyright 2020 William Smith
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Suppress("unused")
data class PublicAPIMatrixRoomListReq (
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
) : PublicAPIRequest, APIRequestWithParameters
{
    companion object {
        const val REQ_PATH = PublicAPIRequest.PUBLIC_API_PATH + "/rooms"
        const val HTTP_METHOD = "POST"
    }

    override val reqPath: String
        get() = REQ_PATH
    override val httpMethod: String
        get() = HTTP_METHOD
}