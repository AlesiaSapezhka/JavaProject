package practice2;

public class BankAccount {
    String owner;
    double balance;

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
        this.balance = this.balance + money;
    }

    void setWithdraw(double money){
        this.balance = this.balance - money;
    }

    void printBalance(){
        System.out.println("Balance: " + this.balance);
    }
}
