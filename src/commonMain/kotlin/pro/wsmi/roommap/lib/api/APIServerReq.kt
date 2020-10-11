package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Suppress("unused")
data class APIServerReq (
        @SerialName("server_id")
        val serverId: String
) : APIRequestWithParameters
{
        companion object {
                const val REQ_PATH = APIRequest.API_PATH + "/server"
                const val HTTP_METHOD = "POST"
        }

        override val reqPath: String
                get() = REQ_PATH
        override val httpMethod: String
                get() = HTTP_METHOD
}