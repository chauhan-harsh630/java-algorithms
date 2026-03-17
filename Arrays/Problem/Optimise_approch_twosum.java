package Arrays.Problem;

import java.util.HashSet;

public class Optimise_approch_twosum {
    public boolean twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }           
}
