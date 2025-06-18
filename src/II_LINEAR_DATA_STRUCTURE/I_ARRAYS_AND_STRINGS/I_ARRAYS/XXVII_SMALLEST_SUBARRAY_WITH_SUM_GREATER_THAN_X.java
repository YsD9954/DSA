package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXVII_SMALLEST_SUBARRAY_WITH_SUM_GREATER_THAN_X {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int x=51;
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        // Pick every element as starting point
        for (int i = 0; i < n; i++) {
            int curr = 0;

            for (int j = i; j < n; j++) {
                curr += arr[j];

                if (curr > x) {
                    res = Math.min(res, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(res);







    }
}
