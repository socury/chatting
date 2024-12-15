package com.chatting.repository

import com.chatting.entity.ChatEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ChatRepository: JpaRepository<ChatEntity, Long> {
    override fun findById(id:Long): Optional<ChatEntity>
    fun findBySender(sender:Long): Optional<ChatEntity>
    fun findByReceiver(receiver:Long): Optional<ChatEntity>
}