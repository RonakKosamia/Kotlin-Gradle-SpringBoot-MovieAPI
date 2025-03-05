package com.api.movies_api.controller

import com.api.movies_api.model.Movie
import com.api.movies_api.repository.MovieRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController(private val movieRepository: MovieRepository) {

    @GetMapping
    fun getMovies(): MutableList<Movie> = movieRepository.findAll()
    @PostMapping
    fun addMovie(@RequestBody movie: Movie): Movie = movieRepository.save(movie)
}