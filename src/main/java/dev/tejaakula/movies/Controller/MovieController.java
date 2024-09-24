package dev.tejaakula.movies.Controller;

import dev.tejaakula.movies.Model.Movies;
import dev.tejaakula.movies.Service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    private ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    private ResponseEntity<Optional<Movies>> getMovie(@PathVariable ObjectId id){
        return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
    }
    @GetMapping("/imdb/{imdbId}")
    private ResponseEntity<Optional<Movies>> getMovieByImdb(@PathVariable String imdbId){
        return new ResponseEntity<>(movieService.getMoviebyImdbId(imdbId), HttpStatus.OK);
    }
}
