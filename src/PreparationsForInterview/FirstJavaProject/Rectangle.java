package PreparationsForInterview.FirstJavaProject;

public class Rectangle {
    int width;
    int heigh;

    public static int getArea(int width, int height) {
        return width * height;
    }

    public static boolean isSquare(int width, int height) {
        return width == height;
    }
}
