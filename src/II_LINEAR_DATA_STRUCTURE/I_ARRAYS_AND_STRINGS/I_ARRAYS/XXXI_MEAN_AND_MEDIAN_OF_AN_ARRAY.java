package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXXI_MEAN_AND_MEDIAN_OF_AN_ARRAY {
    public static void main(String[] args) {
        int arr[] = {90, 100, 78, 89, 67};
        int sum = 0;
        int temp=0;

        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("MEAN = "+sum/arr.length);

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("MEDIAN = "+arr[arr.length/2]);

    }
}
