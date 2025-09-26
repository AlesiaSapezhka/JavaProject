package practice2;

public class Point {
    int x;
    int y;

    Point (int x,int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    void setX(int newValue){
        this.x = newValue;
    }

    void print(){
        System.out.println("Value x: " + this.x + ", value y: " + this.y);
    }
}
