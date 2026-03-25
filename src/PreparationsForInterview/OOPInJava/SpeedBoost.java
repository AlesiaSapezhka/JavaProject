package PreparationsForInterview.OOPInJava;

public class SpeedBoost implements BonusEffect {
    int speed;
    public SpeedBoost(int speed) {
        this.speed = speed;
    }
    @Override
    public void applyTo(PlayerGam player) {
        speed=speed+10;
        System.out.println("Speed is "+speed);
    }
}
