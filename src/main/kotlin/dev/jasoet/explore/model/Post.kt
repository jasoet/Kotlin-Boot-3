package dev.jasoet.explore.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.core.mapping.AggregateReference
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("posts")
data class Post(
    @Id @JsonIgnore val id: Int? = null,
    val title: String,
    val content: String,
    val publishedAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val author: AggregateReference<Author, Int>,
    @MappedCollection(idColumn = "post_id")
    val comments: MutableSet<Comment> = mutableSetOf(),
) {
    fun addComment(vararg comment: Comment) {
        comments.addAll(comment)
    }
}
