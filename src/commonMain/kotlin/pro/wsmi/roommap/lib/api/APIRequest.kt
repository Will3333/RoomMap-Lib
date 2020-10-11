package pro.wsmi.roommap.lib.api

interface APIRequest : APIMessage
{
    companion object {
        const val API_PATH = "/api"
    }

    val reqPath: String
    val httpMethod: String
}