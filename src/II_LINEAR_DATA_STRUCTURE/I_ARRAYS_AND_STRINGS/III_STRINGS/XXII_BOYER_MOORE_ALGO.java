package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXII_BOYER_MOORE_ALGO {
    private int[] mismatchShiftTable;
    private String pattern;

    public XXII_BOYER_MOORE_ALGO(String pattern) {
        this.pattern = pattern;
        this.mismatchShiftTable = new int[256]; // Supports all ASCII characters
        shiftTable();
    }

    // Creating the Shift Table (Bad Character Heuristic)
    public void shiftTable() {
        int lengthOfPattern = pattern.length();

        // Initialize table with default shift value (pattern length)
        for (int i = 0; i < 256; i++) {
            mismatchShiftTable[i] = lengthOfPattern;
        }

        // Fill shift values based on pattern characters
        for (int index = 0; index < lengthOfPattern - 1; index++) {
            char actualCharacter = pattern.charAt(index);
            mismatchShiftTable[actualCharacter] = lengthOfPattern - index - 1;
        }
    }

    // Implementing the Boyer-Moore Search
    public int search(String text) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int numOfSkips;

        for (int i = 0; i <= textLength - patternLength; i += numOfSkips) {
            numOfSkips = 0;

            for (int j = patternLength - 1; j >= 0; j--) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    numOfSkips = mismatchShiftTable[text.charAt(i + j)];
                    break;
                }
            }

            if (numOfSkips == 0) {
                return i; // Pattern found at index i
            }
        }
        return -1; // Pattern not found
    }

    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";

        XXII_BOYER_MOORE_ALGO bm = new XXII_BOYER_MOORE_ALGO(pattern);
        int result = bm.search(text);

        if (result != -1) {
            System.out.println("Pattern found at index " + result);
        } else {
            System.out.println("Pattern not found");
        }
    }
}
