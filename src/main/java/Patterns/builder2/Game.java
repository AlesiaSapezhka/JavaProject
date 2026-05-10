package Patterns.builder2;

public class Game {
    public static void main(String[] args) {
        GamePerson person1 = new GamePerson.PersonBuilder()
                .setDamage("kill")
                .setMagic("fly")
                .build();
        System.out.println(person1);
    }
}
