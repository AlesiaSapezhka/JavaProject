package practice2;

public class Product {
    private final String name;
    private double price;

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
        if (newPrice>0){
            this.price = newPrice;
        } else {
            System.out.println("Price cannot be negative or zero");
        }
    }

   void applyDiscount(double discount) {
        if (discount>0) {
            this.price = this.price - this.price * discount / 100;
        }  else {
            System.out.println("Discount value can not be negative or zero");
        }
   }

   void printInfo(){
        System.out.println("Product name: " + this.name + ". Final price: " + this.price);
   }

}
