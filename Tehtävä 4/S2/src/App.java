import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> nums = new HashSet<>();
        nums.add(2);
        nums.add(4);
        nums.add(4);
        nums.add(6);
        System.out.print(nums);
    }
}
