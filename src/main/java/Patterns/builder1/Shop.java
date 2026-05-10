package Patterns.builder1;


public class Shop {
    public static void main(String[] args) {

        Order order = new Order.Builder()
                .setGoods("Game")
                .setPaymentType("Cash")
                .build();
        System.out.println(order);

    }
}
