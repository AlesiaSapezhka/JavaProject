package PreparationsForInterview.Salary;

import java.util.List;

public class SalaryService {

    public void payAll(List<Employees> employees) {
        for (Employees employee : employees) {
            System.out.println(
                    employee.getName() + " получил " + employee.calculateSalary()
            );
        }
    }
}