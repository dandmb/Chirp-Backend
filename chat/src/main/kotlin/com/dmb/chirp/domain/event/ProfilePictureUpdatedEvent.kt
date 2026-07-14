package com.dmb.chirp.domain.event

import com.dmb.chirp.domain.type.UserId

data class ProfilePictureUpdatedEvent(
    val userId: UserId,
    val newUrl: String?
)