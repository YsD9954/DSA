package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class IV_MAXIMUM_OF_ALL_SUBARRAY {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3;

        for (int i=0;i<=arr.length-k;i++){
            int max=arr[i];
            for (int j=i;j<i+k;j++){
                if (arr[j]>max){
                    max=arr[j];
                }
//                or
//                max=Math.max(max,arr[j]); //this also works!
            }
            System.out.print(max+" ");
        }

    }
}
