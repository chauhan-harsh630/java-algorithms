package Arrays.Problem;
public class Plus_One {
    public static int[] plus_one(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0]=1;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int[] ans = plus_one(arr);
        for(int k=0;k<ans.length;k++){
        System.out.println(ans[k]);
        }
    }
}
