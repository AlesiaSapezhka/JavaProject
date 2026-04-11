package StudentGrade;

import ComplexTasks.Student.GradeService;
import ComplexTasks.Student.InvalidGradeException;
import ComplexTasks.Student.StudentGrade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest extends GradeService {

    public static Stream<Arguments> invalidStudentsGradeInteger() {
        return Stream.of(
                Arguments.of("math", -7, "Alex"),
                Arguments.of("math", null, "Alex"));
    }

    @ParameterizedTest
    @MethodSource("invalidStudentsGradeInteger")
    public void testInvalidGradesInteger(String subject, Integer mark, String name) {
        GradeService<Integer> gradeService = new GradeService<>();;
        StudentGrade<Integer> grade = new StudentGrade<>(subject, mark, name);

        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(grade);
        }, "If grade is null or invalid InvalidGradeException should be thrown");
    }

    public static Stream<Arguments> invalidStudentsGradeDouble() {
        return Stream.of(
                Arguments.of("math", -7.9, "Alex"),
                Arguments.of("math", null, "Alex"));
    }

    @ParameterizedTest
    @MethodSource("invalidStudentsGradeDouble")
    public void testInvalidGradesDouble(String subject, Double mark, String name) {
        GradeService<Double> gradeService = new GradeService<>();;
        StudentGrade<Double> grade = new StudentGrade<>(subject, mark, name);

        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(grade);
        }, "If grade is null or invalid InvalidGradeException should be thrown");
    }

    @Test
    public void testCountAverageGradeInteger() throws InvalidGradeException {
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> grade1 = new StudentGrade<>("math", 6, "Alex");
        gradeService.addGrade(grade1);
        StudentGrade<Integer> grade2 = new StudentGrade<>("rus", 6, "Alex");
        gradeService.addGrade(grade2);
        StudentGrade<Integer> grade3 = new StudentGrade<>("math", 4, "Alex");
        gradeService.addGrade(grade3);

        assertEquals(4, gradeService.countAverageGrade("math"));
        assertEquals(6, gradeService.countAverageGrade("rus"));
        assertEquals(0, gradeService.countAverageGrade("literature"));
    }

    @Test
    public void testCountAverageGradeDouble() throws InvalidGradeException {
        GradeService<Double> gradeService = new GradeService<>();
        StudentGrade<Double> grade1 = new StudentGrade<>("math", 6.8, "Alex");
        gradeService.addGrade(grade1);
        StudentGrade<Double> grade2 = new StudentGrade<>("rus", 6.0, "Alex");
        gradeService.addGrade(grade2);
        StudentGrade<Double> grade3 = new StudentGrade<>("math", 4.2, "Alex");
        gradeService.addGrade(grade3);

        assertEquals(5.5, gradeService.countAverageGrade("math"));
        assertEquals(6, gradeService.countAverageGrade("rus"));
        assertEquals(0, gradeService.countAverageGrade("literature"));
    }
}
