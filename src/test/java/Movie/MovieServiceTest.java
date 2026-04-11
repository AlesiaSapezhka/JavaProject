package Movie;

import ComplexTasks.Movie.Movie;
import ComplexTasks.Movie.MovieService;
import ComplexTasks.Movie.Rating;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest extends MovieService{

    @Test
    public void addValidRating() {
        MovieService service = new MovieService();
        assertEquals(service.returnAllMoviesWithRating().size(),0);
        service.addRatingToTheMovie(new Movie("Titanic"), new Rating<>(2));
        assertEquals(service.returnAllMoviesWithRating().size(),1);
    }
    @Test
    public void addInvalidRating() {
        MovieService service = new MovieService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.addRatingToTheMovie(new Movie("Titanic"), new Rating<>(-9));
        });
    }

    @Test
    public void countAverageGradeValid() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Titanic");
        service.addRatingToTheMovie(movie, new Rating<>(2));
        service.addRatingToTheMovie(movie, new Rating<>(8));

        assertEquals(service.countAverageGrade(movie),5);
    }

    @Test
    public void countAverageGradeInvalid() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Titanic");
        assertThrows(IllegalArgumentException.class, () -> {
            service.countAverageGrade(movie);
        });
    }

    @Test
    public void sortedMoviesByRatingTest() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Titanic");
        service.addRatingToTheMovie(movie, new Rating<>(2));
        service.addRatingToTheMovie(movie, new Rating<>(8));
        Movie movie1 = new Movie("Avatar");
        service.addRatingToTheMovie(movie1, new Rating<>(2));

        List<Map.Entry<Movie, Double>> expectedSortedList = List.of(
                Map.entry(movie, 5.0),
                Map.entry(movie1, 2.0)
        );
        List<Map.Entry<Movie, Double>>  actualSortedList = service.getSortedMoviesByRating();
        assertEquals(expectedSortedList,actualSortedList);
    }
}
