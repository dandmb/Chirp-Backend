package com.dmb.user.infra.database.mappers

import com.dmb.user.domain.model.User
import com.dmb.user.infra.database.entities.UserEntity


fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}