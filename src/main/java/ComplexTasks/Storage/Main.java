package ComplexTasks.Storage;

public class Main {
    public static void main(String[] args) throws OutOfStockException {
        InventoryService inventoryService = new InventoryService();
        Product product = new Product("apple", 7.8, "fruits");
        Product product1 = new Product("orange", 100, "fruits");
        Product product2 = new Product("tomato", 12, "vegetables");
        inventoryService.addProduct(product, true);
        inventoryService.addProduct(product1, true);
//        System.out.println(inventoryService.getProductsByCategory("fruits"));
//        System.out.println(inventoryService.filterProductsByPrice(894));
//        System.out.println(inventoryService.returnAllProducts());
        System.out.println(inventoryService.filterProductsByCategory("fruits"));
    }
}
