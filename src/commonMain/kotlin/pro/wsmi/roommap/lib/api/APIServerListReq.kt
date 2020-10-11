package pro.wsmi.roommap.lib.api

@Suppress("unused")
class APIServerListReq : APIRequest
{
    companion object {
        const val REQ_PATH = APIRequest.API_PATH + "/servers"
        const val HTTP_METHOD = "GET"
    }

    override val reqPath: String
        get() = REQ_PATH
    override val httpMethod: String
        get() = HTTP_METHOD
}