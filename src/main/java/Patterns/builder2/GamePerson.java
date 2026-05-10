package Patterns.builder2;

public class GamePerson {
    String health;
    String damage;
    String armor;
    String magic;

    public GamePerson(String health, String damage, String armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }
    public GamePerson(PersonBuilder personBuilder) {
        this.health = personBuilder.health;
        this.damage = personBuilder.damage;
        this.armor = personBuilder.armor;
        this.magic = personBuilder.magic;
    }
    @Override
    public String toString() {
        return "Gamer characteristics: " + " health: " + this.health + " damage: " + this.damage +  " armor: " + this.armor + " magic: " + this.magic;
    }
    static class PersonBuilder{
        String health;
        String damage;
        String armor;
        String magic;

        public PersonBuilder setHealth(String health) {
            this.health = health;
            return this;
        }

        public PersonBuilder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public PersonBuilder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public PersonBuilder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public GamePerson build(){
            return new GamePerson(this);
        }
    }
}
