package PreparationsForInterview.RandomTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int [] array = {3,4,5,6,7,8};
        System.out.println(ifArrayContaonsElemnet(array,51));

        Object [] arrayWithDiffElements = {"hi", "hello", "java", 6, 7, 8};
        System.out.println(ifArrayContaonsElemnet1(arrayWithDiffElements,"7"));

    }

    // Даётся массив и элемент
    // true если массив содержит элемент, false если не содержит
    public static boolean ifArrayContaonsElemnet( int [] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }

    public static boolean ifArrayContaonsElemnet1(Object [] array, Object element){
       ArrayList <Object> arrayString = new ArrayList(Arrays.asList(array));
            return arrayString.contains(element);
        }
    }

