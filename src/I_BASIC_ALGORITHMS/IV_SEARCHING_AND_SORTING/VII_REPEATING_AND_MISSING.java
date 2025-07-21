package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class VII_REPEATING_AND_MISSING {
    public static void main(String[] args) {
        int arr[] = {1,3,3};

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Repeating Number:- "+arr[i]);
                }
            }
        }

        for (int i=1;i<=arr.length;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if (i!=arr[j]){
                    count++;
                }
            }
            if (count==arr.length-1){
                System.out.println("Mising Element:- "+ i);
            }
        }



    }
}
