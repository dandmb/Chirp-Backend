package com.dmb.user.api.util

import com.dmb.user.domain.exception.UnauthorizedException
import com.dmb.user.domain.model.UserId
import org.springframework.security.core.context.SecurityContextHolder

val requestUserId: UserId
    get() = SecurityContextHolder.getContext().authentication?.principal as? UserId
        ?: throw UnauthorizedException()