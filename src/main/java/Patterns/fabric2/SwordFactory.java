package Patterns.fabric2;

public class SwordFactory extends WeaponFactory{
    @Override
    Weapon createWeapon(){
        return new Sword();
    }
}
