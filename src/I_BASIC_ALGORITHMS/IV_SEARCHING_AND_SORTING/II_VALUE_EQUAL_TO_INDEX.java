package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class II_VALUE_EQUAL_TO_INDEX {
    public static void main(String[] args) {
        int arr[] = {15, 2, 45, 4 , 7};
        for (int i=0;i<arr.length;i++){
            if (arr[i]==i+1){//0 base indexing nhai hai ...
                System.out.print(arr[i]+" ");
            }
        }
    }
}
