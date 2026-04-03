package practice3;

public class Main {

    // Class Company
    static void main(String[] args) {

        // Class Company
        Company ivanovPetr = new Company(456, "Ivanov Petr");
        Company petrovAlex = new Company(126, "Petrov Alex");
        ivanovPetr.printCompanyNameNotStatic(); // Old Company name
        petrovAlex.printCompanyNameNotStatic(); // Old Company name
        Company.companyName = "Xiaomi";  // измените companyName и проверьте, что она изменилась для всех
        Company.printCompanyName();
        ivanovPetr.printCompanyNameNotStatic(); // Object has new Company name
        petrovAlex.printCompanyNameNotStatic(); // Object has new Company name
        // ivanovPetr.employeeID = 98;  //  Попробуйте изменить employeeID — должно быть невозможно.

        // Class Math
        System.out.println("Circle1 area: " + MathConstants.calculateCircleArea(5));
        System.out.println("Circle2 area: " + MathConstants.calculateCircleArea(7));
        System.out.println("Circle1 circumference: " + MathConstants.circleCircumference(5));
        System.out.println("Circle2 circumference: " + MathConstants.circleCircumference(7));

        // Class University
        University student1 = new University(67, "Alex");
        University student2 = new University(17, "Ivan");
        University student3 = new University(27, "Alica");

        University.universityName = "BSTY2";
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("MGY");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        // Class Game Settings
        GameSettings game1 = new GameSettings("Football", 4);
        GameSettings game2 = new GameSettings("Basketball", 14);
        game1.printGameStatus();
        game2.printGameStatus();

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

        // Class Person
        Person ivan = new Person("Ivan", "Ivanov", "345 098");
        Person alex = new Person("Alex", "Petrov", "897 754");
        ivan.setFirstName("Petya");

        ivan.printPersonInfo();
        alex.printPersonInfo();

    }
}