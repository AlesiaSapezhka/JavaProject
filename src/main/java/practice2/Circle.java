package practice2;

public class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        if (newRadius > 0) {
            this.radius = newRadius;
        } else {
            System.out.println("Radius cannot be negative or zero");
        }
    }

    String calculateArea(){
        double value = Math.PI * Math.pow(this.radius, 2);
        return String.format("%.3f", value);
    }

    String circleCircumference() {
        double value = 2 * Math.PI * this.radius;
        return String.format("%.3f", value);
    }
}
