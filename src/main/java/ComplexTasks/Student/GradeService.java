package ComplexTasks.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//    Список List<StudentGrade<T>> для хранения оценок.
//    Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
//    Метод для расчёта среднего значения оценок по конкретному предмету.
//    Обработка исключений через InvalidGradeException, если оценка некорректна.

    public class GradeService<T extends Number> {

        List<StudentGrade<T>> studentGradeList = new ArrayList<>();

        public List<StudentGrade<T>> getAllGrades() {
            return List.copyOf(studentGradeList);
        }

        public void addGrade(StudentGrade<T> studentGrade) throws InvalidGradeException {

            if (studentGrade.getMark() == null) {
                throw new InvalidGradeException("Mark cannot be null");
            }

            if (studentGrade.getMark().doubleValue() < 0) {
                throw new InvalidGradeException("Mark cannot be less than 0");
            }

            studentGradeList.add(studentGrade);
    }

    public double countAverageGrade(String subject) {
        if (studentGradeList.isEmpty()) {
            return 0;
        }

        List <StudentGrade <T>> filtered =  studentGradeList.stream()
                .filter(str -> str.getSubject().equals(subject)).collect(Collectors.toList());

        if (filtered.isEmpty()) {
            return 0;
        }
        double sum = filtered.stream()
                .mapToDouble(grade -> grade.getMark().doubleValue())
                .sum();

        return sum / filtered.size();
    }
}

