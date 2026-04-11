package practice12;

//Задача 7:
class ExceptionProcess1 {
public static void main(String[] args) {

try {
try {
throw new Exception("");
} catch (RuntimeException e) {
System.out.print("1");
} finally {
System.out.print("2");
}
System.out.print("3");
} catch (Exception e) {
System.out.print("4");
} finally {
System.out.print("5");
}
System.out.print("6");
}
}
// 1
// 2
// 3
// 6