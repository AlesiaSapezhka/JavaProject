package PreparationsForInterview.OOPInJava;

public class HealthBoost implements BonusEffect {
    int bonusAmount;
    public HealthBoost(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    @Override
    public void applyTo(PlayerGam player) {
        bonusAmount=bonusAmount*10;
        System.out.println("Bonus amount is "+bonusAmount);
    }
}
