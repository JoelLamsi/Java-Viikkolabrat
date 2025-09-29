import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> alphabets = new LinkedList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.remove("B");
        System.out.println(alphabets);
    }
},
