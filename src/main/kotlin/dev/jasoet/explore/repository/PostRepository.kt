package dev.jasoet.explore.repository

import dev.jasoet.explore.model.Post
import org.springframework.data.repository.CrudRepository

interface PostRepository : CrudRepository<Post, Int>


