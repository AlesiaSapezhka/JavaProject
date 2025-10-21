package practice5.Restarant;

public abstract class Dish {
    private final String dishName;
    private final int dishCost;

    Dish(String dishName, int dishCost) {
        this.dishName = dishName;
        this.dishCost = dishCost;
    }
    public void showInfo(){
        System.out.print("Название блюда: " + dishName + ". Цена блюда: " + dishCost + " руб");
    }
}
