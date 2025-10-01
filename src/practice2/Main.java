package practice2;

public class Main {

    static void main(String[] args) {

        // Class Car
        Car bmw = new Car ("BMW", 2006);
        bmw.setYear(2015);
        bmw.print();

        // Class Rectangle
        Rectangle rectangle1 = new Rectangle(4, 7);
        rectangle1.setWidth(3);
        System.out.println("Value of rectangle area: " + rectangle1.calculateArea());

        // Class Book
        Book javaBasics = new Book ("Java Basics", "Joe Don");
        javaBasics.setTAuthor("Joe Don1");
        javaBasics.printInfo();

        // Class BankAccount
        BankAccount accountPeter = new BankAccount ("Peter", 2000.900);
        accountPeter.setDeposit(100);
        accountPeter.setWithdraw(50);
        accountPeter.printBalance();

        // Class Point
        Point coordinates = new Point (1,200);
        coordinates.setX(50);
        coordinates.print();

        // Class Student Group
        StudentGroup group12 = new StudentGroup("Group 12", 34);
        group12.setStudentCount(45);
        group12.printInfo();

        // Class Circle
        Circle circle1 = new Circle (8.9);
        circle1.setRadius(5);
        System.out.println("Value of circle area: " + circle1.calculateArea());
        System.out.println("Value of circle circumference: " + circle1.circleCircumference());

        // Class Teacher
        Teacher olga = new Teacher("Olga", "math");
        olga.setSubject("Math");
        olga.printInfo();

        // Class Product
        Product milk = new Product("Milk", 3);
        milk.setPrice(4);
        milk.applyDiscount(10);
        milk.printInfo();

        // Class Laptop
        Laptop mac = new Laptop("Apple", 23000);
        mac.setPrice(20000);
        mac.printInfo();
    }
}
