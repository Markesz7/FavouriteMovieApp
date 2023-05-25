package hu.bme.aut.favouritemovieapp

import jakarta.persistence.*

@Entity
data class Movie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val title: String,
    val releaseYear: Int,
    val genres: List<String>,
    val director: String,
    val movieRuntime: Int?,
    @Column(length = 1000)
    val plot: String?,
    val imdbRating: Float?
)
