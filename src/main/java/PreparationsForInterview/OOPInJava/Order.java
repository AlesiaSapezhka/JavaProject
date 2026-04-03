package PreparationsForInterview.OOPInJava;

public class Order {
    int id;
    private String user;
    private String email;
    private int bonus;
    private double amount;

    public Order(int id, String user, String email,  int bonus,  double amount) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.bonus = bonus;
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }

    public int increaseBonus(int bonusSum) {
        return bonus+=bonusSum;
    }
}
