package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XIV_COUNT_INVERSIONS {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int count = 0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
