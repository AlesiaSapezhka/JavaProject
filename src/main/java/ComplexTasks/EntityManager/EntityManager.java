package ComplexTasks.EntityManager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<T>();

    public void addElement(T entity) {
        entities.add(entity);
    }

    public boolean removeElement(T entity) {
        return entities.remove(entity);
    }

    public List<T> returnAllElements() {
        return List.copyOf(entities);
    }

    public List<T> filteredByName(String name) {
        return entities.stream().filter(entity -> entity.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public List<T> filteredByAge(int min, int max) {
        return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max).collect(Collectors.toList());
    }

    public List<T> filteredByIsActive(boolean active) {
        return entities.stream().filter(entity -> entity.isActive() == active).collect(Collectors.toList());
    }
}
