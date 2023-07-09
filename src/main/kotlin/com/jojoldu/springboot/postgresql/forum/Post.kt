package com.jojoldu.springboot.postgresql.forum

import jakarta.persistence.*

@Entity
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column
    var age: Int = 0,

    @Column
    var content: String = ""
)
