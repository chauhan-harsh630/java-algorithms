package Arrays.Problem;

public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 4 };
        int val = 2;
        int ans = removeElement(arr, val);
        System.out.println(ans);
    }
}
