public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int target2 = 10;
        int target3 = 18;
        int[] result = twoSum(nums, target);
        int[] result2 = twoSum(nums, target2);
        int[] result3 = twoSum(nums, target3);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}