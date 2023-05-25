package hu.bme.aut.favouritemovieapp.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Id is mandatory to update a movie")
class IdMandatoryException : RuntimeException("Id is missing from the movie")