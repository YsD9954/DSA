package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XV_BEST_TIME_TO_BUY_AND_SELL_STOCK {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;

        int pos = 0;
        int arr[]={7,1,5,3,6,4};
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                pos = i;
            }
        }
        int max = min;
        for(int i=pos;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }

        System.out.println(min +" "+ max);
        System.out.print("OUTPUT :- ");
        System.out.print(max-min);

    }
}
