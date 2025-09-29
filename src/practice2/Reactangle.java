package practice2;

public class Reactangle {
    private float width;
    private final float height;

    Reactangle(float width, float height){
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
        this.width = newWidth;
    }

    float calculateArea(){
        return this.width * this.height;
    }
}
