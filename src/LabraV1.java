public class LabraV1 {
    // Tehtävä 1. Parillisuus
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Tehtävä 2. Luvun merkki
    public static String sign(int n) {
        if (n > 0) { return "positiivinen"; }
        else if (n < 0) { return "negatiivinen"; }
        else { return "nolla"; }
    }

    // Tehtävä 3. Luvun ominaisuudet
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        } else {
            String parity; 
            parity = (n % 2 == 0) ? "parillinen" : "pariton";
            String sign;
            sign = (n > 0) ? "positiivinen" : "negatiivinen";
            return sign + " " + parity;

        }
    }

    // Tehtävä 4. Kahden luvun järjestys
    public static String order2(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return String.valueOf(min) + "," + String.valueOf(max);
    }

    // Tehtävä 5. Kolmen luvun järjestys
    public static String order3(int a, int b, int c) {
        int min = Math.min(a,b);
        min = Math.min(min, c);
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int mid = (a + b + c) - min - max;
        return String.valueOf(min) + "," + String.valueOf(mid) + "," + String.valueOf(max);
    }

    // Tehtävä 6. Kertotaulun rivi
    public static String line(int n, int i) {
        int product = n * i;
        return String.valueOf(n) + " x " + String.valueOf(i) + " = " + String.valueOf(product) + "\n";
    }

    // Tehtävä 7. Kertotaulu 1..10
    public static String table10(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            output.append(line(n, i));
        }
        return output.toString();
    }

    // Tehtävä 8. Salasanan tarkistus
    public static boolean check(String s) {
        if (s == null) { return false; }
        else {
            return s.equals("java123");
        }
    }

    // Tehtävä 9. Salasanayritykset
    public static String login(String[] tries) {
        if (tries.length > 3) {
            return "Liian monta yritystä";
        } 
        else {
            for (int i = 0; i < tries.length; i++) {
                if (tries[i].equals("java123")) {
                    return "Tervetuloa!";
                }
            }
            return "Tunnistautuminen epäonnistui";  
        }
    }

    // Tehtävä 10. Taulukon tilastot
    public static double average(int[] a) {
        if (a.length == 0) return 0.0;
        double sum = 0.0;
        for (int i : a) {
            sum += i;
        }
        return sum / a.length;
    }

    public static int max(int[] a) {
        if (a.length == 0) return Integer.MIN_VALUE;
        int result = 0;
        for (int i : a) {
            if (i > result) result = i;
        }
        return result;
    }
}
