package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.ArrayList;
import java.util.Arrays;

public class X_JOB_SEQUENCING_PROBLEM {
    public static void main(String[] args) {

        int deadline[] = {4, 1, 1, 1}, profit[] = {20, 10, 40, 30};


        ArrayList<Integer> jobseqn = new ArrayList<>();
        int n = deadline.length;

        int jobs[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }

        // Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        // Find max deadline to size the slot array
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }

        int[] maxdead = new int[maxDeadline + 1];
        Arrays.fill(maxdead, -1);

        int count = 0;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int currDeadline = jobs[i][0];
            int currProfit = jobs[i][1];

            // Find latest free slot
            for (int k = currDeadline; k > 0; k--) {
                if (maxdead[k] == -1) {
                    count++;
                    maxProfit += currProfit; // Accumulate profit
                    maxdead[k] = currProfit; // mark slot as used
                    break;
                }
            }
        }

        jobseqn.add(count);
        jobseqn.add(maxProfit);

        System.out.println(jobseqn);
    }
}
