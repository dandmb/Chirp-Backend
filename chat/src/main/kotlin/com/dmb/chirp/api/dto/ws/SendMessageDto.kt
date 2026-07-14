package com.dmb.chirp.api.dto.ws

import com.dmb.chirp.domain.type.ChatId
import com.dmb.chirp.domain.type.ChatMessageId

data class SendMessageDto(
    val messageId: ChatMessageId? = null,
    val content: String,
    val chatId: ChatId
)