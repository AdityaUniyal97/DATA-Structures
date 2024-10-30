package A_LeetCode;

public class Problem_268 {
    public int missingNumber(int[] nums) {
        int num = nums.length;
        
        // XOR all indices and values to find the missing number
        for (int i = 0; i < nums.length; i++) {
            num ^= i ^ nums[i];
        }
        
        return num;
    }

    public static void main(String[] args) {
        Problem_268 solution = new Problem_268();

        int[] nums1 = {3, 0, 1};
        System.out.println("Input: nums = [3, 0, 1]");
        System.out.println("Missing number: " + solution.missingNumber(nums1));

        int[] nums2 = {0, 1};
        System.out.println("Input: nums = [0, 1]");
        System.out.println("Missing number: " + solution.missingNumber(nums2));
    }
}
