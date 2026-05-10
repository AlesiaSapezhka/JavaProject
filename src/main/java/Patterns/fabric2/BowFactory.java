package Patterns.fabric2;

    public class BowFactory extends WeaponFactory{
        @Override
        Weapon createWeapon(){
            return new Bow();
        }
    }