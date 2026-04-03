package practice5.Pets;

public class Dog extends Pets implements Walkable {
        @Override
        public void walk() {
            System.out.println("Собака гуляет");
        }

        @Override
        public void eat() {
            System.out.println("Собака ест сухой корм");
        }
    }
