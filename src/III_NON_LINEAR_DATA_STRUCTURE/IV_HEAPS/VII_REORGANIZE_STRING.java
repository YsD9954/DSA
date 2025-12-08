package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

public class VII_REORGANIZE_STRING {

    public static String reorganizeString(String str) {
        int[] hash = new int[26];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        // Find the character with the maximum frequency
        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        // If max frequency is more than (n+1)/2, return empty string
        if (max > (str.length() + 1) / 2) return "";

        // Result array
        char[] res = new char[str.length()];

        // Fill all even places with the majority character
        int idx = 0;
        while (hash[letter]-- > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
        }

        // Fill the remaining characters
        for (int i = 0; i < hash.length; i++) {
            while (hash[i]-- > 0) {
                if (idx >= res.length) idx = 1;
                res[idx] = (char) (i + 'a');
                idx += 2;
            }
        }

        return String.valueOf(res);
    }


    public static void main(String[] args) {
        String str = "aab";
        String ans="";

        System.out.println(reorganizeString(str));
    }
}
