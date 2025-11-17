package practice6.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
//    Задача 3:
//    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

    ArrayList <String> list = new ArrayList<String>();

   public Set<String> removeDuplicates(List<String> input){
       HashSet<String> stringList = new HashSet<>();
       input.forEach(element -> stringList.add(element));
       return stringList;
   }

}
