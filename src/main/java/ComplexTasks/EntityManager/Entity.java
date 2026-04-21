package ComplexTasks.EntityManager;

public class Entity {
    private final String name;
    private final int age;
    private final boolean isActive;

    public Entity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Entity{" + "name='" + name + '\'' + ", age=" + age + ", isActive=" + isActive + '}';
    }
}
