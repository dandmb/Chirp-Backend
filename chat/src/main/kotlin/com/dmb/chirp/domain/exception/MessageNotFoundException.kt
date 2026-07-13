package com.dmb.chirp.domain.exception

import com.dmb.chirp.domain.type.ChatMessageId


class MessageNotFoundException(
    private val id: ChatMessageId
): RuntimeException(
    "Message with ID $id not found"
)