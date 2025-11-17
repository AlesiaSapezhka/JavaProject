package practice6.arrayDeque;

public class Main {
    public static void main(String[] args) {

    Tasks tasks = new Tasks();
    System.out.println(tasks.arrayDeque);

    tasks.addElement(45000);

    System.out.println(tasks.arrayDeque);
    tasks.removeElement();
    System.out.println(tasks.arrayDeque);

    tasks.addLastElement(23);
    tasks.addFirstElement(4323);
    System.out.println(tasks.arrayDeque);
    tasks.removeFirstElement();
    tasks.removeLastElement();
    System.out.println(tasks.arrayDeque);
    }
}
