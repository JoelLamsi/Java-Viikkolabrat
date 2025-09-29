import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1,"Punainen");
        colors.put(2,"Sininen");
        colors.put(3,"Keltainen");

        for (Map.Entry<Integer, String> c : colors.entrySet()) {
            System.out.print(c.getKey() + " ");
        }
    }
}