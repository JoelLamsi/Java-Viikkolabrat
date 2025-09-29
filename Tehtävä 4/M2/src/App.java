import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("A",10);
        m.put("B",20);
        m.put("C",30);
        System.out.println(m.entrySet());

        for (Map.Entry<String, Integer> x : m.entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }
    }
}
