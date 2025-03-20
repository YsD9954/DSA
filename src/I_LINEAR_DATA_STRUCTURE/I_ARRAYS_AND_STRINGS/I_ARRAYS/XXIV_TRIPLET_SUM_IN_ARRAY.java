package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXIV_TRIPLET_SUM_IN_ARRAY {
    public static void main(String[] args) {

        int arr[] = {1, 4, 45, 6, 10, 8};
        int target =  13 ;
        int count =0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println("Yes! triplet "+"{"+arr[i]+","+arr[j]+","+arr[k]+"}" +" sums up to "+target);
                        count++;
                    }
                }
            }
        }
        if (count==0){
            System.out.println("Nope! No triplet sums up to "+ target);
        }






    }
}