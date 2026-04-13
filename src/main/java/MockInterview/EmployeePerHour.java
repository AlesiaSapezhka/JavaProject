package MockInterview;

public class EmployeePerHour extends Employee{

    private int amountOfWorkedHours;
    private int rate;

    public EmployeePerHour(String name, int amountOfWorkedHours, int rate) {
        super(name);
        this.amountOfWorkedHours = amountOfWorkedHours;
        this.rate = rate;
    }

    @Override
    public double paySalary(){
        if (rate<=0){
            throw new RuntimeException("Rate can not be negative");
        }
        return amountOfWorkedHours*rate;
    }
}
