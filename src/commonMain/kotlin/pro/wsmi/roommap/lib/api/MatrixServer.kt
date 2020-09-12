package pro.wsmi.roommap.lib.api

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import pro.wsmi.kwsmilib.net.URL

@ExperimentalSerializationApi
@Serializable
data class MatrixServer (
    val name: String,
    @SerialName("api_url")
    val apiURL: URL,
    @SerialName("update_frequency")
    val updateFreq: Long = 3600000L
)