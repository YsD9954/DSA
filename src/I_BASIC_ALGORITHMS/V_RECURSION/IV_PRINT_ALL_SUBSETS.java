package I_BASIC_ALGORITHMS.V_RECURSION;
import java.util.*;

public class IV_PRINT_ALL_SUBSETS {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void subsets(int i, int j, int[] nums, List<Integer> curr) {

        if (i == nums.length) {     // SAME BASE CASE STYLE
            ans.add(new ArrayList<>(curr));
            return;
        }

        // include nums[i]  (THIS REPLACES substring printing)
        curr.add(nums[i]);
        subsets(i + 1, j, nums, curr);

        // exclude nums[i]
        curr.remove(curr.size() - 1);
        subsets(i + 1, j, nums, curr);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        subsets(0, 0, nums, new ArrayList<>());

        System.out.println(ans);
    }
}


// only one differncde in substring and subset that si ki ..
//substring :- continous part hi lega!
//subset :- non continous bhi lega!!provided i<=j!!