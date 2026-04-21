package Storage;

import ComplexTasks.Storage.InventoryService;
import ComplexTasks.Storage.OutOfStockException;
import ComplexTasks.Storage.Product;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    InventoryService inventoryService = new InventoryService();

    // Протестируйте добавление и извлечение товаров, проверив работу флага isInventoryOpen, фильтрацию по категории и цене,
    // а также обработку исключений при отсутствии товаров.

    @Test
    public void addProductInventoryOpened() {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, true);
        Map<String, List<Product>> expectedResult = Map.of("fruits", List.of(product));
        assertEquals(expectedResult, inventoryService.returnAllProducts());
    }

    @Test
    public void addProductInventoryClosed() {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, false);
        Map<String, List<Product>> expectedResult = Map.of();
        assertEquals(expectedResult, inventoryService.returnAllProducts());
    }

    @Test
    public void getProductsByCategoryTest() throws OutOfStockException {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, true);
        Product product1 = new Product("tomato", 7.8, "vegetables");
        inventoryService.addProduct(product1, true);
        List<Product> expectedResult = List.of(product);
        assertEquals(expectedResult, inventoryService.getProductsByCategory("fruits"));
    }

    @Test
    public void getProductsByCategoryWhichIsNull() throws OutOfStockException {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, false);
        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductsByCategory(null);
        }, "If there is no products in category OutOfStockException should be thrown");
    }

    @Test
    public void getProductsByNotExistingCategoryTest() throws OutOfStockException {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, true);
        Product product1 = new Product("tomato", 7.8, "vegetables");
        inventoryService.addProduct(product1, true);
        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductsByCategory("electronics");
        }, "If required category category not exists OutOfStockException should be thrown");
    }

    @Test
    public void filterByCategoryTest() {
        Product product = new Product("apple", 7.8, "fruits");
        inventoryService.addProduct(product, true);
        Product product1 = new Product("orange", 7.8, "fruits");
        inventoryService.addProduct(product1, true);
        Product product2 = new Product("tomato", 7.8, "vegetables");
        inventoryService.addProduct(product2, true);
        Map<String, List<Product>> expectedResult = Map.of("vegetables", List.of(product2));
        assertEquals(expectedResult, inventoryService.filterProductsByCategory("vegetables"));
    }

    @Test
    public void filterByPriceTest() {
        Product product = new Product("apple", 10, "fruits");
        inventoryService.addProduct(product, true);
        Product product1 = new Product("orange", 1008, "fruits");
        inventoryService.addProduct(product1, true);
        Product product2 = new Product("tomato", 9, "vegetables");
        inventoryService.addProduct(product2, true);
        Map<String, List<Product>> expectedResult = Map.of("fruits", List.of(product), "vegetables", List.of(product2));
        assertEquals(expectedResult, inventoryService.filterProductsByPrice(100));
    }
}
