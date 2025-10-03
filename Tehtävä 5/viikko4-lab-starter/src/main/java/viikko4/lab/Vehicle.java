package viikko4.lab;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        /* TODO */ 
        if (name.isBlank() || name == null) throw new IllegalArgumentException("Kulkuneuvolle annettu virheellinen nimi");
        this.name = name;
    }

    public abstract Double travelTimeHours(Double km);
}