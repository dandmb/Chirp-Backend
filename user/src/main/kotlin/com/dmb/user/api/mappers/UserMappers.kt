package com.dmb.user.api.mappers

import com.dmb.user.api.dto.AuthenticatedUserDto
import com.dmb.user.api.dto.UserDto
import com.dmb.user.domain.model.AuthenticatedUser
import com.dmb.user.domain.model.User


fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}