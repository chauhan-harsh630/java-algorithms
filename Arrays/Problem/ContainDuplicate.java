package Arrays.Problem;
 import java.util.HashSet;

 public class ContainDuplicate {
    public static int Contain_Duplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return 1;
            }
            seen.add(num);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 3, 5, 6, 7 };
        int result = Contain_Duplicate(arr);
        System.out.println(result == 1 ? "true" : "false");
    }
}
