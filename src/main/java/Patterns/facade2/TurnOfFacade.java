package Patterns.facade2;

public class TurnOfFacade {

    Light light;
    Conditioner conditioner;
    SecuritySystem securitySystem;

    public TurnOfFacade(Light light, SecuritySystem securitySystem, Conditioner conditioner) {
        this.light = light;
        this.securitySystem = securitySystem;
        this.conditioner = conditioner;
    }

    public void turnOFSystem(){
        light.turnOffLight();
        securitySystem.turnOffSystem();
        conditioner.turnOffConditioner();
    }
}
