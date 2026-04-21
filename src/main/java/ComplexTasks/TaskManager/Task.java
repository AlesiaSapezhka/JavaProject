package ComplexTasks.TaskManager;

import java.time.LocalDate;

public class Task<T> {
    //Task<T>: Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.
    private final T taskId;
    private final T status;
    private final T priority;
    private final LocalDate date;

    public Task(T taskId, T status, T priority, LocalDate date) {
        this.taskId = taskId;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getTaskId() {
        return taskId;
    }

    public T getStatus() {
        return status;
    }

    public T getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Task{" + "status='" + status + '\'' + ", priority=" + priority + ", date=" + date + ", taskId='" + taskId + '\'' + '}';
    }
}
