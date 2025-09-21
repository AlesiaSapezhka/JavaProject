package main;

public class MathOperations {

    public static void main(String[] args) {
        int sum1 = add(6, 7);
        int sub1 = subtract(10, 6);
        int multi1 = multiply(16, 9);
        float div1 = divide(60, 7);
        System.out.println("Summarization:" + sum1);
        System.out.println("Multiplication:" + multi1);
        System.out.println("Subtraction:" + sub1);
        System.out.println("Divide:" + div1);
        int maxNumber = findMax(-9, 88);
        System.out.println(maxNumber);
        int diff1 = diff( 10, 20);
        System.out.println(diff1);
        int area = squareArea(7);
        int perimetr = squarePerimeter(9);
        System.out.println("The area of the square is: " + area);
        System.out.println("The perimetr of the square is: " + perimetr);
        int minutes = convertSecondsToMinutes(360);
        System.out.println(minutes);
        double speed = averageSpeed (500, 5);
        System.out.println(speed);
        double hypotenuse = findHypotenuse (5, 5);
        System.out.println(hypotenuse);
        double circleLength = circleCircumference(5);
        System.out.println(circleLength);
        double percentage = calculatePercentage(200, 25);
        System.out.println(percentage + "%");
        double celsius = fahrenheitToCelsius(773.6);
        double fahrenheit = celsiusToFahrenheit( 412.777777);
        System.out.println("Fahrenheit is: " + fahrenheit);
        System.out.println("Celsius is: " + celsius);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static float divide(int x, int y){
        return (float) x / y;
    }

    public static int findMax (int a, int b){
        return Math.max(a, b);
    }

    public static int diff( int x, int y){
        return Math.abs(x - y);
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    public static int convertSecondsToMinutes(int seconds){
        return seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        return distance / time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
       return  100 * part / total;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
