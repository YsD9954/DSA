package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;
public class XXVI_CHOCOLATE_DISTRIBUTION_PROBLEM {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56};
        int m = 5;
        int temp = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int difference = 0;
        int min = Integer.MAX_VALUE;
        int i=0;
        int j=m-1;
        while (j<arr.length){
            difference = arr[j]-arr[i];
            if (difference<min){
                min = difference;
            }
            i++;
            j++;
        }

        System.out.println(min);

    }
}
