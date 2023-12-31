import java.util.ArrayList;
import java.util.List;
public class Main {
    public static int SingleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(Integer.valueOf(num));
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,1,5,3};
        int singleNumber = SingleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}