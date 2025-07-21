package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XVI_PRODUCT_ARRAY_PUZZLE {
    public static void main(String[] args) {
        int arr[] = {10,3,5,6,2};

        for (int i=0;i<arr.length;i++){
            int product=1;
            for (int j=0;j<arr.length;j++){
                product*=arr[j];

            }
            System.out.print(product/arr[i]+" ");
        }
    }
}
