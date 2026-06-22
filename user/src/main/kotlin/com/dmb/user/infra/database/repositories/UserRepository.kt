package com.dmb.user.infra.database.repositories


import com.dmb.user.infra.database.entities.UserEntity
import com.dmb.user.domain.model.UserId
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}