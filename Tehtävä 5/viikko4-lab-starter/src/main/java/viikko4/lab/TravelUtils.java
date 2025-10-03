package viikko4.lab;

public final class TravelUtils {
    private TravelUtils() {
    }

    public static Double sumTravelTimes(Vehicle[] arr, Double km) {
        /* TODO */ 
        if (arr == null || km == null || km <= 0) {
            throw new IllegalArgumentException("Ajoneuvon kokonaisaikaa ei voida laskea virheellisten arvojen vuoksi");
        }
        Double totalTravelTime = 0.0;

        for (Vehicle v : arr) {
            totalTravelTime += km /v.travelTimeHours(km);
        }

        return totalTravelTime;
    }
}