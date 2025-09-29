package practice3;

public class MathConstants {

    final static double PI = 3.14159; // сделала поле статик чтобы можно было использовать в статик методе
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return Math.round(PI * r * r);
    }

    static double circleCircumference(double r) {
        return Math.round(2 * Math.PI * r);
    }
}
