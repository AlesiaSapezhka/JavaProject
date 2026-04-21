package ComplexTasks.TaskManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T extends Task> {
    // TaskService<T>: Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
    //Управление задачами:
    List<Task> tasksList = new LinkedList<Task>();

    public List<Task> returnAllTasks() {
        return new ArrayList<>(tasksList);
    }

    //Добавление задачи: Метод для добавления новой задачи в список.
    public void addTask(T task) {
        tasksList.add(task);
    }

    //Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
    public synchronized void deleteTask(String taskId) {
        tasksList.stream().filter(task -> task.getTaskId().equals(taskId)).findFirst().ifPresent(tasksList::remove);
    }

    //Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.
    public List<Task> filterTasksByStatus(String status) {
        return tasksList.stream().filter(tasks -> tasks.getStatus().equals(status)).collect(Collectors.toList());
    }

    public List<Task> filterTasksByPriority(int priority) {
        return tasksList.stream().filter(tasks -> tasks.getPriority().equals(priority)).collect(Collectors.toList());
    }

    // Сортировка задач от ближайшей дате к более поздней
    public List<Task> sortTasksByDate() {
        return tasksList.stream().sorted((a, b) -> a.getDate().compareTo(b.getDate())).collect(Collectors.toList());
    }
}
