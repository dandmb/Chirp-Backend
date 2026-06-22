package com.dmb.user.api.dto

import com.dmb.user.domain.model.UserId


data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean,
)
