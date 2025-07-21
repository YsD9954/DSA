//package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class XXIV_ALLOCATE_MINIMUM_PAGES {
//    public static void main(String[] args) {
//        int arr[] = {12,34,67,90};
//        int k=2;
//        int c=0;
//
//        int sum[] = new int[3];
//        for (int i=0;i<arr.length-1;i++){ //ek baar kam loop chalega kyuki
//            int sum1=0;
//            int sum2=0;
//            for (int j=0;j<=i;j++){
//                sum1+=arr[j];
//
//            }
//            for (int j=i+1;j<arr.length;j++){
//                sum2+=arr[j];
//
//            }
//            sum[c]=Math.max(sum1,sum2);
//            c++;
//            System.out.println(sum1+" "+sum2);
//        }
//
//
//        Arrays.sort(sum);
//        System.out.println(sum[0]);
//    }
//}





package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

import java.util.*;

public class XXIV_ALLOCATE_MINIMUM_PAGES {
    static int minMax = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 3;
        if (k>arr.length){
            System.out.println(-1);
        }
        else{
            // Generate all possible partitions into k contiguous blocks
            partition(arr, k, 0, new ArrayList<>());
            System.out.println("Minimum of max pages: " + minMax);
        }

    }

    static void partition(int[] arr, int k, int index, List<Integer> splitPoints) {
        if (splitPoints.size() == k - 1) {
            List<Integer> ranges = new ArrayList<>(splitPoints);
            ranges.add(arr.length); // add end point
            int start = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int end : ranges) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += arr[i];
                }
                maxSum = Math.max(maxSum, sum);
                start = end;
            }

            minMax = Math.min(minMax, maxSum);
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            splitPoints.add(i);
            partition(arr, k, i, splitPoints);
            splitPoints.remove(splitPoints.size() - 1);
        }
    }
}
