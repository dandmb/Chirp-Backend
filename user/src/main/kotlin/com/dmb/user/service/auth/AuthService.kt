package com.dmb.user.service.auth


import com.dmb.user.domain.exception.UserAlreadyExistsException
import com.dmb.user.domain.model.User
import com.dmb.user.infra.database.entities.UserEntity
import com.dmb.user.infra.database.mappers.toUser
import com.dmb.user.infra.database.repositories.UserRepository
import com.dmb.user.infra.security.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    fun register(email: String, username: String, password: String): User {
        val user = userRepository.findByEmailOrUsername(
            email = email.trim(),
            username = username.trim()
        )
        if(user != null) {
            throw UserAlreadyExistsException()
        }

        val savedUser = userRepository.save(
            UserEntity(
                email = email.trim(),
                username = username.trim(),
                hashedPassword = passwordEncoder.encode(password) ?: ""
            )
        ).toUser()

        return savedUser
    }
}