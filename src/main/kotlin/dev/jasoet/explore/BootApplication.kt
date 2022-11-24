package dev.jasoet.explore

import dev.jasoet.explore.model.Author
import dev.jasoet.explore.model.Comment
import dev.jasoet.explore.model.Post
import dev.jasoet.explore.repository.AuthorRepository
import dev.jasoet.explore.repository.PostRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jdbc.core.mapping.AggregateReference
import java.time.LocalDateTime

@SpringBootApplication
class BootApplication {

    @Bean
    fun commandLineRunner(
        authorRepository: AuthorRepository, postRepository: PostRepository
    ) = CommandLineRunner {
        val author = authorRepository.save(
            Author(
                name = "Jasoet Martohartono", email = "jasoet87@gmail.com", username = "jasoet"
            )
        )
        val post = Post(
            title = "Hello World",
            content = "Hello World",
            publishedAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            author = AggregateReference.to(author.id ?: 0)
        )

        post.addComment(
            Comment(
                name = "Jst",
                content = "Good Hello World",
                publishedAt = LocalDateTime.now(),
                updatedAt = LocalDateTime.now(),
            ),
            Comment(
                name = "Jst",
                content = "Another Hello World",
                publishedAt = LocalDateTime.now(),
                updatedAt = LocalDateTime.now(),
            )
        )

        postRepository.save(post)

        println("Hello, World!")
    }
}

fun main(args: Array<String>) {
    runApplication<BootApplication>(*args) {
        webApplicationType = WebApplicationType.NONE
    }
}

