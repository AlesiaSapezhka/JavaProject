package practice11;

public class DebugTask4 {
    public static void main(String[] args) {

        try {
            System.out.println(isPalindrome("PolloP"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            throw new NullPointerException("String is null or empty");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}