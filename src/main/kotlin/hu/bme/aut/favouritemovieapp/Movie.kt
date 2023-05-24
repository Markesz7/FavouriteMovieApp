package hu.bme.aut.favouritemovieapp

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("Movies")
data class Movie(
    @Id var id: Long?,
    val title: String,
    val year: Int,
    val genres: List<String>,
    val director: String,
    val runtime: Int?,
    val plot: String?,
    val imdbRating: Float?
)
