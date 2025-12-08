package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class V_ALL_NEGATIVE_TO_ONESIDE {
    public static void main(String[] args) {
        int arr[] = {-11,-2,3,4,-5};
//        int res[] = new int[arr.length];
//        int temp=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<0){
//                res[temp]=arr[i];
//                temp++;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                res[temp]=arr[i];
//                temp++;
//            }
//        }
//        for (int i=0;i<res.length;i++){
//            System.out.print(res[i]+" ");
//        }

        int res1[] = new int[arr.length];
        int res2[] = new int[arr.length];

        int temp1=0;
        int temp2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                res1[temp1]=arr[i];
                temp1++;
            }
            else{
                res2[temp2]=arr[i];
                temp2++;
            }
        }
        int count = temp2;
        for (int i=0;i<count;i++)
        {
            res1[temp1]=res2[i];
            temp1++;
        }
        for (int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }

    }
}
