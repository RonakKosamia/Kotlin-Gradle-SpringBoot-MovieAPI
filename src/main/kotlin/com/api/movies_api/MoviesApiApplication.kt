package com.api.movies_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MoviesApiApplication

fun main(args: Array<String>) {
	runApplication<MoviesApiApplication>(*args)
}
