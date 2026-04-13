package MockInterview;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Метод должен вывести:
        //Анна получила 3000
        //Борис получил 2400
        //Мария получила 5000

        Employee empl1 = new EmployeePercent("Alex", 10.5, 1000);
        Employee empl2 = new EmployeePerHour("Mary", 180, 0);
        Employee empl3 = new EmployeeFixSalary("Alice", -2000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);

        SalaryManager manager = new SalaryManager();
        manager.paySalaryToEmployees(employees);





        // Система работает с разными типами сотрудников:

        //сотрудник с фиксированным окладом
        //сотрудник с почасовой оплатой
        //сотрудник с процентом от продаж
        //
        //У каждого сотрудника есть имя.
        //
        //Правила расчета зарплаты:
        //У каждого сотрудника в засимости от типа есть поля:
        //для фиксированная зарплата — месячный оклад
        //для почасовая — количество часов × ставка
        //для процентная — процент × сумма продаж
        //
        //Нужно реализовать систему, которая может выплатить зарплату всем сотрудникам.
        //
        //Требование:
        //
        //Метод, который выплачивает зарплату, должен работать со списком сотрудников, не зная их конкретный тип.
        //Каждый тип сотрудника должен сам рассчитывать свою зарплату.
        //




    }

}
