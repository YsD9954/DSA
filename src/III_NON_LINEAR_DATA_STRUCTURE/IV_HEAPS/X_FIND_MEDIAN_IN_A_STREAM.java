package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class X_FIND_MEDIAN_IN_A_STREAM {
    public static void main(String[] args) {
        int arr[] = {5, 15, 1, 3, 2, 8};
        double[] ans = new double[arr.length];

        // Max heap for left half
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        // Min heap for right half
        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Step 1: Add to appropriate heap
            if (left.isEmpty() || num <= left.peek()) {
                left.add(num);
            } else {
                right.add(num);
            }

            // Step 2: Balance the heaps
            if (left.size() > right.size() + 1) {
                right.add(left.poll());
            } else if (right.size() > left.size()) {
                left.add(right.poll());
            }

            // Step 3: Calculate median
            if ((i + 1) % 2 == 0) {
                ans[i] = (left.peek() + right.peek()) / 2.0;
            } else {
                ans[i] = left.peek();
            }

            // Print median at current step
            System.out.println("Median after inserting " + num + " = " + ans[i]);
        }
    }
}
