
//NOTE
//TRIES ME AATA HAI YE VALA OKK..


package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IX_WORD_BREAK {
    public static boolean wordBreak(String s, String[] wordDict) {
        // Convert wordDict list to a set for fast lookup
        Set<String> wordSet = new HashSet<>(List.of(wordDict));

        // Create a dp array where dp[i] is true if s[0..i) can be broken into words from the set
        boolean[] dp = new boolean[s.length() + 1];

        // Empty string is always valid
        dp[0] = true;

        // Check every position in the string
        for (int i = 1; i <= s.length(); i++) {
            // Check every possible cut point before i
            for (int j = 0; j < i; j++) {
                // If s[0..j) is valid AND s[j..i) is a word
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true; // Mark s[0..i) as valid
                    break; // No need to check more j's
                }
            }
        }

        // Return whether the whole string can be broken
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s ="catsandog";
        String wordDict[]={"cats","dog","sand","and","cat"};

        System.out.println(wordBreak(s,wordDict));
    }


}

//LEETCODE SO KIYA HAI AND MORE OFFEN THIS IS DP QUESION ..
