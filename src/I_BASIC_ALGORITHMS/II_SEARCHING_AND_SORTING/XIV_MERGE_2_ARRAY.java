package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XIV_MERGE_2_ARRAY {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};
        int temp1=0;
        int temp2=0;
        int ans[]=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length+arr2.length;i++){
            if (i<arr1.length){
                ans[i]=arr1[temp1];
                temp1++;
            }
            else{
                ans[i]=arr2[temp2];
                temp2++;
            }

        }


        for (int i=0;i<arr1.length+arr2.length;i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
