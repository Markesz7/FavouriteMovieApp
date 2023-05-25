package hu.bme.aut.favouritemovieapp

import hu.bme.aut.favouritemovieapp.exception.IdMandatoryException
import hu.bme.aut.favouritemovieapp.exception.MovieNotFoundException
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class MovieController(val movieService: MovieService) {

    @GetMapping("/")
    fun getAllMovies(): List<Movie> = movieService.getAllMovies()

    @GetMapping("/{id}")
    fun getMovieById(@PathVariable("id") id: Long): Movie = movieService.getMovieById(id) ?: throw MovieNotFoundException(id)

    @PostMapping("/")
    fun insertMovie(@RequestBody newMovie: Movie): Movie = movieService.insertMovie(newMovie)

    @PutMapping("/")
    fun updateMovie(@RequestBody updatedMovie: Movie)
    {
        if(updatedMovie.id == null)
            throw IdMandatoryException()

        movieService.getMovieById(updatedMovie.id!!) ?: throw MovieNotFoundException(updatedMovie.id!!)
        movieService.updateMovie(updatedMovie)
    }

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable("id") id: Long)
    {
        movieService.deleteMovie(id)
    }
}