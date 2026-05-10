package Patterns.fabric1;

public class BicycleFactory extends TransportFactory {

    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
