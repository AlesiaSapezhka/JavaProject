package Patterns.fabric1;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = null;
        String transportType = "car"; // Тип может быть основан на входных данных или конфигурации

        if ("bicycle".equals(transportType)) {
            transportFactory = new BicycleFactory();
        } else if ("car".equals(transportType)) {
            transportFactory = new CarFactory();
        }
        transportFactory.planRide();
    }
}
