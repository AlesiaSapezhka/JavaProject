package clean_code;

public class ProcessOrder {
    public void processOrder(OrderDetails orderDetails) {
        System.out.println("Обрабатываем заказ c ID: " + orderDetails.getOrderID());
    }
}
