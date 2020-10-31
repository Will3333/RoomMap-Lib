/*
 * Copyright 2020 William Smith
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package pro.wsmi.roommap.lib.api.http

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import pro.wsmi.kwsmilib.language.Language
import pro.wsmi.roommap.lib.api.*

@ExperimentalSerializationApi
@Serializable
@Suppress("unused")
data class MatrixRoomPublicDataListReq (
    @SerialName("guest_can_join_filtering")
    val guestCanJoinFiltering: MatrixRoomGuestCanJoinFilter = MatrixRoomGuestCanJoinFilter.NO_FILTER,
    @SerialName("world_readable_filtering")
    val worldReadableFiltering: MatrixRoomWorldReadableFilter = MatrixRoomWorldReadableFilter.NO_FILTER,
    @SerialName("num_joined_members_is_greater_than_or_equal_to_filtering")
    val numJoinedMembersGTEFiltering: Int? = null,
    @SerialName("num_joined_members_is_lower_than_or_equal_to_filtering")
    val numJoinedMembersLTEFiltering: Int? = null,
    @SerialName("server_filtering")
    val serverFiltering: Set<Int>? = null,
    @SerialName("language_filtering")
    val languageFiltering: Set<Language>? = null,
    @SerialName("tag_filtering")
    val tagFiltering: Set<String>? = null,
    @SerialName("element_sorting")
    val elementSorting: MatrixRoomListSortingElement = MatrixRoomListSortingElement.NUM_JOINED_MEMBERS,
    @SerialName("descending_sort")
    val descendingSort: Boolean = true,
    @SerialName("start")
    val start: Int = 0,
    @SerialName("end")
    val end: Int? = null
) : PublicDataRequest, RequestWithParameters
{
    companion object {
        const val REQ_PATH = PublicDataRequest.PUBLIC_API_PATH + "/rooms"
        const val HTTP_METHOD = "POST"
    }

    override val reqPath: String
        get() = REQ_PATH
    override val httpMethod: String
        get() = HTTP_METHOD
}