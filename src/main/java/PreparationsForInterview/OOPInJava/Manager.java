package PreparationsForInterview.OOPInJava;

public class Manager extends Employee {
    public Manager(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }
}
