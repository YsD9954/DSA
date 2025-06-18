package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class V_VALID_SHUFFLE {
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String results = "Y21X";

        // Check if the length of results matches the combined length of first and second
        if (results.length() != first.length() + second.length()) {
            System.out.println("NHI BHAI!!! (Length mismatch)");
            return;
        }

        // Check character frequency
        int[] freq = new int[256]; // Assuming ASCII characters

        // Increment frequency for characters in first and second
        for (char c : first.toCharArray()) {
            freq[c]++;
        }
        for (char c : second.toCharArray()) {
            freq[c]++;
        }

        // Decrement frequency for characters in results
        for (char c : results.toCharArray()) {
            freq[c]--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                System.out.println("NHI BHAI!!! (Character frequency mismatch)");
                return;
            }
        }

        // Check the order of characters using a two-pointer approach
        int i = 0, j = 0, k = 0;

        while (k < results.length()) {
            if (i < first.length() && results.charAt(k) == first.charAt(i)) {
                i++;
            } else if (j < second.length() && results.charAt(k) == second.charAt(j)) {
                j++;
            } else {
                System.out.println("NHI BHAI!!! (Order mismatch)");
                return;
            }
            k++;
        }

        // If all checks pass, it's a valid shuffle
        System.out.println("YES BHAI!!! (Valid shuffle)");
    }
}