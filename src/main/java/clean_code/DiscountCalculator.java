package clean_code;//2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
//
//Исходный код:
public class DiscountCalculator {
    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;
        if (isLoyalCustomer) {
            discount = discountForFirstPurchase(isFirstPurchase, price);
        } else {
            discount = discountIfHasCoupon(isFirstPurchase, price);
        }
        return price - discount;
    }


    public static double discountForFirstPurchase( boolean isFirstPurchase, double price) {
        return isFirstPurchase? price * 0.10: price * 0.05;
    }

    public static double discountIfHasCoupon( boolean hasCoupon, double price) {
        return hasCoupon? price * 0.07: price * 0.02;
    }
}
//Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
