package com.dmb.user.infra.database.mappers

import com.dmb.user.domain.model.EmailVerificationToken
import com.dmb.user.infra.database.entities.EmailVerificationTokenEntity


fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}