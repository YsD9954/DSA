package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXI_KTH_SMALLEST {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; // sorted hi denevale hai vho log..
        int k=6;
        int count=0;
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            count++;
            if (k==count){
                System.out.println("kth smallest:-"+arr[i]);
                flag=false;
            }
        }

        if (flag==true){
            System.out.println(-1);
        }
    }
}
