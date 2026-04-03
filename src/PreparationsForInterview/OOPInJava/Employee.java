package PreparationsForInterview.OOPInJava;

public abstract class Employee {
    protected double baseSalary;
    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
}
