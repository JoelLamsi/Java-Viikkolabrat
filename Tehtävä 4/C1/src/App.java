import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String student;
        System.out.print("Enter student ('stop' to end): ");

        while (true) {
            student = sc.nextLine();
            if (student.equalsIgnoreCase("stop")) {
                break;
            }
            students.add(student);
        }
        sc.close();
        for (String s : students) {
            System.out.println(s);
        }
    }
}
