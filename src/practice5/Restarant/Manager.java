package practice5.Restarant;

public class Manager {
    private Dish dish;

     public void addDish(Dish dish) {
         System.out.println(dish + " Блюдо добавлено");
         this.dish = dish;
     }

     public void showDish() {
         System.out.println(dish);
         dish.showInfo();
     }

    public void deleteDish() {
        System.out.println(dish + " Блюдо удалено");
        this.dish = null;
    }
}
