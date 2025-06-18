package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class V_ALL_NEGATIVE_TO_ONESIDE {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,-5};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
