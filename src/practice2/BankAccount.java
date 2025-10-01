package practice2;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void setDeposit(double money){
        if (money >=0) {
            this.balance = this.balance + money;
        } else {
            System.out.println("Deposited money is negative");
        }
    }

    void setWithdraw(double money){
        if (money >=0) {
            this.balance = this.balance - money;
        } else {
            System.out.println("Withdraw money is negative");
        }
    }

    void printBalance(){
        System.out.println("Balance: " + this.balance);
    }
}
