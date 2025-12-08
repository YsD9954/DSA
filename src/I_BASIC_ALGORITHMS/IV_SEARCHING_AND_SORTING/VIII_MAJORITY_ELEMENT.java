package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

public class VIII_MAJORITY_ELEMENT {
    public static void main(String[] args) {
        int arr[]={3,1,3,3,2};

        for (int i=0;i<arr.length-1;i++){
            int count=0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>=arr.length/2){
                System.out.println(arr[i]);
            }
        }
    }
}
