package I_BASIC_ALGORITHMS.V_RECURSION;

public class V_SORT_ARRAY {
    public static int[]  print(int[] arr, int n) {
        if (n == 0) {
            return arr;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("------------------------------");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return print(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,8,5,4,10};
        int n = arr.length;
        System.out.println("Before: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        arr = print(arr,n-1);
        System.out.println("After: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


