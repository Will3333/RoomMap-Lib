package pro.wsmi.roommap.lib.api

class APIServerListReq : APIRequest
{
    companion object {
        const val REQ_PATH = APIRequest.API_PATH + "/servers"
    }

    override fun getReqPath(): String = REQ_PATH
}