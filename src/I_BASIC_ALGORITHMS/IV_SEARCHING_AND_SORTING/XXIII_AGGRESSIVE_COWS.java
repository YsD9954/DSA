package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

import java.util.Arrays;

public class XXIII_AGGRESSIVE_COWS {
    public static void main(String[] args) {
        int N = 5;
        int C = 3;
        int[] arr = {1, 2, 8, 4, 9};

        // Step 1: Sort the stall positions
        Arrays.sort(arr);

        // Step 2: Binary Search initialization
        int low = 1;
        int high = arr[N - 1] - arr[0];
        int ans = 0;

        // Step 3: Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            // Try to place cows with at least 'mid' distance
            int count = 1; // First cow at first stall
            int lastPos = arr[0];

            for (int i = 1; i < N; i++) {
                if (arr[i] - lastPos >= mid) {
                    count++;
                    lastPos = arr[i];
                }
            }

            if (count >= C) {
                ans = mid;        // Valid, try bigger distance
                low = mid + 1;
            } else {
                high = mid - 1;   // Not enough space, try smaller
            }
        }

        // Step 4: Output the answer
        System.out.println(ans);
    }
}
