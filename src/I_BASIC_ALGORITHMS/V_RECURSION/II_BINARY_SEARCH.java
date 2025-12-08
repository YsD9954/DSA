package I_BASIC_ALGORITHMS.V_RECURSION;

public class II_BINARY_SEARCH {
    public static int search(int st, int end, int arr[], int target) {

        if (st <= end) {   // base case
            int mid_i = st + (end - st) / 2;
            int mid = arr[mid_i];

            if (mid == target) {
                return mid_i;
            }
            else if (mid > target) {
                return search(st, mid_i - 1, arr, target);
            } else {
                return search(mid_i + 1, end, arr, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(0, arr.length - 1, arr, target));
    }
}
