import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> words = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Enter word ('stop' to end): ");

        while (true) {
            word = sc.nextLine();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(word.toLowerCase());
        }
        sc.close();
        
        System.out.print("Amount unique words: " + words.size());
    }
}
