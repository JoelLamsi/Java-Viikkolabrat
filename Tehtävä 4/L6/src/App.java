import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}
