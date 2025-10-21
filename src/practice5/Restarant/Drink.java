package practice5.Restarant;

public class Drink extends Dish {

        private final int VOLUME = 100;
        private final int volume; // После сохранения автоматически добавляется файнал

        public Drink(String dishName, int dishCost) {
            super(dishName, dishCost);
            this.volume = VOLUME;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println(". Объём напитка " + this.volume + " мг");
        }
    }
