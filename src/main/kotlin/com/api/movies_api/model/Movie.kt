package com.api.movies_api.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "movies")
data class Movie(
    @Id val id: String? = null,
    val title: String,
    val rating: Double,
    val releaseYear: Int
)

