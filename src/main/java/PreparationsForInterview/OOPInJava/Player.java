package PreparationsForInterview.OOPInJava;

public class Player {
    //  Создай класс Player, который содержит поле health.
    // Значение health нельзя установить напрямую. Должны быть методы takeDamage(int dmg) и heal(int hp), которые управляют изменением.
    // Значение не может выходить за пределы 0–100.
    private int health;
    public int takeDamage(int dmg){
        if (health-dmg>0) {
            health -= dmg;
        } else{
          health=0;
        }
        return health;
    }

    public int heal(int hp){
        if(health+hp<=100) {
            health += hp;
        } else {
            health=100;
        }
        return health;
    }
}
