package com.dmb.chirp.api.dto

import com.dmb.chirp.domain.type.UserId


data class ChatParticipantDto(
    val userId: UserId,
    val username: String,
    val email: String,
    val profilePictureUrl: String?
)
