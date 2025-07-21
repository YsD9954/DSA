package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XII_STICKLER_THIEF {
    public static void main(String[] args) {
        int arr[]={6,5,5,7,4};
        int sum0=0;
        int sum1=0;

        for (int i=0;i<arr.length;i=i+2){
            sum0+=arr[i];
        }
        for (int i=1;i<arr.length;i=i+2){
            sum1+=arr[i];
        }
        if (sum1>sum0){
            System.out.println("Max Amount:- "+sum1);
        }
        else {
            System.out.println("Max Amount:- "+sum0);
        }
    }
}
