package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;
public class I_REVERSE_ARRAY {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//
//        methos2==>

//        int brr[] = new int[arr.length];
//        int temp=0;
//        for (int i=arr.length-1;i>=0;i--){
//            brr[temp]=arr[i];
//            temp++;
//        }
//        System.out.println();
//        for (int i=0;i<brr.length;i++){
//            System.out.print(brr[i]+" ");
//        }

//        method3==>
        int arr[] = {1, 2, 3, 4, 5};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i=0, j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}




//STEPS-
//TP MAT KAR LA**E ULTA LOOP LAGA AUR AAGE CHAL...