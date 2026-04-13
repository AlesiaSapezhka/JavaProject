package MockInterview;

public class EmployeeFixSalary extends Employee{
    private int salary;

    public EmployeeFixSalary(String name, int salary) {
        super(name);
        this.salary = salary;
    }


    @Override
    double paySalary(){
        if (salary<=0) {
            throw new RuntimeException("Salary can not be negative");
        }
        return this.salary;
    }
}
