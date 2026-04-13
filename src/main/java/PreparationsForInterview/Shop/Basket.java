package PreparationsForInterview.Shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        if (product.getQuantity() <= 0) return;

        // если уже есть — увеличиваем количество
        for (Product p : productsList) {
            if (p.getName().equals(product.getName())) {
                p.changeQuantity(p.getQuantity() + product.getQuantity());
                return;
            }
        }

        productsList.add(product);
    }

    public void removeProductFromBasket(Product product) {
        productsList.remove(product);
    }

    public void changeProductQuantity(String name, int quantity) {
        for (Product product : productsList) {
            if (product.getName().equals(name)) {
                if (quantity <= 0) {
                    productsList.remove(product);
                } else {
                    product.changeQuantity(quantity);
                }
                return;
            }
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (Product product : productsList) {
            sum+=product.getTotal();
        }
        return sum;
    }

    public void showBasket(){
        for (Product product : productsList) {
            System.out.println(product.getName());
        }
    }
}
