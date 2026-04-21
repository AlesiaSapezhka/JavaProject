package ComplexTasks.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager manager = new EntityManager();
        Entity entity2 = new Entity("Kolya", 76, false);
        manager.addElement(entity2);

        System.out.println(manager.returnAllElements().toString());

        System.out.println(manager.removeElement(entity2));
        System.out.println(manager.returnAllElements().toString());
    }
}
