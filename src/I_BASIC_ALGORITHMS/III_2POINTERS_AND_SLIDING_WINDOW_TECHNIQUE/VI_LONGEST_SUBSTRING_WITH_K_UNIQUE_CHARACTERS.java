package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class VI_LONGEST_SUBSTRING_WITH_K_UNIQUE_CHARACTERS {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        int i = 0, j = 0;
        int[] freq = new int[26]; // only lowercase a-z
        int unique = 0;
        int maxLen = 0;

        while (j < s.length()) {
            // add current character
            if (freq[s.charAt(j) - 'a'] == 0) {
                unique++;
            }
            freq[s.charAt(j) - 'a']++;

            // shrink window if unique > k
            while (unique > k) {
                freq[s.charAt(i) - 'a']--;
                if (freq[s.charAt(i) - 'a'] == 0) {
                    unique--;
                }
                i++;
            }

            // update max length when exactly k unique
            if (unique == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        System.out.println("Longest substring length with " + k + " unique characters: " + maxLen);
    }
}



//NOTE => THIS IS EASY BUT IN INTERVIEW THIS QUESTION CAN BE ASKED LIKE TOUGHEST WAY!!

//SO TOUGHEST VERSION=>
//Pick Toys | An Interesting Sliding Window Problem

//    You are given a string of toys, where each toy is represented by a character...
//        You need to pick toys in a row (i.e., contiguous substring) such that there are at most 2 different types of toys in your selection.
//        Find the length of the longest substring that contains at most 2 distinct characters.
//
//    This problem is actually the same as:
//        Longest Substring with At Most K Distinct Characters (where K = 2).
//
//         How to Approach (Sliding Window)---->>>>>
//
//        1. Two pointers (left & right) represent a sliding window.
//        2. Use a map/frequency counter to track how many toys (characters) of each type are inside the window.
//        3. Expand the window by moving right.
//        4. If the window has ≤ 2 distinct toys, update the maximum length.
//        5. If it has > 2 distinct toys, shrink the window by moving left until only 2 types remain.
//        This way, each toy is processed at most twice → O(n) solution