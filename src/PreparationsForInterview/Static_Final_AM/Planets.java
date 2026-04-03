package PreparationsForInterview.Static_Final_AM;

public class Planets {
    //  Создай структуру, где для каждой планеты задана гравитационная константа.
    // На основе этих данных должен работать метод, который по массе и имени планеты возвращает вес объекта.
    // Пояснение: константы должны быть доступны без создания объекта и не меняться во время работы.

    public static final double EARTH_GRAVITY = 9.81;
    public static final double MARS_GRAVITY = 3.71;
    public static final double JUPITER_GRAVITY = 24.79;

    static double planetsWeight(double macca, String planetName){
        switch (planetName){
            case "Mars":
                return macca * MARS_GRAVITY;
            case "Jupiter":
                return macca * JUPITER_GRAVITY;
            case "Earth":
                return macca * EARTH_GRAVITY;
            default:
                return 0;
        }
    }
}
