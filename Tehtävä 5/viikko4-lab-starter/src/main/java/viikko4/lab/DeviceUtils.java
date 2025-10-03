package viikko4.lab;

public class DeviceUtils {
    private DeviceUtils() {
    }

    public static int averageBattery(Device[] ds) {
        /* TODO */ 
        int sum = 0;
        for (Device device : ds) {
            sum += device.batteryPercent();
        }


        return sum / ds.length;
    }
}