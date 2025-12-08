package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XVII_MAX_VALUE_PERMUTATION {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        Arrays.sort(arr);
        long maxsum=0;
        int MOD = 1000000007;

        for(int i=0;i<arr.length;i++){
            // arr[i]=arr[i]*i;
            // maxsum+=arr[i];

            maxsum = (maxsum + ((long)arr[i] * i) % MOD) % MOD;

        }
        System.out.println((int)maxsum);
    }
}
