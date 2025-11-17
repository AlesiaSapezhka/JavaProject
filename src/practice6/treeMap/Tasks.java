package practice6.treeMap;

import java.util.TreeMap;

public class Tasks {
    //Задача 1:
    //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
    TreeMap <String, Integer> treeMap = new TreeMap<String, Integer>();
    public void addValue(String name, int value) {
        treeMap.put(name, value);
    }
    //Задача 2:
    //Найдите минимальный и максимальный ключ в TreeMap.
    public String maxKey(){
        return treeMap.lastKey();
    }
    public String minKey(){
        return treeMap.firstKey();
    }
    //Задача 3:
    //Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

    TreeMap<Integer, String> employeesId = new TreeMap<Integer, String>();
    public void findHignerKey(Integer id){
        if (employeesId.higherKey(id) != null){
           System.out.println(employeesId.higherKey(id));
        } else {
            System.out.println("Higher Id not found");
        }
    }
    public void addEmployee(Integer id, String name){
        employeesId.put(id, name);
    }
}
