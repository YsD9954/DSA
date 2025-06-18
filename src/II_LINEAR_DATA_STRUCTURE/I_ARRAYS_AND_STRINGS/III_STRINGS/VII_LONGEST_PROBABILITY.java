package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class VII_LONGEST_PROBABILITY {
    public static void main(String[] args) {
        String input = "YashHSayDoke";
        String s = input.toLowerCase();

        int n1 = 0, n2 = s.length() - 1;
        String longestPalindrome = "";

        while (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                for (int j = n2; j >= i; j--) {
                    String sub = s.substring(i, j + 1);
                    if (isPalindrome(sub) && sub.length() > longestPalindrome.length()) {
                        longestPalindrome = sub;
                    }
                }
            }
            break; // Exiting after finding the longest palindrome
        }

        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
