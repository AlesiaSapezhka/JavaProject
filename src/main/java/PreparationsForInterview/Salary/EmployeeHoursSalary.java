package PreparationsForInterview.Salary;

public class EmployeeHoursSalary extends Employees{
    private int hoursAmount;
    private double rate;

    public EmployeeHoursSalary(String name, int hoursAmount, double rate) {
        super(name);
        this.hoursAmount = hoursAmount;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursAmount * rate;
    }
}
