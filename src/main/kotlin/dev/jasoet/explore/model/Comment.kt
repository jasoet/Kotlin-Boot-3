package dev.jasoet.explore.model

import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("comments")
data class Comment(
    val name: String,
    val content: String,
    val publishedAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
