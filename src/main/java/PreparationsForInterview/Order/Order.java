package PreparationsForInterview.Order;

import java.util.List;

public class Order{

    private int orderNumber;
    private List<Product> productsList;

    public Order(int orderNumber, List<Product> productsList) {
        this.orderNumber = orderNumber;
        this.productsList = productsList;
    }

   public void addProductIntoOrder(Product product){
        productsList.add(product);
   }

   public double countOrderCost(){
        double sum = 0;
       for (Product product : productsList) {
           sum+= product.getTotal();
       }
      return sum;

   }
}
