package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XVII_SORT_BY_SET_BIT_COUNT {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        int ans[] = new int[arr.length];

        // Count set bits for each number
        for (int i = 0; i < arr.length; i++) {
            String temp = Integer.toBinaryString(arr[i]);
            int count = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '1') {
                    count++;
                }
            }
            ans[i] = count;
        }

        // Stable sort: sort based on set bits, preserving order if equal
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (ans[j] > ans[j - 1]) {
                    // Swap values in arr
                    int tempVal = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tempVal;

                    // Swap values in ans to keep them in sync
                    int tempCount = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = tempCount;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
