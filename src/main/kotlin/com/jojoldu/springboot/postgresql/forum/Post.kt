package com.jojoldu.springboot.postgresql.forum

import jakarta.persistence.*

@Entity
class Post () {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column
    var name: String = "",

    @Column
    var age: Int = 0,

    @Column
    var content: String = ""

    constructor(id: Long, name: String, age: Int) : this() {
        this.id = id
        this.name = name
        this.age = age
    }
}
