package Arrays.Problem;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Example implementation: return an empty array for now
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] {};
    }
	public static void main(String[] args) {
        int arr[] = { 2, 7, 3, 8 };
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Index of the sum of number: [" + (result.length > 0 ? result[0] + ", " + result[1] : "No solution") + "]");
    }
}
