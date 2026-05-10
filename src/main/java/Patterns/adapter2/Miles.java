package Patterns.adapter2;

public class Miles implements Distance {
    private double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getDistance() {
        return miles;
    }
}
