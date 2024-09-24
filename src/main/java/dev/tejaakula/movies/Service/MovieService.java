package dev.tejaakula.movies.Service;
import dev.tejaakula.movies.Model.Movies;
import dev.tejaakula.movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> getMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movies> getMoviebyImdbId(String imdbId){
        return movieRepository.findMoviesByImdbId(imdbId);
    }
}
