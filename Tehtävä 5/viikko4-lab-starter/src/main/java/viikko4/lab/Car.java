package viikko4.lab;

public class Car extends Vehicle {
    private Double avgSpeedKmh;

    public Car(String name, Double s) {
        super(name);
        /* TODO */ 
        if (s <= 0) throw new IllegalArgumentException("Auton nopeus täytyy olla suurempi kuin 0");
        this.avgSpeedKmh = s;
    }

    public Double travelTimeHours(Double km) {
        /* TODO */ return avgSpeedKmh;
    }
}