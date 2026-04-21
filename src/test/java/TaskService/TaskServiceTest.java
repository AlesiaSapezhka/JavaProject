package TaskService;

import ComplexTasks.TaskManager.Task;
import ComplexTasks.TaskManager.TaskService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskServiceTest {

    TaskService taskService = new TaskService();

    // Протестируйте добавление, удаление и поиск задач, а также проверку фильтрации и сортировки.
    @Test
    void addTaskTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        assertEquals(taskService.returnAllTasks().size(), 0);
        taskService.addTask(task1);
        assertEquals(taskService.returnAllTasks().size(), 1);
        Task task2 = new Task<>("2113", "active", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.returnAllTasks().size(), 2);

    }

    @Test
    void deleteTaskTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        assertEquals(taskService.returnAllTasks().size(), 0);
        taskService.addTask(task1);
        assertEquals(taskService.returnAllTasks().size(), 1);
        taskService.deleteTask("2113");
        assertEquals(taskService.returnAllTasks().size(), 0);
    }

    @Test
    void deleteNotExistingTaskTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        assertEquals(taskService.returnAllTasks().size(), 0);
        taskService.addTask(task1);
        assertEquals(taskService.returnAllTasks().size(), 1);
        taskService.deleteTask("211");
        assertEquals(taskService.returnAllTasks().size(), 1);
    }

    @Test
    void filterTasksByStatusTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>("2113", "done", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.filterTasksByStatus("active"), List.of(task1));
    }

    @Test
    void filterTasksByNotValidStatus() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>("2113", "done", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.filterTasksByStatus("not active"), List.of());
    }

    @Test
    void filterTasksByPriorityTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>("2113", "done", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.filterTasksByPriority(1), List.of(task1, task2));
    }

    @Test
    void filterTasksByInvalidPriorityTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>("2113", "done", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.filterTasksByPriority(0), List.of());
    }

    @Test
    void sortTasksByDateTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>("2113", "done", 1, LocalDate.of(2026, 2, 20));
        taskService.addTask(task2);
        assertEquals(taskService.sortTasksByDate(), List.of(task2, task1));
    }

    @Test
    void sortOneTasksByDateTest() {
        Task task1 = new Task<>("2113", "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        assertEquals(taskService.sortTasksByDate(), List.of(task1));
    }

}
