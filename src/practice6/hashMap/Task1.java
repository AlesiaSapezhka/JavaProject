package practice6.hashMap;

import java.util.HashMap;

public class Task1 {
    //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    public void addPair(String name, int age ){
        hashMap.put(name, age);
    }

    //Проверьте, есть ли определённое имя в HashMap.
    public boolean containsName(String name){
        return hashMap.containsKey(name);
    }

    //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
    public void printChildMembers(){
        System.out.print("Members with age less than 18: ");
        hashMap.forEach((key,value)->{
            if(value<18){
                System.out.print(key + ", ");
            }
        });
    }

}
