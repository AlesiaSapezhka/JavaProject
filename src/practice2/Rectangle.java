package practice2;

public class Rectangle {
    private float width;
    private final float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    float getWidth(){
        return this.width;
    }

    float getHeight(){
        return this.height;
    }

    void setWidth(float newWidth){
        if (newWidth>0){
            this.width = newWidth;
        } else {
            System.out.println("Width cannot be negative");
        }
    }

    float calculateArea(){
        return this.width * this.height;
    }
}
