package dev.jasoet.explore.repository

import dev.jasoet.explore.model.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author, Int>
