package pro.wsmi.roommap.lib.api

interface APIRequest : APIMessage
{
    companion object {
        const val API_PATH = "/api"
    }

    abstract fun getReqPath() : String
}