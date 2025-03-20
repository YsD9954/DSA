package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class VI_COUNT_AND_SAY {
    public static void main(String[] args) {
        int n = 4; // Example input

        // Base cases
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("1");
            System.out.println("11");
            return;
        }

        // Start with the second term
        String s = "11";
        System.out.println("1");
        System.out.println("11");

        // Generate terms from 3 to n
        for (int i = 3; i <= n; i++) {
            StringBuilder currentTerm = new StringBuilder();
            int count = 1;

            // Iterate through the previous term
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++; // Increment count if the current character matches the previous
                } else {
                    // Append the count and the character to the current term
                    currentTerm.append(count).append(s.charAt(j - 1));
                    count = 1; // Reset count for the new character
                }
            }

            // Append the last group of characters
            currentTerm.append(count).append(s.charAt(s.length() - 1));

            // Update the previous term for the next iteration
            s = currentTerm.toString();

            // Print the current term
            System.out.println(s);
        }
    }
}