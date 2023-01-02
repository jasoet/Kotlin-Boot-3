package dev.jasoet.explore.repository

import dev.jasoet.explore.model.Post
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface PostRepository : CoroutineCrudRepository<Post, Int>


