package PreparationsForInterview.FirstJavaProject;

public class TV {
    String brand;
    boolean isOn;

    public static boolean togglePower(boolean isOn) {
        isOn = !isOn;
        return isOn;
    }
}
