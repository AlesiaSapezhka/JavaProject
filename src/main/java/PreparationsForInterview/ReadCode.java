package PreparationsForInterview;

import java.util.*;
import java.util.stream.Stream;

public class ReadCode {
    public static void main(String[] args) {


//        List<String> list = Arrays.asList("A", "BB", "CCC");
//         long count = list.stream().filter(s -> s.length() > 1).count();
//         System.out.println(count);


//        String a = null;
//         try {
//          if ("test".equals(a)) {
//          System.out.println("equal");
//          } else {
//          System.out.println("not equal");
//          }
//         } catch (Exception e) {
//          System.out.println("exception");
//         }


//        String a = null;
//         try {
//          if (a.equals("test")) {
//          System.out.println("equal");
//          }
//         } catch (Exception e) {
//          System.out.println("exception");
//         }
//
//
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//         int sum = nums.stream().mapToInt(i -> i * 2).sum();
//         System.out.println(sum);
//
//
//        for (int i = 0; i < 3; i++) {
//          try {
//          if (i == 1) throw new RuntimeException();
//          System.out.print(i);
//          } catch (Exception e) {
//          System.out.print("E");
//          }
//         }
//
//        String a1= "java";
//        String b = new String("java").intern();
//        System.out.println(a1 == b);
//
//
//        StringBuilder sb1 = new StringBuilder("abc");
//         StringBuilder sb2 = new StringBuilder("abc");
//         System.out.println(sb1.equals(sb2));



//        List<String> list = Arrays.asList("x", "y", "z");
//         list.forEach(s -> {
//          if (s.equals("y")) throw new RuntimeException();
//          System.out.print(s);
//         });


//
//        Integer s1 = 1; // aaaa
//         Integer s2 = s1;
//         for (int i = 0; i < 3; i++) {
//          s1 += 1;
//          System.out.println(s1 == s2);
//         }


//        String a = "abc";
//         String b = "a" + "b" + "c";
//         String c = new String("abc");
//         System.out.println(a == b);
//         System.out.println(a == c);
//         System.out.println(a.equals(c));

//
//        try {
//          for (int i = 0; i < 3; i++) {
//          System.out.println("Start " + i);
//          if (i == 1) throw new Exception();
//          System.out.println("End " + i);
//          }
//         } catch (Exception e) {
//          System.out.println("Caught");
//         }

//        List<String> list = Arrays.asList("one", "two", "three"); //ONE
//         list.stream().peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);
//

//        String a2 = "x";
//         for (int i = 0; i < 3; i++) {
//          a2 += i;
//          System.out.println(a2);
//         }
//         System.out.println(a2 == "x012");
//

//        List<Integer> list = Arrays.asList(1, 2, 3);
//         list.stream().map(i -> {
//          System.out.println("mapping: " + i);
//          return i * 2;
//         }).filter(i -> {
//          System.out.println("filtering: " + i);
//          return i > 2;
//         }).forEach(System.out::println);

        //"StringBuilder sb = new StringBuilder(""x"");
        // for (int i = 0; i < 3; i++) {
        //  sb.append(i);
        //  System.out.println(sb);
        // }"


//        String str = "test"; // [ t e s t ]
//         for (char c : str.toCharArray()) {
//          for (int i = 0; i < 2; i++) {
//          System.out.print(c + "-");
//          }
//          System.out.println();
//         }
//
//
//        int i = 0;// 1 //
//         do {
//          System.out.println(i);
//          i++;
//          if (i == 2) throw new RuntimeException("fail");
//         } while (i < 4);


//        List<String> list = Arrays.asList("a", "b", "c");
//         list.forEach(s -> {
//          System.out.println(s);
//          if ("b".equals(s)) {
//          throw new RuntimeException("Stop");
//          }
//         });
         // a
        // b

//        String a = "a";
//         String b = a + "b"; // ab
//         String c = "a" + "b"; // ab
//         System.out.println(b == "ab");
//         System.out.println(c == "ab");
//
//
//        List<String> list = Arrays.asList("A", "B", "C");
//         list.replaceAll(s -> {
//          System.out.println("Replacing: " + s);
//          return s.toLowerCase();
//         });
//         System.out.println(list);

//        try {
//          int[] arr = {1, 2, 3};
//          for (int i = 0; i <= arr.length; i++) {
//          System.out.println(arr[i]);
//          }
//         } catch (Exception e) {
//          System.out.println("Exception caught: " + e);
//         }
        // 1

        //"StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 3; i++) {
        //  sb.append(i);
        //  if (i == 1) throw new RuntimeException(""Boom"");
        //  System.out.println(sb);
        // }"


//        String s = "x"; //x01
//         for (int i = 0; i < 2; i++) {
//          s = s + i;
//          s.intern();
//         }
//         System.out.println(s == "x0" + "1");


//        List<Integer> list = Arrays.asList(1, 2, 3);
//         list.stream().flatMap(i -> {
//          System.out.println("flatMap: " + i);
//          return Stream.of(i, i * 10);
//         }).forEach(System.out::println);
//

//        String s = "java";
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();
//         System.out.println(s);
//         System.out.println(sb);

//        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
//         for (String s : list) {
//             System.out.println(s);
//             if (s.equals("b")) list.remove(s);
//         }

//
//        Map<String, Integer> map = new HashMap<>();   // x -, y -2, z -3
//         map.put("x", 1);
//         map.put("y", 2);
//         map.put("z", 3);
//         map.forEach((k, v) -> {
//          System.out.println(k + ":" + v);
//          if (k.equals("y")) map.remove(k);
//         });
//

//        String a = new String("test").intern();
//         String b = "test";
//         System.out.println(a == b);
//         System.out.println(a.equals(b));
//         
//        String a = "x";
//         a = a + 1;
//         a.intern();
//         System.out.println(a == "x1");
//
         
//        String s = null;
//         try {
//          if (s != null & s.length() > 0) System.out.println("Valid");
//          else System.out.println("Empty or null");
//         } catch (Exception e) {
//          System.out.println("Exception");
//         }

//        String s = null;
//         try {
//          if (s != null && s.length() > 0) System.out.println("Valid");
//          else System.out.println("Empty or null");
//         } catch (Exception e) {
//          System.out.println("Exception");
//         }

//        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
//         Iterator<String> it = list.iterator();
//         while (it.hasNext()) {
//          String val = it.next();
//          if (val.equals("B")) list.remove(val);
//          System.out.println(val);
//         }

//        String s1 = "abc";
//         String s2 = "a" + new String("bc");
//         System.out.println(s1 == s2);
//         System.out.println(s1.equals(s2));


//        List<Integer> list = Arrays.asList(1, 2, 3);     // 2 4 9
//         System.out.println(list.stream().map(i -> i * i).peek(System.out::println).reduce(0, Integer::sum));
////
//         StringBuilder sb1 = new StringBuilder("abc");
//         StringBuilder sb2 = new StringBuilder("abc");
//         System.out.println(sb1.toString().equals(sb2.toString()));
////
//////
//        String s = "ab";    // abc
//         s += "c";
//         String t = "abc";
//         System.out.println(s == t);
//         System.out.println(s.equals(t));
//
//        List<String> list = Arrays.asList("1", "2", "three", "4");
//         int sum = list.stream().mapToInt(Integer::parseInt).sum();
//         System.out.println(sum);
//
//        String s = "a";    // a0
//         for (int i = 0; i < 3; i++) {
//          s += i;
//          System.out.println(s.intern() == ("a" + i));
//         }
//        List<String> list = Arrays.asList("one", "two", "three");
//         list.stream()
//          .peek(s -> System.out.println("peek1: " + s))
//          .map(s -> {
//          System.out.println("map: " + s);
//          return s.toUpperCase();
//          })
//          .peek(s -> System.out.println("peek2:" + s))
//          .forEach(System.out::println);





        List<Integer> list = Arrays.asList(1, 2, 3);
         list.stream()
          .filter(i -> {
          System.out.println("filter: " + i);
          return i % 2 != 0;
          })
          .map(i -> {
          System.out.println("map: " + i);
          return i * 10;
          })
          .forEach(i -> System.out.println("forEach: " + i));
         
        Stream.of("x", "y", "z")        //xx
          .map(s -> {
          System.out.println("map: " + s);
          return s + s;
          })
          .limit(2)
          .forEach(s -> System.out.println("out: " + s));

              // map: x
        // out: xx 



        Stream.of("a", "bb", "ccc")
          .filter(s -> {
          System.out.println("filter: " + s);
          return s.length() > 1;
          })
          .sorted((a, b) -> {
          System.out.println("comparing: " + a + " & " + b);
          return b.length() - a.length();
          })
          .forEach(System.out::println);
        // filter: a & bb
        // comparing

        Stream.of("1", "2", "x")
          .map(s -> {
          System.out.println("map: " + s);
          return Integer.parseInt(s);
          })
          .forEach(System.out::println);
    }
}
