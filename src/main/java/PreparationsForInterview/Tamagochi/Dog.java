package PreparationsForInterview.Tamagochi;

public class Dog extends Pet{

    private String food;
    private String placeOfSleep;

    public Dog(String name, String food, String placeOfSleep) {
        super(name);
        this.food = food;
        this.placeOfSleep = placeOfSleep;
    }

    @Override
    public void eat(){
      System.out.println(getName() + " eat " + food);
    }

    @Override
    public void sleep(){
        System.out.println(getName() + " sleep on " + placeOfSleep);
    }
}
