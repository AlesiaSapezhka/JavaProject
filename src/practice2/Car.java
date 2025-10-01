package practice2;

public class Car {

    private String brand;
    private int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand(){
        return this.brand;
    }

    int getYear(){
        return this.year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int newYear){
        if (newYear>0) {
            this.year = newYear;
        } else {
            System.out.println("Invalid year");
        }
    }

    void print(){
        System.out.println("Brand: " + this.brand + ". " + "Year: " + this.year);
    }
}
