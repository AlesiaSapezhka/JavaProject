package clean_code;

//4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач

public class OrderDetails {
    private String orderID;
    private String orderReciever;
    private String orderReciverEmail;

    public OrderDetails(String orderID, String orderReciverEmail, String orderReciever) {
        this.orderID = orderID;
        this.orderReciverEmail = orderReciverEmail;
        this.orderReciever = orderReciever;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getOrderReciever() {
        return orderReciever;
    }

    public String getOrderReciverEmail() {
        return orderReciverEmail;
    }
}
//Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.
