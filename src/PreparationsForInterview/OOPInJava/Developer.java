package PreparationsForInterview.OOPInJava;

public class Developer extends Employee {
    public Developer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.5;
    }
}
