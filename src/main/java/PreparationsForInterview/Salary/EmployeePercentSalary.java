package PreparationsForInterview.Salary;

public class EmployeePercentSalary extends Employees {
    private double percentage;
    private double sumOfSells;

    public EmployeePercentSalary(String name, double percentage, double sumOfSells) {
        super(name);
        this.percentage = percentage;
        this.sumOfSells = sumOfSells;
    }

    @Override
    public double calculateSalary(){
        return sumOfSells * percentage / 100;
    }

}
