package PreparationsForInterview.Salary;

public class EmployeeFixSalary extends Employees{

    private double monthSalary;

    public EmployeeFixSalary(String name, double monthSalary) {
        super(name);
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary(){
        return monthSalary;
    }
}
