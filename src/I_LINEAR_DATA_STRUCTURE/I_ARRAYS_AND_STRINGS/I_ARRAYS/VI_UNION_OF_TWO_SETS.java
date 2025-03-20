package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class VI_UNION_OF_TWO_SETS {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {18,6,4};
        int count =0;
//        int ans[] = {1,2,3,4,5,6,18};
        System.out.println("Union Elements:- ");

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        for (int j=0;j<arr2.length;j++){
            for(int i=0;i<arr1.length;i++){
                if(arr2[j]==arr1[i]){
                    count++;
                }
            }
            if(count ==0){
                System.out.print(arr2[j]+" ");
            }
            count=0;


        }



    }
}
