package ComplexTasks.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidGradeException {
        GradeService<Integer> gradeService = new GradeService<>();

        StudentGrade<Integer> s1 = new StudentGrade<>("math", -5, "Alex");
        StudentGrade<Integer> s2 = new StudentGrade<>("math", 10, "Alex");
        StudentGrade<Integer> s3 = new StudentGrade<>("rus", 10, "Alex");

        gradeService.addGrade(s1);
//        gradeService.addGrade(s2);
//        gradeService.addGrade(s3);

        List<StudentGrade<Integer>> allGrades = gradeService.getAllGrades();
        System.out.println(allGrades);

        double avg = gradeService.countAverageGrade("math");
        System.out.println(avg);
    }
}
