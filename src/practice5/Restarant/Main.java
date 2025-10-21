package practice5.Restarant;

public class Main {
    static void main(String[] args) {

        Dish hotDish = new HotDish("суп", 7);
        Dish drink = new Drink("сок", 2);
        Manager manager = new Manager();

        manager.addDish(hotDish); // у меня вопрос, при добавлении бдюда мы в аргумент передаем конкретно какое блюда добавить
        manager.showDish();
        manager.deleteDish();

        manager.addDish(drink);
        manager.showDish();
        manager.deleteDish();

        // manager.showDish();

    }
}
