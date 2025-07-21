package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XIII_TRIPLETS_WITH_SMALLER_SUM {
    public static void main(String[] args) {

        int arr[] = {5, 1, 3, 4, 7};
        int sum=12;
        for (int i=0;i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]<sum){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }



    }
}
