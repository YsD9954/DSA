package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XI_SUM_OF_ALL_QUADRUPLES {
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 7, 8};
        int target = 23;
        for (int i=0;i<arr.length-3;i++){
            for (int j=i+1;j<arr.length-2;j++){
                for (int k=j+1;k<arr.length-1;k++){
                    for (int l=k+1;l<arr.length;l++){
                        if (arr[i]+arr[j]+arr[k]+arr[l]==target){
                            System.out.println(arr[i]+","+arr[j]+","+arr[k]+","+arr[l]);
                        }
                    }
                }
            }
        }
    }
}
