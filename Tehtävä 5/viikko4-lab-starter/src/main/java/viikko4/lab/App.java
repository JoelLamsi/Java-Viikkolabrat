package viikko4.lab;

public class App {
    public static void main(String[] args) {
        PowerBank pb = new PowerBank("Tehopankki", 98);
        System.out.printf("%s akun tila: %d\n", pb.name, pb.batteryPercent());
        pb.recharge(10);
        System.out.printf("%s akun tila: %d\n", pb.name, pb.batteryPercent());
    }
}
