package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class APIServerReq (
        @SerialName("server_id")
        val serverId: String
) : APIRequest
{
        companion object {
                const val REQ_PATH = APIRequest.API_PATH + "/server"
        }

        override fun getReqPath(): String = REQ_PATH
}