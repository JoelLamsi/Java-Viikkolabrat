import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Teppo Esimerkki", "040-123456");
        phoneBook.put("Essi Asiakas", "040-765432");
        phoneBook.put("John Doe", "040-987654");

        Scanner sc = new Scanner(System.in);
        System.out.print("Kenen puhelinnumero haluat?: ");
        String name = sc.nextLine();

        String number = phoneBook.get(name);

        if (number != null) {
            System.out.println(name + " puhelinnumero: " + number);
        } else {
            System.out.println("Etsimäsi henkilön numeroa ei löytynyt");
        }

        sc.close();
    }
}
