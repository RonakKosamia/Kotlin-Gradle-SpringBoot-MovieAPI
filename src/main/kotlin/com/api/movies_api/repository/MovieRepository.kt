package com.api.movies_api.repository

import com.api.movies_api.model.Movie
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository: MongoRepository<Movie, String>