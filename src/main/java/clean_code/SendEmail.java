package clean_code;

public class SendEmail {
    public void sendEmailConfirmation(OrderDetails orderDetails) {
        System.out.println("Отправляем письмо клиенту: " + orderDetails.getOrderReciever() + " на адрес: " +  orderDetails.getOrderReciverEmail());
    }
}
