package hu.bme.aut.favouritemovieapp

data class Movie(
    val id: Long,
    val title: String,
    val year: Int,
    val genres: List<String>,
    val director: String,
    val runtime: Int?,
    val plot: String?,
    val imdbRating: Float?
)
