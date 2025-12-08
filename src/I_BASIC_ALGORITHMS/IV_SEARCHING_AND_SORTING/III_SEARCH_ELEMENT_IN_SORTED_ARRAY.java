package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

public class III_SEARCH_ELEMENT_IN_SORTED_ARRAY {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target=10;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println(i);
            }
            else{
                count++;
            }

        }

        if (count==arr.length){
            System.out.println(-1);
        }


    }
}
