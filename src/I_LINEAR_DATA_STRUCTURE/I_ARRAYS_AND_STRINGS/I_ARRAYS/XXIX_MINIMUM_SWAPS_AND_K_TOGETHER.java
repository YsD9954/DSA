//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;
//
//public class XXIX_MINIMUM_SWAPS_AND_K_TOGETHER {
//    public static void main(String[] args) {
//        int arr[] = {2, 1, 5, 6, 3};
//        int k=3;
//        int count=0;
//        int temp =0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<k){
//                continue;
//            }
//            if (arr[i]>k){
//                for (int j=i+1;j<arr.length;j++){
//                    if(arr[j]<k){
//                        temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        count++;
//                    }
//                }
//            }
//        }
//
//        System.out.println(count);
//    }
//            }



package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

        public class XXIX_MINIMUM_SWAPS_AND_K_TOGETHER {
            public static void main(String[] args) {
                int arr[] = {2, 1, 5, 6, 3};
                int k = 3;
                int count = 0;

                // Find the first element greater than k
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > k) {
                        // Find the next element less than or equal to k to swap
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[j] <= k) {
                                // Swap arr[i] and arr[j]
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                                count++; // Increment swap count
                                break; // Move to the next element after swapping
                            }
                        }
                    }
                }

                System.out.println(count); // Print the minimum swaps
            }
        }



