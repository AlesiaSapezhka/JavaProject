package Patterns.fabric1;

public abstract class TransportFactory {

    abstract Transport createTransport();

    public void planRide() {
        Transport transport = createTransport();
        transport.ride();
    }
}
