package Patterns.builder1;

public class Order {
    String good;
    String discount;
    String paymentType;

    public Order(String good, String discount, String paymentType) {
        this.good = good;
        this.discount = discount;
        this.paymentType = paymentType;
    }

    public Order (Builder builder){
        this.good = builder.good;
        this.discount = builder.discount;
        this.paymentType = builder.paymentType;
    }
    @Override
    public String toString(){
        return "Order: "+ " good " + good + ", payment type " + paymentType + ", discount " + discount;
    }

    static class Builder {
        private String good;
        private String discount;
        private String paymentType;


        public Builder setGoods(String good) {
            this.good = good;
            return this;
        }
        public Builder setDiscount(String discount) {
            this.discount = discount    ;
            return this;
        }
        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
