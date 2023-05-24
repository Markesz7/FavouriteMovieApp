package hu.bme.aut.favouritemovieapp

import org.springframework.web.bind.annotation.*

@RestController
class MovieController {
    @GetMapping("/")
    fun getAllMovies()
    {

    }

    @GetMapping("/{id}")
    fun getMovieById(@PathVariable("id") id: Long)
    {

    }

    @PostMapping("/")
    fun insertMovie(@RequestBody newMovie: Movie)
    {

    }

    @PutMapping("/")
    fun updateMovie(@RequestBody updatedMovie: Movie)
    {

    }

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable("id") id: Long)
    {

    }
}