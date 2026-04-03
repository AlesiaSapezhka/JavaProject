package PreparationsForInterview.FirstJavaProject;

public class Main {
    public static void main(String[] args) {

        Book one = new Book("Hi", "Poet");
        System.out.println(one.getAuthor());
        User petya = new User();
        petya.introduce("Ivan", 8);
        System.out.println(Rectangle.isSquare(6,7));

        BankAccount myAccount = new BankAccount(60.9);
        System.out.println(myAccount.deposit(10));
        System.out.println(myAccount.withdraw(1));

        TV tv = new TV();
        System.out.println(tv.togglePower(true));
        System.out.println(tv.isOn);
    }

}
