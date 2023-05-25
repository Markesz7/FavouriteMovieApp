package hu.bme.aut.favouritemovieapp

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MovieService(val db: MovieRepository) {
    fun getAllMovies(): List<Movie> = db.findAll().toList()

    // Uses findByIdOrNull kotlin extension function instead of findById
    fun getMovieById(id: Long): Movie? = db.findByIdOrNull(id)

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
}