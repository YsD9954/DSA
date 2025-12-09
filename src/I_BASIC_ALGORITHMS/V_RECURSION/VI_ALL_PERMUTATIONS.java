package I_BASIC_ALGORITHMS.V_RECURSION;

import java.util.ArrayList;
import java.util.List;

public class VI_ALL_PERMUTATIONS {
    public static void permute(int[] nums, List<Integer> curr, boolean[] used) {
        // base case
        if (curr.size() == nums.length) {
            System.out.println(curr);   // print one permutation
            return;
        }

        // try every unused number
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {

                // choose
                used[i] = true;
                curr.add(nums[i]);

                // explore
                permute(nums, curr, used);

                // un-choose (backtrack)
                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean[] used = new boolean[nums.length];
        permute(nums, new ArrayList<>(), used);
    }
}

