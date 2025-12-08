package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.PriorityQueue;

public class XII_MINIMUM_COST_OF_ROPES {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6}; // Change to test different inputs
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int rope : arr) {
            minHeap.add(rope);
        }

        int minCost = 0;

        // Only if there are at least 2 ropes, we need to connect
        while (minHeap.size() > 1) {
            int a = minHeap.poll();
            int b = minHeap.poll();
            int sum = a + b;
            minCost += sum;
            minHeap.add(sum);
        }

        System.out.println("COST = " + minCost);
    }
}
