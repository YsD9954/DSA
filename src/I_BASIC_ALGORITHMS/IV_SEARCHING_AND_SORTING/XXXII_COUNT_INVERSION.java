package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXXII_COUNT_INVERSION {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    count++;
                }
            }
        }

        System.out.println("Inversion Count:- "+count);
    }
}
