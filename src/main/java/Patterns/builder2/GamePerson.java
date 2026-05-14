package Patterns.builder2;

public class GamePerson {
    int health;
    int damage;
    int armor;
    int magic;

    public GamePerson(int health, int damage, int armor, int magic) {
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
        int health;
        int damage;
        int armor;
        int magic;

        public PersonBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public PersonBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public PersonBuilder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public PersonBuilder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        public GamePerson build(){
            return new GamePerson(this);
        }
    }
}
