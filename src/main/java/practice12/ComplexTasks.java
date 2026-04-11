package practice12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ComplexTasks {
    public static void main(String[] args) {
//        task1();
//        task2();

        //Задача 5:
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//
//        for (String elem : list) {
//            if (elem.equals("a")) {
//                list.remove(elem);
//            }
//        }
// Ошибка, внутри for each нельзя делать операции изменяющие лист
    }

//Задача 1:
    public static void task1() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }
// map: d2
// anyMatch: D2
//map: a2
// anyMatch: A2


    public static void task2() {
        Stream<Integer> stream =
                Stream.of(1, 2, 3, 4, 5).filter(i -> i % 2 != 0);
        stream.forEach(System.out::println);
        System.out.println(stream.reduce(5, Integer::sum));
    }
// 1, 3, 5
//14 - Не верно, ибо поток нельзя запустить дважды!!!


//Задача 2:
//public static int prepareCollection() {
//Set<A> set = new HashSet<>();
//set.add(new A());
//set.add(new B());
//set.add(new B());
//return set.size();
//}
// Ошибка в передаче типа А в Set
// Отсутсвует создание классов А и В.

    }
