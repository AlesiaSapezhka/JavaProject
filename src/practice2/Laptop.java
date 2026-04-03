package practice2;

public class Laptop {
    private String brand;
    private int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    int getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(int newPrice) {
        if (newPrice>0){
            this.price = newPrice;
        } else {
            System.out.println("Price cannot be negative or zero");
        }
    }

    void printInfo() {
        System.out.println("Laptop brand: " + this.brand + ". Laptop price: " + this.price + " руб");
    }
}
