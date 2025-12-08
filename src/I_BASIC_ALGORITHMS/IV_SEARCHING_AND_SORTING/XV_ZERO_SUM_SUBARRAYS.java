package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

public class XV_ZERO_SUM_SUBARRAYS {
    public static void main(String[] args) {
        int arr[] = {0, 0, 5, 5, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            // Start j from i, not from 0
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    // Print the subarray from i to j
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(); // print one newline per valid subarray
                }
            }
        }
    }
}
