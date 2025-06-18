package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXVIII_THREE_WAY_PARTITIONING {
    public static void main(String[] args) {
        int arr[]= {1, 4, 3, 6, 2, 1};
        int a = 1, b=3;
        int pos=0;
        int ans[] = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<a){ //no equalto
                ans[pos] = arr[i];
                pos++;

            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>=a && arr[i]<=b){ // equalto bhi dalna imp hai!!!!!!!!!
                ans[pos] = arr[i];
                pos++;

            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>b){ // no equalto
                ans[pos] = arr[i];
                pos++;

            }
        }


        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
