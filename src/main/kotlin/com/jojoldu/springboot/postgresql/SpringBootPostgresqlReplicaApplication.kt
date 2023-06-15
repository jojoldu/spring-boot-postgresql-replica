package com.jojoldu.springboot.postgresql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootPostgresqlReplicaApplication

fun main(args: Array<String>) {
	runApplication<SpringBootPostgresqlReplicaApplication>(*args)
}
