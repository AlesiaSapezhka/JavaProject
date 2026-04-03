package practice6.treeMap;

public class Main {
    public static void main(String[] args) {
    //        Задача 1:
    //        Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
          Tasks marks = new Tasks();
          marks.addValue("Ivan", 89);
          marks.addValue("Alex", 29);
          marks.addValue("Petr", 79);
          marks.addValue("Kate", 80);
          marks.addValue("Rita", 81);
          System.out.println(marks.treeMap);

    //        Задача 2:
    //        Найдите минимальный и максимальный ключ в TreeMap.
          System.out.println("Max key: " + marks.minKey() + " .Min key: "+ marks.maxKey());

    //        Задача 3:
    //        Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

        Tasks employees = new Tasks();
        employees.addEmployee(100, "Ivan");
        employees.addEmployee(10, "Alex");
        employees.addEmployee(2000, "Igor");
        employees.findHignerKey(3990);

    }
}
