package practice5.Restaurant;

public class HotDish extends Dish {
    private final int TEMPERATURE = 50;
    private final int temperature; // После сохранения автоматически добавляется файнал

    public HotDish(String dishName, int dishCost) {
        super(dishName, dishCost);
        this.temperature = TEMPERATURE;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(". Температура блюда " + this.temperature + " градусов");
    }
}
