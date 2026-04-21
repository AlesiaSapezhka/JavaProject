package ComplexTasks.Movie;

public class Rating<T extends Number> {
    private final T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }

    public double getDoubleValue() {
        return rating.doubleValue();
    }

    @Override
    public String toString() {
        return "Rating{" + rating + '}';
    }
}
