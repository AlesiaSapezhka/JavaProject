package Patterns.adapter2;

public class MilesToKilometersAdapter {

    private Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    public double convertMilesToKilometers() {
        return miles.getDistance() * 1.60934;
    }
}
