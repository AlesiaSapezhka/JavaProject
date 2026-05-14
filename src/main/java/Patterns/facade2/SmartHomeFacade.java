package Patterns.facade2;

public class SmartHomeFacade {
    Light light;
    Conditioner conditioner;
    SecuritySystem securitySystem;

    public SmartHomeFacade(Light light, SecuritySystem securitySystem, Conditioner conditioner) {
        this.light = light;
        this.securitySystem = securitySystem;
        this.conditioner = conditioner;
    }

    public void turnOffAll(){
        light.turnOffLight();
        securitySystem.turnOffSystem();
        conditioner.turnOffConditioner();
    }

    public void turnOnAll(){
        light.turnOnLight();
        securitySystem.turnOnSystem();
        conditioner.turnOnConditioner();
    }
}
