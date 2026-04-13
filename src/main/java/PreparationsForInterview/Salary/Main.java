package PreparationsForInterview.Salary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employees employee1 = new EmployeeFixSalary("Kolya", 456);
        Employees employee2 = new EmployeePercentSalary("Alex", 10, 1000);

        SalaryService service = new SalaryService();
        List<Employees> employeeList = new ArrayList<Employees>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        service.payAll(employeeList);

    }
}
