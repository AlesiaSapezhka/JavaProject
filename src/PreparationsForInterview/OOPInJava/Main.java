package PreparationsForInterview.OOPInJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.makeSound();
//
//        Animal animal = new Animal();
//        animal.makeSound();

//        List<NotificationSender> senders = List.of(
//                new EmailSender(),
//                new SmsSender()
//                );
//        NotificationService.notifyUsers(senders, "Hello!");

//        List<Employee> staff = List.of(
//                new Manager(2000),
//                new Developer(1800)
//        );
//
//        double total = totalSalary(staff);
//        System.out.println("Total salary: " + total);
//        User Alice = new User("ail.com", 876);
//        Alice.setNotifier(new EmailNotifier());
//        Alice.sendNotification("hi");
//
//        List <Lessons> lessonsList= List.of(
//        new VideoLesson("first", 6),
//        new LiveSession("live", 8)
//        );
//        System.out.println(lessonsDuration(lessonsList));

//        List<GameObject> objects = List.of(
//                new GamePlayer(),
//                new Enemy()
//        );
//        boolean running = true;
//        while (running){
//            for(GameObject object : objects){
//                object.render();
//                object.update();
//            }
//            running = false;
//        }
//        Calculato addCalcul = new Calculato(new Addition());
//        System.out.println(addCalcul.calculate(10, 5));

//        List<Drawable> drawables = List.of(
//                new Line(),
//                new Text()
//        );
//        drawables.forEach(drawable -> drawable.draw());

//        RoleUser admin = new RoleUser("moderator", new Moderator());

        List <OrderProcessor> processor = List.of(
                new LoyaltyPointsAdder(),
                new EmailConfirmation()
        );
        processor.forEach(process->process.process(new Order(66, "Alex", "hhh@.com", 67, 1000)));

//        List <BonusEffect> = List.of(
//                new HealthBoost(PlayerGam player),
//                new SpeedBoost()
//        )
    }

        public static double totalSalary(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum+=employee.calculateSalary();
        }
        return sum;
        }

        public static int lessonsDuration(List<Lessons> lessons) {
        int duration=0;
        for (Lessons lesson : lessons) {
            duration+=lesson.getDuration();
        }
        return duration;
        }
    }

