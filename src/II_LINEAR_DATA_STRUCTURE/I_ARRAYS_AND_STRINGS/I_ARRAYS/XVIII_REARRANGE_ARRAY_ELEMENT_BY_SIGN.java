package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XVIII_REARRANGE_ARRAY_ELEMENT_BY_SIGN {
    public static void main(String[] args) {
        int arr[] ={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int positive[] = new int[arr.length];
        int negative[] = new int[arr.length];

        int pos1=0;
        int pos2=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                positive[pos1] = arr[i];
                pos1++;

            }
            else{
                negative[pos2] = arr[i];
                pos2++;
            }
        }
        int i=0;
        if (arr[0]>=0){
            while (pos1>i || pos2>i){
                if(pos1>i)
                    System.out.print(positive[i]+" ");
                if(pos2>i)
                    System.out.print(negative[i]+" ");
                i++;
            }
        }
        else{
            while (pos1>i || pos2>i){
                if(pos2>i)
                    System.out.print(negative[i]+" ");
                if(pos1>i)
                    System.out.print(positive[i]+" ");
                i++;
            }
        }


    }
}
