import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("A",1);
        m.put("B",2);
        m.put("C",3);
        System.out.println(m.get("A"));
    }
}
