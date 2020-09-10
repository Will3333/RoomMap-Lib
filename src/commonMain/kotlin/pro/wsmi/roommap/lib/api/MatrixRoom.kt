package pro.wsmi.roommap.lib.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatrixRoom (
    @SerialName("id")
    val roomId: String,
    val aliases: List<String>? = null,
    @SerialName("canonical_alias")
    val canonicalAlias: String? = null,
    val name: String? = null,
    @SerialName("num_joined_members")
    val numJoinedMembers: Int,
    val topic: String? = null,
    @SerialName("world_readable")
    val worldReadable: Boolean,
    @SerialName("guest_can_join")
    val guestCanJoin: Boolean,
    @SerialName("avatar_url")
    val avatarUrl: String? = null
)