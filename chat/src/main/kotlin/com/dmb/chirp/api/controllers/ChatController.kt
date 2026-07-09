package com.dmb.chirp.api.controllers

import com.dmb.chirp.api.dto.ChatDto
import com.dmb.chirp.api.dto.CreateChatRequest
import com.dmb.chirp.api.mappers.toChatDto
import com.dmb.chirp.api.util.requestUserId
import com.dmb.chirp.infra.database.service.ChatService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/chat")
class ChatController(
    private val chatService: ChatService
) {

    @PostMapping
    fun createChat(
        @Valid @RequestBody body: CreateChatRequest
    ): ChatDto {
        return chatService.createChat(
            creatorId = requestUserId,
            otherUserIds = body.otherUserIds.toSet()
        ).toChatDto()
    }
}