package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class III_Kth_MAX_MIN {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,3};

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<i;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//
//        }

        int k = 2;
        System.out.println("K = "+ k);
        if(k> arr.length){
            System.out.println("K must be less than size of array");
        }
        else{
            System.out.println("Kth Max - "+ arr[(arr.length-1)-k+1] ); // k=1 se shuru karna tha isliye +1 kiya as hum 0 se start karte hai normally...
            System.out.println("Kth MIN - "+ arr[k-1] ); //
        }


    }
}
