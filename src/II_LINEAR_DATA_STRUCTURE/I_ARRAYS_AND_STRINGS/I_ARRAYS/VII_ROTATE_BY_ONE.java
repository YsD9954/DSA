package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class VII_ROTATE_BY_ONE {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int temp = arr[n-1];
        int arr2[] = new int[n];
        for(int i=0;i<n-1;i++){
            arr2[i+1]=arr[i];
        }
        arr2[0]=temp;

        System.out.println("Rotate by One Array:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");

        }
    }
}









