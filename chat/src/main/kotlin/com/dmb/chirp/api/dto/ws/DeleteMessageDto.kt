package com.dmb.chirp.api.dto.ws

import com.dmb.chirp.domain.type.ChatId
import com.dmb.chirp.domain.type.ChatMessageId


data class DeleteMessageDto(
    val chatId: ChatId,
    val messageId: ChatMessageId
)
