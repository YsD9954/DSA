package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

import java.util.Arrays;
import java.util.Comparator;

public class XXVI_MAX_JOB_PROFIT {
    public static void main(String[] args) {
        int[][] job = {{1, 2, 50}, {3, 5, 20}, {6, 19, 100}, {2, 100, 200}};

        // Step 1: Sort jobs by end time
        Arrays.sort(job, Comparator.comparingInt(a -> a[1]));

        int[] dp = new int[job.length];
        dp[0] = job[0][2];

        for (int i = 1; i < job.length; i++) {
            int profit = job[i][2];
            int j = i - 1;

            // Find the last non-overlapping job
            while (j >= 0 && job[j][1] > job[i][0]) {
                j--;
            }

            if (j != -1) {
                profit += dp[j];
            }

            dp[i] = Math.max(profit, dp[i - 1]);
        }

        System.out.println("Max Profit: " + dp[job.length - 1]);
    }
}
