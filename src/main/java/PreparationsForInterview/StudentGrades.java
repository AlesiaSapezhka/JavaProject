package PreparationsForInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGrades {

    private String studentName;
    private HashMap<String, List<Integer>> studentGrades = new HashMap<>();

    public void addStudentGrade(String studentName, int grade) {
        studentGrades
                .computeIfAbsent(studentName, k -> new ArrayList<>())
                .add(grade);
    }

    public List<Integer> getStudentGrades(String studentName) {
        return studentGrades.getOrDefault(studentName, List.of());
    }

    public double averageStudentGrade(String studentName) {
        List<Integer> grades = studentGrades.get(studentName);
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Student name " + studentName + " does not exist");
        } else {
            return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
        }
    }

    public int studentsCount () {
        return studentGrades.size();
    }

    public boolean ifStudentExists(String studentName) {
        return studentGrades.containsKey(studentName);
    }

        // "В системе есть журнал оценок.
        //
        //Журнал хранит оценки студентов.
        //У каждого студента есть:
        //имя
        //список его оценок
        //Нужно реализовать систему, которая может:
        //добавить оценку студенту
        //получить все оценки студента
        //посчитать средний балл студента
        //проверить, есть ли студент в журнале
        //показать количество студентов в журнале
        //
        //Правила:
        //если студента еще нет в журнале, он создается при первой оценке
        //у одного студента может быть много оценок
        //средний балл считается только по его оценкам
        //
        //Пример:
        //Добавляем оценки:
        //Anna → 5
        //Anna → 4
        //Boris → 3
        //
        //Оценки:
        //Anna → [5, 4]
        //Boris → [3]
        //
        //Средний балл:
        //Anna → 4.5
        //Boris → 3.0"

    }

