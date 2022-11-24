package dev.jasoet.explore.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("authors")
data class Author(
    @Id @JsonIgnore
    val id: Int? = null,
    val name: String,
    val email: String,
    val username: String,
)
