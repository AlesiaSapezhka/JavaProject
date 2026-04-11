package ComplexTasks.Movie;

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
}
