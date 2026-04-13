package MockInterview;

public class Task1 {
    public static void main(String[] args) {
    System.out.println(ifBreaketsOrderIsCorrect("(())()()(()))))))))"));
    }

    public static boolean ifBreaketsOrderIsCorrect(String breaketsLine){
        char [] breakets = breaketsLine.toCharArray();
        int count =0;
        for(int i=0;i<breakets.length;i++){
            if(breakets.length>10){
               throw new IllegalArgumentException ("Breakets value can not be more than 10");
            }
            if (breakets[i]=='('){
                count++;
            } else if (breakets[i]==')'){
                count--;
            }
        }
        return count==0;
    }
    // Задача 19:
    // Проверка сбалансированны
    // (()))
    // tru/false
}
