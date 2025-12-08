package I_BASIC_ALGORITHMS.II_PREFIX_SUM_AND_SUFFIX_SUM;

public class I_PRINT_SUM_WITHIN_RANGE_OF_INDEX {
    public static void main(String[] args) {
//        print all sum from index 2 to 5 (1 based index!!)
//        as 1 based index matlanb 2 is my 2nd number and 5 is my 5th number !!


        int arr[] = {2,4,1,3,6,5};

        for (int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }

//        abhi tak same stuff!!
//        i want 2nd se 5th==> 2 is 1 and 5 is 4 simple!!:)
        int l=2;
        int r=5;
        int sum=0;

        System.out.println("Sum: "+ arr[r-1]);
//      if print karna hai toh!!
        for (int i=(l-1);i<=(r-1);i++){
            System.out.print(arr[i]+" ");
        }
    }

}
