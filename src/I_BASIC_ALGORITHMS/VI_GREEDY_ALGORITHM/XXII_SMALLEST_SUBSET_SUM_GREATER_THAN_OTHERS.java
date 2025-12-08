package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XXII_SMALLEST_SUBSET_SUM_GREATER_THAN_OTHERS {

    static int minSubset(int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        int sum2 = 0;
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum1 -= arr[i];
            sum2 += arr[i];
            count++;
            if (count <= arr.length && sum2 > sum1) {
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2, 17, 7, 3};
        System.out.println(minSubset(arr));
    }
}
