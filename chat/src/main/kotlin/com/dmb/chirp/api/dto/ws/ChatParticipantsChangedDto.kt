package com.dmb.chirp.api.dto.ws

import com.dmb.chirp.domain.type.ChatId


data class ChatParticipantsChangedDto(
    val chatId: ChatId
)
