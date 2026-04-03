package PreparationsForInterview.Static_Final_AM;

public class Device {
    //  Каждое создаваемое устройство должно автоматически получать имя по шаблону: "Device_1", "Device_2", и т.д.
    // Имя не должно изменяться после создания.
    // Пояснение: используй счётчик на уровне класса и финальное поле на уровне объекта.

    private final String deviceName;
    private static int deviceCount = 0;

    public Device(String deviceName) {
       deviceCount++;
       this.deviceName = "Device_" + deviceCount;
    }

    public String getDeviceName() {
        return deviceName;
    }


}
