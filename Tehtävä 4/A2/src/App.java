import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("raspberry");
        words.add("bicycle");
        words.add("pc");
        words.sort(Comparator.comparingInt(String::length));
        System.out.print("Lista lajiteltu pituuden mukaan: " + words);
    }
}
