package Patterns.adapter2;

public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(89.09);
        MilesToKilometersAdapter milesAdapter = new MilesToKilometersAdapter(miles);

        System.out.println(milesAdapter.convertMilesToKilometers());
    }

}
