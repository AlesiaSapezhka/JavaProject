package ComplexTasks.Movie;

import java.util.Objects;

public class Movie {

    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        return "Movie{name='" + movieName + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieName, movie.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(movieName);
    }
}
