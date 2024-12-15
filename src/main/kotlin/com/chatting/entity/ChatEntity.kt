package com.chatting.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "chat")
class ChatEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    var sender: Long,

    var receiver: Long,

    var content: Long,

    var created_at: LocalDateTime,

    var isRead: Boolean
)