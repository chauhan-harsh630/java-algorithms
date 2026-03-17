package Arrays.Problem;

public class RemoveDuplicate {
    public static int RemoveDuplicateSortArray(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) 

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            return i + 1;
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4 };
        int result = RemoveDuplicateSortArray(arr);
        System.out.println(result); 
    }
}
