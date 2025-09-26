package practice2;

public class Product {
    String name;
    double price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

   void applyDiscount(double discount) {
        this.price = this.price - this.price * discount / 100;
   }

   void printInfo(){
        System.out.println("Product name: " + this.name + ". Final price: " + this.price);
   }

}
