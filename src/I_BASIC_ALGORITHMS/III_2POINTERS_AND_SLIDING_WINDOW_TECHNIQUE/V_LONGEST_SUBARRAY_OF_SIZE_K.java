package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class V_LONGEST_SUBARRAY_OF_SIZE_K {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=5; //sum hhai yaha nbot window size!!

//        now this is variable size window!!
//        aslo sioze is basically sum !! so wwe need sum
//        so hame sajha ki sliding wndow ka hi problem hai!!

        int max_subarray_size = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    max_subarray_size = Math.max(max_subarray_size, j - i + 1);
                }
            }
        }
        System.out.println(max_subarray_size);
    }
}
