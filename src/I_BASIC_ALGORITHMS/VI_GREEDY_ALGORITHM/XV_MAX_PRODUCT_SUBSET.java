package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class XV_MAX_PRODUCT_SUBSET {
//    public static void main(String[] args) {
////        System.out.println(-1*3);
//        int arr[] = { -2, 2, -2, -1, -10, -6, -5, -3, -6, -7};

//
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(Math.abs(arr[i])>Math.abs(arr[j])){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//
//                }
//            }
//        }
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//        if(arr.length==1){
//            System.out.println(arr[0]);
//        }
//        else{
//            long max=Integer.MIN_VALUE;
//            int product;
//            for (int i=0;i<arr.length-1;i++){
//                product=arr[i];
//                for (int j=i+1;j<arr.length;j++){
//                    product*=arr[j];
////                  System.out.println(product);
//                    max=Math.max(max,product);
//                }
//            }
//            System.out.println(max);
//
//        }

//        BHAI PROBLEM HAI BC...

//    }
//}

        static int maxProductSubset(int a[], int n) {
            if (n == 1) {
                return a[0];
            }

            // Find count of negative numbers, count
            // of zeros, negative number
            // with least absolute value
            // and product of non-zero numbers
            int max_neg = Integer.MIN_VALUE;
            int count_neg = 0, count_zero = 0;
            int prod = 1;
            for (int i = 0; i < n; i++) {

                // If number is 0, we don't
                // multiply it with product.
                if (a[i] == 0) {
                    count_zero++;
                    continue;
                }

                // Count negatives and keep
                // track of negative number
                // with least absolute value.
                if (a[i] < 0) {
                    count_neg++;
                    max_neg = Math.max(max_neg, a[i]);
                }

                prod = prod * a[i];
            }

            // If there are all zeros
            if (count_zero == n) {
                return 0;
            }

            // If there are odd number of
            // negative numbers
            if (count_neg % 2 == 1) {

                // Exceptional case: There is only
                // negative and all other are zeros
                if (count_neg == 1
                        && count_zero > 0
                        && count_zero + count_neg == n) {
                    return 0;
                }

                // Otherwise result is product of
                // all non-zeros divided by
                //negative number with
                // least absolute value.
                prod = prod / max_neg;
            }

            return prod;
        }

        // Driver Code
        public static void main(String[] args) {
            int a[] = {-1, -1, -2, 4, 3};
            int n = a.length;
            System.out.println(maxProductSubset(a, n));

        }
}
