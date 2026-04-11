package ComplexTasks.Movie;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MovieService<Integer> service = new MovieService<>();

        Movie m1 = new Movie("Movie");
        Movie m2 = new Movie("Titanic");

        service.addRatingToTheMovie(m1, new Rating<>(8));
        service.addRatingToTheMovie(m1, new Rating<>(10));
        service.addRatingToTheMovie(m2, new Rating<>(8));

        System.out.println(service.returnAllMoviesWithRating());
        System.out.println(service.getSortedMoviesByRating());
        System.out.println(service.countAverageGrade(m1));

    }
}
