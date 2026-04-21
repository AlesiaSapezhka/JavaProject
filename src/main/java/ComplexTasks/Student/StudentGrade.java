package ComplexTasks.Student;

public class StudentGrade<T extends Number> {
    //Поля для имени студента, предмета и оценки.
    //Оценка должна быть типа T, который расширяет класс Number.
    //Конструктор для инициализации всех полей.
    //Геттеры для доступа к полям.

    private final String studentName;
    private final String subject;
    private final T grade;

    public StudentGrade(String subject, T grade, String studentName) {
        this.subject = subject;
        this.grade = grade;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "studentName='" + studentName + '\'' + ", subject='" + subject + '\'' + ", grade=" + grade + '}';
    }
}
