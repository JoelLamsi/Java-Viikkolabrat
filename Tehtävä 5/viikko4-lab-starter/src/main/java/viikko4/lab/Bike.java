package viikko4.lab;

public class Bike extends Vehicle {
    private Double avgSpeedKmh;

    public Bike(String name, Double s) {
        super(name);
        /* TODO */ 
        if (s <= 0) throw new IllegalArgumentException("Pyörän nopeus täytyy olla suurempi kuin 0");
        this.avgSpeedKmh = s;
    }

    public Double travelTimeHours(Double km) {
        /* TODO */ return avgSpeedKmh;
    }
}