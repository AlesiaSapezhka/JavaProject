package PreparationsForInterview.Shop;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return quantity * price;
    }
}
