package practice3;

public class Company {

    static String companyName = "Samsung"; // общее название для всех сотрудников
    final int employeeID; // уникальный идентификатор (нельзя менять)
    private String employeeName; // имя сотрудника, поле private ибо создали геттеры и сеттеры

    Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println("Company name is " + companyName);
    }

    void printCompanyNameNotStatic(){
        System.out.println("Company name is " + companyName); // добавила метод чтобы можно было прочитать имя компании вызвав метод через объект
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }
}
