package ComplexTasks.Storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService<T extends Product> {
    Map<String, List<Product>> productsByCategory = new HashMap<>();

    public Map<String, List<Product>> returnAllProducts() {
        return new HashMap<>(productsByCategory);
    }

    // Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
    public void addProduct(Product product, boolean isInventoryOpen) {
        if (isInventoryOpen) {
            productsByCategory.computeIfAbsent(product.getCategory(), c -> new ArrayList<>()).add(product);
        }
    }

    // Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.
    public List<Product> getProductsByCategory(String category) throws OutOfStockException {
        List<Product> products = productsByCategory.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("No products in this category");
        }
        return products;
    }

    // Фильтрация товаров по цене
    public Map<String, List<Product>> filterProductsByPrice(double maxPrice) {
        return productsByCategory.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().stream().filter(product -> product.getPrice() <= maxPrice).toList()));
    }

    // Фильтрация товаров по категории
    public Map<String, List<Product>> filterProductsByCategory(String category) {
        return productsByCategory.entrySet().stream().filter(entry -> category.equals(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().toList()));
    }
}
