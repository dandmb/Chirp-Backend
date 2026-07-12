package com.dmb.chirp.domain.event

import com.dmb.chirp.domain.type.ChatId
import com.dmb.chirp.domain.type.UserId

data class ChatParticipantLeftEvent(
    val chatId: ChatId,
    val userId: UserId
)