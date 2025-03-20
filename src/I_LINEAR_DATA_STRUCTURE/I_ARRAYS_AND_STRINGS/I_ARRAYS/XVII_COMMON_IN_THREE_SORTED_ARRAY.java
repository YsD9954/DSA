package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class XVII_COMMON_IN_THREE_SORTED_ARRAY {
//    public static void main(String[] args) {
//        int a1[] = {1, 5, 10, 20, 40, 80};
//        int a2[] = {6, 7, 20, 80, 100};
//        int a3[] = {3, 4, 15, 20, 30, 70, 80, 120};
//
////        for (int i=0;i< arr1.length;i++){
////            for (int j=0;j< arr2.length;j++){
////                for (int k=0;k< arr3.length;k++){
////                    if(arr1[i]==arr2[j])
////                }
////            }
////        }
//
//
//        int[] answer = new int[a1.length + a2.length + a3.length];
//        int i,j,k;
//        for (i = 0; i < a1.length; i++)
//            answer[i] = a1[i];
//
//        for (j = 0; j < a2.length; j++)
//            answer[i++] = a2[j];
//
//        for (k = 0; k < a3.length; k++)
//            answer[i++] = a3[k];
//
//        for (i=0;i<answer.length;i++) {
//            System.out.print(answer[i] + " ");
//        }
//
//        System.out.println();
//
//        int visited = Integer.MAX_VALUE;
//        for (i=0;i<answer.length;i++){
//
//            for (j=i+1;j<answer.length;j++){
//                if(answer[i]==answer[j] && (visited != answer[i]&& visited != answer[j])){
//                    visited = answer[i];
//                    System.out.print(answer[i]+" ");
//
//                }
//            }
//
//
//
//        }



    public static List<Integer>
    commonElements(int[] A, int[] B, int[] C)
    {
        int i = 0, j = 0, k = 0;

        ArrayList<Integer> common = new ArrayList<>();

        // Iterate through three arrays while all arrays
        // have elements
        while (i < A.length && j < B.length
                && k < C.length) {
            // If A[i] == B[j] == C[k], add A[i] to common
            // elements
            if (A[i] == B[j] && B[j] == C[k]) {
                common.add(A[i]);
                i++;
                j++;
                k++;
                // Skip duplicate elements in A[]
                while (i < A.length && A[i] == A[i - 1])
                    i++;

                // Skip duplicate elements in B[]
                while (j < B.length && B[j] == B[j - 1])
                    j++;

                // Skip duplicate elements in C[]
                while (k < C.length && C[k] == C[k - 1])
                    k++;
            }

            // If A[i] < B[j], then ith element cannot be
            // common
            else if (A[i] < B[j])
                i++;

                // If B[j] < C[k], then jth element cannot be
                // common
            else if (B[j] < C[k])
                j++;
                // If C[k] is smallest, then kth element cannot
                // be common
            else
                k++;
        }

        return common;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Sample Input
        int[] A = { 1, 5, 10, 20, 30 };
        int[] B = { 5, 13, 15, 20 };
        int[] C = { 5, 20 };

        List<Integer> common = commonElements(A, B, C);

        System.out.print("Common Elements: ");
        for (int ele : common) {
            System.out.print(ele + " ");
        }
    }
}
