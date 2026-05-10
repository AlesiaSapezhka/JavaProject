package Patterns.fabric2;

public class GunFactory extends WeaponFactory{
    @Override
    Weapon createWeapon(){
        return new Gun();
    }
}
