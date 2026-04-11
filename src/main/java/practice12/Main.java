package practice12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> lists =
                List.of(List.of("a", "b", "c"), List.of("d", "e", "f")); //[{a,b,c}, {d,e,f}]

        System.out.println(
                lists.stream()
                        .flatMap(list -> list.stream())
                        .peek(System.out::println)
                        .anyMatch(s -> s.equals("b"))
        );
    }
}
// a
// b
// d
// e
// f
// Неверно ибо flatMap склеивает два стрима в один, а я думала что это два разных стрима
