package ComplexTasks.TaskManager;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Task task = new Task<>(23, "active", 2, LocalDate.of(2026, 5, 12));
        TaskService taskService = new TaskService();
        taskService.addTask(task);
        Task task1 = new Task<>(2.67, "active", 1, LocalDate.of(2026, 12, 22));
        taskService.addTask(task1);
        Task task2 = new Task<>(9.08, "active", 1, LocalDate.of(2026, 6, 2));
        taskService.addTask(task2);

        System.out.println(taskService.returnAllTasks());
        System.out.println(taskService.sortTasksByDate());

    }
}
