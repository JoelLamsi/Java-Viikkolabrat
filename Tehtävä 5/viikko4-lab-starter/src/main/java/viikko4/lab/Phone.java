package viikko4.lab;

public class Phone extends Device implements Rechargeable {
    private int battery;

    public Phone(String name, Integer b) {
        super(name);
        /* TODO */ 
        if (b < 0 || b > 100) throw new IllegalArgumentException("Puhelimen akulle annettu virheellinen arvo");
        this.battery = b;
    }

    public void use(Integer minutes) {
        /* TODO */ 
        if (battery > 0) {
            int consumption = minutes / 5;
            battery -= consumption;
            if (battery < 0) battery = 0;
        }
    }

    public void recharge(Integer minutes) {
        /* TODO */ 
        if ( battery < 100) {
            battery += (minutes / 2);
            if (battery > 100) battery = 100;
        }
    }


    public Integer batteryPercent() {
        return battery;
    }
}