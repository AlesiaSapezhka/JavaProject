package PreparationsForInterview.Order;

public class Product {
    // //У каждого товара есть:
    //    //
    //    //название
    //    //цена
    //    //количество
    //    //

    private String productName;
    private double cost;
    private int quantity;

    public Product(String productName, double cost, int quantity) {
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
    }

    public double getTotal() {
        return cost * quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
