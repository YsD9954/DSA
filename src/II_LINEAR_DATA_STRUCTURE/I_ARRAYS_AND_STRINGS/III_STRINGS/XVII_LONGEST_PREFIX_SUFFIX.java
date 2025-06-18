package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XVII_LONGEST_PREFIX_SUFFIX {
    public static void main(String[] args) {
        String s = "aabndaab";
        String prefix = "";
        String suffix = "";
        int maxLen = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            prefix = s.substring(0, i + 1);
            suffix = s.substring(s.length() - i - 1);

            if (prefix.equals(suffix)) {
                maxLen = prefix.length();
            }
        }

        System.out.println("Longest Prefix-Suffix Length: " + maxLen);
    }
}
