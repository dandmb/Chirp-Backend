package com.dmb.chirp.api.dto


import com.dmb.chirp.domain.type.ChatId
import com.dmb.chirp.domain.type.ChatMessageId
import com.dmb.chirp.domain.type.UserId
import java.time.Instant

data class ChatMessageDto(
    val id: ChatMessageId,
    val chatId: ChatId,
    val content: String,
    val createdAt: Instant,
    val senderId: UserId
)
