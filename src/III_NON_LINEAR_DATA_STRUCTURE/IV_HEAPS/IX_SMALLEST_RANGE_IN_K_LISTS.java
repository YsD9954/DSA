package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.*;

class Element {
    int value, row, col;

    Element(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}

public class IX_SMALLEST_RANGE_IN_K_LISTS {

    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 9, 12, 15},
                {0, 8, 10, 14, 20},
                {6, 12, 16, 30, 50}
        };

        int[] range = findSmallestRange(arr);
        System.out.println("Smallest Range is: [" + range[0] + ", " + range[1] + "]");
    }

    public static int[] findSmallestRange(int[][] nums) {
        int k = nums.length;
        PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);
        int max = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;

        // Initialize minHeap and max
        for (int i = 0; i < k; i++) {
            minHeap.add(new Element(nums[i][0], i, 0));
            max = Math.max(max, nums[i][0]);
        }

        while (true) {
            Element curr = minHeap.poll();
            int min = curr.value;

            // Update result if this range is smaller
            if (max - min < end - start) {
                start = min;
                end = max;
            }

            // Move to next element in the same list
            if (curr.col + 1 < nums[curr.row].length) {
                int nextVal = nums[curr.row][curr.col + 1];
                minHeap.add(new Element(nextVal, curr.row, curr.col + 1));
                max = Math.max(max, nextVal);
            } else {
                // One of the lists is exhausted — can't continue
                break;
            }
        }

        return new int[]{start, end};
    }
}
