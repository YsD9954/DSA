package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XII_MERGE_INTERVAL {

        public static int[][] merge(int[][] intervals) {
            // Step 1: Sort intervals by their start time
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            // Step 2: Create a list to store merged intervals
            List<int[]> merged = new ArrayList<>();

            for (int[] interval : intervals) {
                // If merged list is empty or current interval doesn't overlap, add it
                if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                    merged.add(interval);
                } else {
                    // If there's overlap, merge the intervals by updating the end time
                    merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
                }
            }

            // Convert the list to a 2D array and return
            return merged.toArray(new int[merged.size()][]);
        }

        public static void main(String[] args) {
            // Example usage
            int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
            int[][] intervals2 = {{1, 4}, {4, 5}};

            System.out.println("Merge Interval I - "+Arrays.deepToString(merge(intervals1))); // Output: [[1, 6], [8, 10], [15, 18]]
            System.out.println("Merge Interval II - "+Arrays.deepToString(merge(intervals2))); // Output: [[1, 5]]
        }
    }
