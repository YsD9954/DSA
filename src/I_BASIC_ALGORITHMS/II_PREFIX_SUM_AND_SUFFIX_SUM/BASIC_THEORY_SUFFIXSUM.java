//package I_BASIC_ALGORITHMS.II_PREFIX_SUM_AND_SUFFIX_SUM;
////
////Take A = {2, 1, 3, 4, 5}
////        Now suffix sum means → each position stores the sum of elements from that index to the end.
////
////        So output will be:
////
////        suff = {15, 13, 12, 9, 5}
////        Step-by-step expansion
////        suff[4] = A[4] = 5
////        suff[3] = A[3] + A[4] = 4 + 5 = 9
////        suff[2] = A[2] + A[3] + A[4] = 3 + 4 + 5 = 12
////        suff[1] = A[1] + A[2] + A[3] + A[4] = 1 + 3 + 4 + 5 = 13
////        suff[0] = A[0] + A[1] + A[2] + A[3] + A[4] = 2 + 1 + 3 + 4 + 5 = 15
////        General Pattern
////        If you observe carefully:
////        suff[n-1] = A[n-1]
////        suff[n-2] = A[n-2] + suff[n-1]
////        suff[n-3] = A[n-3] + suff[n-2]
////        :
////        :
////        suff[i] = A[i] + suff[i+1]
////
////        Algorithm
////        For any i ≤ n-2:
////        suff[i] = A[i] + suff[i+1]
//
//class BASIC_THEORY_SUFFIXSUM {
//    public static void main(String[] args) {
//        int A[] = {2, 1, 3, 4, 5};
//        // suffix array
//        int suff[] = new int[A.length];
//        // last element same as original
//        suff[A.length - 1] = A[A.length - 1];
//        // build suffix sums
//        for (int i = A.length - 2; i >= 0; i--) {
//            suff[i] = A[i] + suff[i + 1];
//        }
//        // print suffix array
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(suff[i] + " ");
//        }
//    }
//}