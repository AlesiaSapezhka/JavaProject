package EntityManagerTests;
import ComplexTasks.EntitManager.Entity;
import ComplexTasks.EntitManager.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTests extends EntityManager {
    private EntityManager<Entity> entityManager;

    @BeforeEach
    void setup() {
        entityManager = new EntityManager<>();
    }

    @Test
    @DisplayName("Проверка что один элемент был добавлен в пустую коллекцию")
    public void addEntityTest() {
        entityManager.addElement(new Entity("Alex", 30, true));
        int expectedLength = entityManager.returnAllElements().size();
        assertEquals(expectedLength, 1, "Wrong number of elements returned");
    }

    @Test
    @DisplayName("Проверка что один элемент был добавлен в Не пустую коллекцию")
    public void addEntityTest2() {
        entityManager.addElement(new Entity("Alex", 30, true));
        entityManager.addElement(new Entity("Bob", 25, false));
        int expectedLength = entityManager.returnAllElements().size();
        assertEquals(expectedLength, 2, "Wrong number of elements returned");

    }

    @Test
    @DisplayName("Проверка что один элемент был удален из коллекции")
    public void removeEntityTest() {
        Entity entity = new Entity("Ivan", 40, true);
        entityManager.addElement(entity);

        boolean removed = entityManager.removeElement(entity);
        assertTrue(removed);
        assertEquals(0, entityManager.returnAllElements().size());
    }

    @Test
    @DisplayName("При попытке удалить несущесвующий элемент должно вернуться False")
    void removeNonExistingEntityTest() {
        Entity entity = new Entity("Ghost", 99, false);

        boolean removed = entityManager.removeElement(entity);

        assertFalse(removed);
    }

    @Test
    @DisplayName("Проверка возврата списка элементов")
    public void returnAllElementsTest() {
        Entity entity = new Entity("Kolya", 14, false);
        entityManager.addElement(entity);

        List<Entity> result = entityManager.returnAllElements();

        assertEquals(1, result.size());
        assertEquals("Kolya", result.get(0).getName());
    }

    @Test
    @DisplayName("Фильтрация по имени игнорируя Case")
    void filteredByNameTest() {
        entityManager.addElement(new Entity("Kolya", 14, false));
        entityManager.addElement(new Entity("Alex", 20, true));

        List<Entity> result = entityManager.filteredByName("alex");

        assertEquals(1, result.size());
        assertEquals("Alex", result.get(0).getName());
    }

    @Test
    @DisplayName("Если элемента с заданным именем не существует должен вернуться пустой список")
    void filteredByNameNoMatchTest() {
        entityManager.addElement(new Entity("Kolya", 14, false));

        List<Entity> result = entityManager.filteredByName("Bob");

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Фильтрация по возрастному диапазону")
    void filteredByAgeTest() {
        entityManager.addElement(new Entity("A", 10, true));
        entityManager.addElement(new Entity("B", 20, true));
        entityManager.addElement(new Entity("C", 30, true));

        List<Entity> result = entityManager.filteredByAge(15, 25);

        assertEquals(1, result.size());
        assertEquals(20, result.get(0).getAge());
    }

    @Test
    @DisplayName("Если элемента с заданным возрастом не существует должен вернуться пустой список")
    void filteredByAgeNoMatchTest() {
        entityManager.addElement(new Entity("A", 10, true));

        List<Entity> result = entityManager.filteredByAge(20, 30);

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Фильтрация по статусу активности")
    void filteredByIsActiveTest() {
        entityManager.addElement(new Entity("A", 10, true));
        entityManager.addElement(new Entity("B", 20, false));

        List<Entity> result = entityManager.filteredByIsActive(true);

        assertEquals(1, result.size());
        assertTrue(result.get(0).isActive());
    }

    @Test
    @DisplayName("Если элемента с заданным статусом активности не существует должен вернуться пустой список")
    void filteredByIsActiveNoMatchTest() {
        entityManager.addElement(new Entity("A", 10, false));

        List<Entity> result = entityManager.filteredByIsActive(true);
        assertTrue(result.isEmpty());
    }
    }
