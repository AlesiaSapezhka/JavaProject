package PreparationsForInterview.RandomTasks;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(isPalindrom("ollO"));
    }

    public static int countVowels(String str) {
        char[] arr = str.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int countVowels = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i] == vowels[j]) {
                    countVowels++;
                }
            }

        }
        return countVowels;
    }

    public static boolean isPalindrom(String str) {
        // abba = abba

        char[] arrayOfLetters = str.toLowerCase().trim().toCharArray(); // [ a, b, b, a ]
        for (int i = 0; i < arrayOfLetters.length / 2; i++) {
            if (arrayOfLetters[i] != arrayOfLetters[arrayOfLetters.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

