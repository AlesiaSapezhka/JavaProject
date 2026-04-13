package PreparationsForInterview.Salary;

public abstract class Employees {
    //У каждого сотрудника есть имя.
    private String name;

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}
