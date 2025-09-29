import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.print("Lajiteltu: " + list);
    }
}
