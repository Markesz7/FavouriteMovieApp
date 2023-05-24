package hu.bme.aut.favouritemovieapp

import org.springframework.stereotype.Service
import java.util.*

@Service
class MovieService(val db: MovieRepository) {
    fun getAllMovies(): List<Movie> = db.findAll().toList()

    fun getMovieById(id: Long): Optional<Movie> = db.findById(id)

    fun insertMovie(newMovie: Movie): Movie
    {
        if(newMovie.id != null)
            newMovie.id = null

        return db.save(newMovie)
    }

    fun updateMovie(updatedMovie: Movie)
    {
        db.save(updatedMovie)
    }

    fun deleteMovie(id: Long)
    {
        db.deleteById(id)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}