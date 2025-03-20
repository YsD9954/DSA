package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class VIII_KADANE_ALGORITHM_MAX_SUM_SUBARRAY {
    public static void main(String[] args) {

//        Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//        Output: 11
//        Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }

        System.out.println(max);
    }
}
