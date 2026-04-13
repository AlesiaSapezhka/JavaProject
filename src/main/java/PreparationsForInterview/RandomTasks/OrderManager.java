package PreparationsForInterview.RandomTasks;

public class OrderManager {
        private Order order;

        public OrderManager(Order order) {
            this.order = order;
        }

        // Нужно реализовать систему, которая управляет переходами
        // Добавляем действия:
        // / +оплата заказа
        // / +отправка заказа
        // / +доставка заказа
        // / +отмена заказа

        // Логика переходов:
        // /CREATED → PAID
        // /PAID → SHIPPED
        // /SHIPPED → DELIVERED
        // /PAID → CANCELLED

        public void payOrder(String orderNumber) {
            if(order.getOrderStatus() == Order.OrderStatus.CREATED) {
                System.out.println("Order was paid");
                order.setOrderStatus(Order.OrderStatus.PAID);
            } else {
                throw new RuntimeException("Order was not paid");
            }
        }

    public void sendOrder(String orderNumber) {
        if(order.getOrderStatus() == Order.OrderStatus.PAID) {
            System.out.println("Order was sent");
            order.setOrderStatus(Order.OrderStatus.SHIPPED);
        } else {
            System.out.println("Order can be sent only from Paid status");
        }
    }

    public void deliverOrder(String orderNumber) {
        if(order.getOrderStatus() == Order.OrderStatus.SHIPPED) {
            System.out.println("Order was delivered");
            order.setOrderStatus(Order.OrderStatus.DELIVERED);
        } else {
            System.out.println("Order can be delivered only from Shipped status");
        }
    }

    public void declineOrder(String orderNumber) {
        if(order.getOrderStatus() == Order.OrderStatus.PAID) {
            System.out.println("Order was cancelled");
            order.setOrderStatus(Order.OrderStatus.CANCELLED);
        } else {
            System.out.println("Order can be cancelled only from Paid status");
        }
    }



    // /Доставить неотправленный заказ
    // /Отменить доставленный заказ
    // /Изменить состояние после DELIVERED или CANCELLED
    //
    // Пример работы:
    //
    // Создание заказа:
    // /order 1001 created
    //
    // Оплата:
    // /order 1001 оплачен
    //
    // Отправка:
    // /order 1001 отправлен
    //
    // Доставка:
    // /order 1001 доставлен
    //
    // /Нельзя попытаться отправить неоплаченный заказ!
    //
    // /Отмена заказа любой была бы отмена
}
