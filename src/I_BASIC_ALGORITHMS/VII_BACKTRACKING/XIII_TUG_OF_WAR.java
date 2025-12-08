package I_BASIC_ALGORITHMS.VII_BACKTRACKING;
import java.util.*;

public class XIII_TUG_OF_WAR {

    static int minDiff = Integer.MAX_VALUE;
    static List<Integer> bestSubset = new ArrayList<>();

    static void tugOfWar(int[] arr) {
        int n = arr.length;
        boolean[] curr = new boolean[n];
        boolean[] sol = new boolean[n];

        helper(arr, n, 0, curr, sol, 0, 0, 0, 0, n / 2);

        System.out.println("Subset 1:");
        for (int i = 0; i < n; i++) {
            if (bestSubset.contains(i)) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nSubset 2:");
        for (int i = 0; i < n; i++) {
            if (!bestSubset.contains(i)) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void helper(int[] arr, int n, int idx,
                       boolean[] curr, boolean[] sol,
                       int selectedCount, int currSum,
                       int totalSum, int startIndex, int targetSize) {

        if (idx == n) return;

        // Enough elements selected
        if (selectedCount == targetSize) {
            int otherSum = totalSum - currSum;
            int diff = Math.abs(currSum - otherSum);

            if (diff < minDiff) {
                minDiff = diff;
                bestSubset.clear();
                for (int i = 0; i < n; i++) {
                    if (curr[i]) bestSubset.add(i);
                }
            }
            return;
        }

        // Try including this index
        curr[idx] = true;
        helper(arr, n, idx + 1, curr, sol, selectedCount + 1,
                currSum + arr[idx], totalSum, startIndex, targetSize);
        curr[idx] = false;

        // Try excluding this index
        helper(arr, n, idx + 1, curr, sol, selectedCount,
                currSum, totalSum, startIndex, targetSize);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 2, 1};
        int totalSum = 0;
        for (int num : arr) totalSum += num;

        tugOfWar(arr);
    }
}
