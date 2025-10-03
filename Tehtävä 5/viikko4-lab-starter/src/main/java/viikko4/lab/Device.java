package viikko4.lab;

public abstract class Device {
    protected String name;

    public Device(String name) {
        /* TODO */ 
        if (name.isBlank() || name == null) throw new IllegalArgumentException("Laitteella on oltava kelvollinen nimi");
        this.name = name;
    }

    public abstract Integer batteryPercent();
}