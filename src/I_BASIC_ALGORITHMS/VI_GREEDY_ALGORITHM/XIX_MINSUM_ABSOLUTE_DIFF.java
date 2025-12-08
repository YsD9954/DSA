package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XIX_MINSUM_ABSOLUTE_DIFF {

    public static void main(String[] args) {

        int N = 4;
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        long sum=0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<N;i++){
            sum+= Math.abs(A[i]-B[i]);
        }

        System.out.println(sum);
    }

}
