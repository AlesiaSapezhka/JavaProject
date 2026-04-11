package ComplexTasks.Movie;

import ComplexTasks.Student.StudentGrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MovieService <T extends Number> {
    // Хранение оценок в Map<Movie, List<Rating>>.
    // Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на допустимость (например, оценка должна быть в пределах от 1 до 10).
    // Возможность расчета средней оценки для каждого фильма.
    Map<Movie, List<Rating<T>>> moviesRating = new HashMap<>();


    public Map<Movie, List<Rating<T>>> returnAllMoviesWithRating() {
        return Map.copyOf(moviesRating);
    }

    public synchronized void addRatingToTheMovie(Movie movie, Rating <T> rating) {

        if (rating == null || rating.getDoubleValue() < 1 || rating.getDoubleValue() > 10) {
            throw new IllegalArgumentException("Rating must be between 1 and 10");
        }

        moviesRating
                .computeIfAbsent(movie, m -> new ArrayList<>())
                .add(rating);
    }

    public double countAverageGrade(Movie movie) {

        List<Rating<T>> ratings = moviesRating.get(movie);

        if (ratings == null || ratings.isEmpty()) {
            throw new IllegalArgumentException("Ratings is empty");
        }

        double sum = ratings.stream()
                .mapToDouble(Rating::getDoubleValue)
                .sum();

        return sum / ratings.size();
    }


    // Используйте Stream API и лямбда-выражения для сортировки фильмов по средней оценке.
    // Метод sorted() с компаратором позволит отсортировать фильмы по убыванию или возрастанию средней оценки.
    public List<Map.Entry<Movie, Double>> getSortedMoviesByRating() {

        return moviesRating.entrySet().stream()
                .map(entry -> {
                    double avg = entry.getValue().stream()
                            .mapToDouble(Rating::getDoubleValue)
                            .average()
                            .orElse(0);

                    return Map.entry(entry.getKey(), avg);
                })
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .toList();
    }
}

