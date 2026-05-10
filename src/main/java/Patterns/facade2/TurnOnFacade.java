package Patterns.facade2;

public class TurnOnFacade {
    Light light;
    Conditioner conditioner;
    SecuritySystem securitySystem;

    public TurnOnFacade(Light light, SecuritySystem securitySystem, Conditioner conditioner) {
        this.light = light;
        this.securitySystem = securitySystem;
        this.conditioner = conditioner;
    }

    public void turnOnSystem(){
        light.turnOnLight();
        securitySystem.turnOnSystem();
        conditioner.turnOnConditioner();
    }
}
