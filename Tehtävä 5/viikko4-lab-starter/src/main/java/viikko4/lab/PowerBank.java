package viikko4.lab;

public class PowerBank extends Device implements Rechargeable {
    private int battery;

    public PowerBank(String name, Integer b) {
        super(name);
        /* TODO */ 
        if (b < 0 || b > 100) throw new IllegalArgumentException("Powerbankin akulle annettu virheellinen arvo");
        this.battery = b;
    }

    public void recharge(Integer minutes) {
        if (battery < 100) {
            battery += minutes;
            if (battery > 100) battery = 100;
        } }

    public void discharge(Integer minutes) {
        /* TODO */
        if (battery > 0) {
            battery -= (minutes / 3);
            if (battery < 0) battery = 0;
        }
    }

    public Integer batteryPercent() {
        return battery;
    }
}