package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

public class XI_MERGE_OVERLAPPING_INTERVALS {
    public static void main(String[] args) {
        int arr[][] = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        int n = arr.length;

        // Step 1: Sort the intervals based on start time
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][0] > arr[j][0]) {
                    // Swap entire interval
                    int temp1 = arr[i][0];
                    int temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
            }
        }

        // Step 2: Merge overlapping intervals
        int[][] newarr = new int[n][2];
        int temp = 0;

        newarr[0][0] = arr[0][0];
        newarr[0][1] = arr[0][1];

        for (int i = 1; i < n; i++) {
            // If current interval overlaps with previous
            if (arr[i][0] <= newarr[temp][1]) {
                newarr[temp][1] = Math.max(newarr[temp][1], arr[i][1]);
            } else {
                // No overlap → move to next index in newarr
                temp++;
                newarr[temp][0] = arr[i][0];
                newarr[temp][1] = arr[i][1];
            }
        }

        // Step 3: Print the merged intervals
        System.out.println("Merged Intervals:");
        for (int k = 0; k <= temp; k++) {
            System.out.println(newarr[k][0] + " " + newarr[k][1]);
        }
    }
}
