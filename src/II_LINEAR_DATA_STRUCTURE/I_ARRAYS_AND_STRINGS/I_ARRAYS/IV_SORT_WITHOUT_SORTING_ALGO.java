package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class IV_SORT_WITHOUT_SORTING_ALGO {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1};
//        I AM THINKING LIKE KI IF ARR[I+1]-ARR[I] KIYA SO THE JO BHI DIFFERNCE HAI VHO =VE HOGA IF NHI HAI THEN WE WILL SWAP BUT VHO NHI EK ALGO HI HOGAYA HAI..
//        SO ANOTHER APPROCH IS KI COUNT THE NO'S OF 0,1,2 AND THEN JUST ADD JITNE BHI HAI IN SORTED ORDER..
        int c1=0,c2=0,c0=0;

        for (int i=0;i< arr.length;i++){
            if(arr[i]==0){
                c0++;
            } else if (arr[i]==1) {
                c1++;

            }
            else {
                c2++;
            }
        }

        int idx = 0;

        // Place all the 0s
        for (int i = 0; i < c0; i++)
            arr[idx++] = 0;

        // Place all the 1s
        for (int i = 0; i < c1; i++)
            arr[idx++] = 1;

        // Place all the 2s
        for (int i = 0; i < c2; i++)
            arr[idx++] = 2;

        System.out.println("Sorted without Sorting algo-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
