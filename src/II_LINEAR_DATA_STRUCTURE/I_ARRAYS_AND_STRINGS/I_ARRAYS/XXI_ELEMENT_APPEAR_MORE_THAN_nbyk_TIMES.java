package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXI_ELEMENT_APPEAR_MORE_THAN_nbyk_TIMES {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 9, 2, 9, 7};
        int k = 3;
        int n = arr.length;
        int nbyk = n / k;

        for (int i = 0; i < arr.length; i++) {
            int count = 1; // Start count from 1 to include arr[i]

            // Count occurrences of arr[i]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if the element appears more than n/k times
            if (count > nbyk) {
                // Ensure the element is not printed again
                boolean alreadyPrinted = false;
                for (int p = 0; p < i; p++) {
                    if (arr[p] == arr[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
