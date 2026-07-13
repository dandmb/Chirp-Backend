package com.dmb.chirp.domain.event

import com.dmb.chirp.domain.type.ChatId
import com.dmb.chirp.domain.type.ChatMessageId

data class MessageDeletedEvent(
    val chatId: ChatId,
    val messageId: ChatMessageId,
)
