package Patterns.fabric2;

public abstract class WeaponFactory {
    abstract Weapon createWeapon();

    public void  attackWithWeapon(){
        Weapon weapon = createWeapon();
        weapon.attack();
    }
}
