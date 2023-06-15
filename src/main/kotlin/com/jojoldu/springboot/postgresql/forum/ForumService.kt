package com.jojoldu.springboot.postgresql.forum

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class ForumService {

    @PersistenceContext
    private val entityManager: EntityManager? = null

    @Transactional
    fun newPost(title: String?, vararg tags: String?): Post {
        val post = Post()
        post.setTitle(title)
        post.getTags().addAll(
            entityManager!!.createQuery(
                """
                select t
                from Tag t
                where t.name in :tags
                
                """.trimIndent(), Tag::class.java
            )
                .setParameter("tags", Arrays.asList<String>(*tags))
                .getResultList()
        )
        entityManager.persist(post)
        return post
    }

    @Transactional(readOnly = true)
    fun findAllPostsByTitle(title: String?): List<Post> {
        return entityManager!!.createQuery(
            """
            select p
            from Post p
            where p.title = :title
            
            """.trimIndent(), Post::class.java
        )
            .setParameter("title", title)
            .getResultList()
    }


}
