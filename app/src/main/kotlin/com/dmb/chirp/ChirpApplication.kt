package com.dmb.chirp

import com.dmb.user.infra.database.entities.UserEntity
import com.dmb.user.infra.database.repositories.UserRepository
import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.persistence.autoconfigure.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Component

@SpringBootApplication(scanBasePackages = ["com.dmb"])
@EnableJpaRepositories(basePackages = ["com.dmb"])
@EntityScan(basePackages = ["com.dmb"])
class ChirpApplication

fun main(args: Array<String>) {
	runApplication<ChirpApplication>(*args)
}

//@Component
//class Demo(
//	private val repository: UserRepository
//){
//	@PostConstruct
//	fun init(){
//		repository.save(
//			UserEntity(
//				email = "test@gmail.com",
//				username = "test",
//				hashedPassword = "test",
//			)
//		)
//	}
//}