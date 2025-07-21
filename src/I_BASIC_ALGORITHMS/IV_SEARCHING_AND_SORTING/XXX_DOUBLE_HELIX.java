//package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
//
//public class XXX_DOUBLE_HELIX {
//    public static void main(String[] args) {
//        int first[] = {3,5,7,9,20,25,30,40,55,56,57,60,62};
//        int second[] = {1, 4, 7, 11, 14, 25, 44, 47, 55, 57, 100};
//
//
//        if (first.length>second.length){
//            for (int i=0;i<first.length;i++){
//
//                for (int j=0;j<second.length;j++){
//                    if (first[i]==second[j]){
//                        System.out.println(first[i]);
//                    }
//                }
//            }
//        }
//        else {
//            for (int i=0;i<second.length;i++){
//                for (int j=0;j<first.length;j++){
//                    if (second[i]==first[j]){
//                        System.out.println(second[i]);
//                    }
//                }
//            }
//        }
//
//
//
//
//
//    }
//}



package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXX_DOUBLE_HELIX {
    public static void main(String[] args) {
        int[] first = {3, 5, 7, 9, 20, 25, 30, 40, 55, 56, 57, 60, 62};
        int[] second = {1, 4, 7, 11, 14, 25, 44, 47, 55, 57, 100};

        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, total = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                sum1 += first[i];
                i++;
            } else if (first[i] > second[j]) {
                sum2 += second[j];
                j++;
            } else {
                // Found a common element
                total += Math.max(sum1, sum2) + first[i]; // add max path + common element
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements after last common point
        while (i < first.length) {
            sum1 += first[i];
            i++;
        }

        while (j < second.length) {
            sum2 += second[j];
            j++;
        }

        total += Math.max(sum1, sum2);

        System.out.println("Maximum sum path: " + total);
    }
}
