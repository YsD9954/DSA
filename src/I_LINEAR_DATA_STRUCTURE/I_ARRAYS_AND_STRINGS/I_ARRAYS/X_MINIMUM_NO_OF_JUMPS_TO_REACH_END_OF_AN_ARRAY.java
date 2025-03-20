package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class X_MINIMUM_NO_OF_JUMPS_TO_REACH_END_OF_AN_ARRAY {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // Check if the first element is 0 or array has only one element
        if (arr[0] == 0 && arr.length > 1) {
            System.out.println("-1"); // Cannot proceed if the first element is 0
            return;
        }

        int n = arr.length;
        int count = 0; // To track the number of jumps
        int currentEnd = 0; // The range we can jump within the current jump
        int farthest = 0; // The farthest index reachable

        for (int i = 0; i < n - 1; i++) {
            // Update the farthest index we can reach
            farthest = Math.max(farthest, i + arr[i]);

            // If we reach the end of the current range, we need another jump
            if (i == currentEnd) {
                count++;
                currentEnd = farthest;

                // If the current end surpasses or reaches the last index, break
                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        // If we can't reach the end
        if (currentEnd < n - 1) {
            System.out.println("-1");
        } else {
            System.out.println(count); // Print the total number of jumps
        }
    }
}
