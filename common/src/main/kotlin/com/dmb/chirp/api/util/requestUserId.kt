package com.dmb.chirp.api.util


import com.dmb.chirp.domain.exception.UnauthorizedException
import com.dmb.chirp.domain.type.UserId
import org.springframework.security.core.context.SecurityContextHolder

val requestUserId: UserId
    get() = SecurityContextHolder.getContext().authentication?.principal as? UserId
        ?: throw UnauthorizedException()