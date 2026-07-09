package com.dmb.chirp.infra.database.mappers

import com.dmb.chirp.domain.models.Chat
import com.dmb.chirp.domain.models.ChatMessage
import com.dmb.chirp.domain.models.ChatParticipant
import com.dmb.chirp.infra.database.entities.ChatEntity
import com.dmb.chirp.infra.database.entities.ChatParticipantEntity


fun ChatEntity.toChat(lastMessage: ChatMessage? = null): Chat {
    return Chat(
        id = id!!,
        participants = participants.map {
            it.toChatParticipant()
        }.toSet(),
        creator = creator.toChatParticipant(),
        lastActivityAt = lastMessage?.createdAt ?: createdAt,
        createdAt = createdAt,
        lastMessage = lastMessage
    )
}

fun ChatParticipantEntity.toChatParticipant(): ChatParticipant {
    return ChatParticipant(
        userId = userId,
        username = username,
        email = email,
        profilePictureUrl = profilePictureUrl
    )
}