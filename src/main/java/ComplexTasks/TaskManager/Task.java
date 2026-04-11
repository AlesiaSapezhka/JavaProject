package ComplexTasks.TaskManager;

import java.time.LocalDate;
import java.util.Date;

public class Task <T>{
    //Task<T>: Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.
    private String taskId;
    private String status;
    private int priority;
    private LocalDate date;

    public Task(String taskId, String status, int priority, LocalDate date) {
        this.taskId = taskId;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", priority=" + priority +
                ", date=" + date +
                ", taskId='" + taskId + '\'' +
                '}';
    }
}
