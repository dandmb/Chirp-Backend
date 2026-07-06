package com.dmb.user.domain.model

import java.util.UUID

import com.dmb.chirp.domain.type.UserId

data class User(
    val id: UserId,
    val username: String,
    val email: String,
    val hasEmailVerified: Boolean
)
