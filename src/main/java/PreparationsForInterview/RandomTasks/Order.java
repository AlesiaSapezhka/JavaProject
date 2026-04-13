package PreparationsForInterview.RandomTasks;
public class Order {
    // В системе есть:
    // Заказы есть:
    // Номер заказа
    // Текущий состояние
    // Заказ может находиться в одном из состояний:
    // CREATED
    // SHIPPED PAID
    // DELIVERED
    // CANCELLED

    private int orderNumber;
    private OrderStatus orderStatus;
    public enum OrderStatus {
        CREATED,
        PAID,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.orderStatus = OrderStatus.CREATED;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public OrderStatus setOrderStatus(OrderStatus orderStatus) {
        return this.orderStatus = orderStatus;
    }
}





