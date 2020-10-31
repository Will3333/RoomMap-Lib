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

@Suppress("unused")
class MatrixRoomTagPublicDataListReq : PublicDataRequest
{
    companion object {
        const val REQ_PATH = PublicDataRequest.PUBLIC_API_PATH + "/tags"
        const val HTTP_METHOD = "GET"
    }

    override val reqPath: String
        get() = REQ_PATH
    override val httpMethod: String
        get() = HTTP_METHOD
}