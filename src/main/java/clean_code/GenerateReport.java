package clean_code;

public class GenerateReport {
    public void generateInvoice(OrderDetails orderDetails) {
        System.out.println("Генерируем счет для заказа: " + orderDetails.getOrderID());
    }
}
