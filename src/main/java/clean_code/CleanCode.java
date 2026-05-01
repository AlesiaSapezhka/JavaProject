package clean_code;

import static clean_code.DiscountCalculator.calculateDiscount;
import static clean_code.MathOperations.add;

public class CleanCode {
    public static void main(String[] args) {
        int [] array = {0,3,4,98};
       System.out.println(add(array));

       System.out.println(calculateDiscount(70,true, true, false));


       Payment pay1 = new BitcoinPayment(68);
       PaymentProcessor processor = new PaymentProcessor();
       processor.processPayment(pay1);
    }




}
