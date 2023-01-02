package dev.jasoet.explore.repository

import dev.jasoet.explore.model.Author
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface AuthorRepository : CoroutineCrudRepository<Author, Int>
