package PreparationsForInterview.Static_Final_AM;

public class MathConst {

    // 1. Математические константы
    // Разработай вспомогательный класс, который содержит два числовых значения: число Пи (3.14159) и число Эйлера (2.71828).
    // Эти значения не должны изменяться после объявления и должны быть доступны без создания объекта.
    // Добавь метод, который печатает обе константы.
    // Пояснение: подумай, как сделать значения "глобальными" и неизменяемыми.

    static final double PI=3.14159;
    static final double Eler=2.71828;
    public static void print(){
        System.out.println("Number PI: " + PI + ". Number Eler: " + Eler);
    }
}
