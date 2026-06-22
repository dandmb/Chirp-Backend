package com.dmb.user.domain.exception

class InvalidCredentialsException: RuntimeException(
    "The entered credentials aren't valid"
)