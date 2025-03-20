package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XI_fIND_THE_DUPLICATE {
    public static void main(String[] args) {
//        Input: nums = [1,3,4,2,2]
//        Output: 2
        int arr[] = {3,1,3,4,2};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Repeatitive Element: "+arr[i]);
                }
            }
        }

    }
}
