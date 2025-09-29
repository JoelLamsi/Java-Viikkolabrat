import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3,"kolme");
        map.put(1, "yksi");
        map.put(2, "kaksi");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
