import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Syötä lause: ");
        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();
        
        for (String w : words) {
            wordsMap.put(w, wordsMap.getOrDefault(w, 0)+1);
        }

        System.out.println("Sanojen frekvenssi lauseessa '" + sentence + "':");
        for (Map.Entry<String, Integer> e : wordsMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        sc.close();
     }
}
