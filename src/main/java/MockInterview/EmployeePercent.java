package MockInterview;

public class EmployeePercent extends Employee {

    private double percent;
    private double amountOfSeils;

    public EmployeePercent(String name, double percent,  double amountOfSeils) {
        super(name);
        this.percent = percent;
        this.amountOfSeils = amountOfSeils;
    }

    @Override
    public double paySalary() {
        if (percent <= 0){
            throw new RuntimeException ("Percent can not be zero oe negative");
        }
        return amountOfSeils*percent/100;
    }
}
