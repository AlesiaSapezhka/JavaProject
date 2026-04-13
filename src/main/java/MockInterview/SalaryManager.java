package MockInterview;

import java.util.List;

public class SalaryManager {

    public void paySalaryToEmployees(List<Employee> employees){
        for(Employee employee: employees){
            if (employees.isEmpty() || employees==null){
                throw new RuntimeException("Employee list is empty");
            }
            System.out.println( employee.getName() + " получил(a) "+ employee.paySalary());
        }
    }
}
