package com.dmb.chirp.api.dto.ws

import com.dmb.chirp.domain.type.UserId

data class ProfilePictureUpdateDto(
    val userId: UserId,
    val newUrl: String?
)