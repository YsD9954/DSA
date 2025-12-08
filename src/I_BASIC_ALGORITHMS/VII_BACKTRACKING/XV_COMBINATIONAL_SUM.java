package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XV_COMBINATIONAL_SUM {

    // Helper function
    static void helper(int[] arr, int i, List<Integer> combn, List<List<Integer>> ans, int target) {
        // Base case: if target is 0, valid combination found
        if (target == 0) {
            ans.add(new ArrayList<>(combn));
            return;
        }

        // If we've gone through all elements or target becomes negative
        if (i == arr.length || target < 0) {
            return;
        }

        // Include current element (can be included multiple times)
        combn.add(arr[i]);
        helper(arr, i, combn, ans, target - arr[i]); // Include again (same index)

        // Backtrack and exclude the current element
        combn.remove(combn.size() - 1);

        // Move to next index (exclude current)
        helper(arr, i + 1, combn, ans, target);
    }

    // Main function to call
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr); // Optional: helps avoid duplicates if needed
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combn = new ArrayList<>();

        helper(arr, 0, combn, ans, target);

        // Convert List<List<Integer>> to ArrayList<ArrayList<Integer>> for return
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        for (List<Integer> list : ans) {
            finalAns.add(new ArrayList<>(list));
        }

        return finalAns;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        ArrayList<ArrayList<Integer>> result = combinationSum(arr, target);
        for (ArrayList<Integer> list : result) {
            System.out.println(list);
        }
    }
}
