package PreparationsForInterview.Static_Final_AM;

public class Person {
    private int age;

    public Person (int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        if (age>=0){
            this.age=newAge;
        }
    }

    public void increaseAge(int years){
        this.age = age + years;
    }
}
