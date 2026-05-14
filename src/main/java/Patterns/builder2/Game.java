package Patterns.builder2;

public class Game {
    public static void main(String[] args) {
        GamePerson person1 = new GamePerson.PersonBuilder()
                .setDamage(87)
                .setMagic(98)
                .build();
        System.out.println(person1);
    }
}
