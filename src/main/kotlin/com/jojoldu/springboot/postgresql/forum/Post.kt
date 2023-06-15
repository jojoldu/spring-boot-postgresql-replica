package com.jojoldu.springboot.postgresql.forum

import jakarta.persistence.*

@Entity
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column
    var name: String,

    @Column
    var age: Int,


)
