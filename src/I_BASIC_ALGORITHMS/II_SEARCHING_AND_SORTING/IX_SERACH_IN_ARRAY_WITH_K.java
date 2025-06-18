package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class IX_SERACH_IN_ARRAY_WITH_K {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 6};
        int k = 1;
        int x = 6;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
                break;
            }
        }

    }
}
