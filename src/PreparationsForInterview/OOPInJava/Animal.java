package PreparationsForInterview.OOPInJava;

public class Animal {
    // 2. Животные и поведение (Наследование)
    // Разработай базовый класс Animal, содержащий имя и метод makeSound().
    // Создай подклассы Dog, Cat, Cow, каждый из которых реализует makeSound() по-своему.
    // Добавь метод describe() в базовом классе, который использует makeSound() внутри.
    // Пояснение: задача на наследование и переопределение поведения через переопределённый метод.

    private String name;

    public void makeSound(){
        System.out.println("Making Sound");
    }

    public void describe(){
        makeSound();
    }
}
