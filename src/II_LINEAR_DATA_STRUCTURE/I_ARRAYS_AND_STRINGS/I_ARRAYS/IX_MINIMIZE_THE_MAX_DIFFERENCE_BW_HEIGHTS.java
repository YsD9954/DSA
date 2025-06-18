package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class IX_MINIMIZE_THE_MAX_DIFFERENCE_BW_HEIGHTS {
    public static void main(String[] args) {
//        Input: k = 2, arr[] = {1, 5, 8, 10}
//        Output: 5
//        Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.

        int arr[] = {3, 9, 12, 16, 20};
        int k=3;
        for (int i=0;i< arr.length;i++){
            if(k>i){
                arr[i]=arr[i]+k;
            }
            else{
                arr[i]=arr[i]-k;
            }
        }

        System.out.println("Min Difference :- "+ (arr[arr.length-1]-arr[0]));


    }
}
