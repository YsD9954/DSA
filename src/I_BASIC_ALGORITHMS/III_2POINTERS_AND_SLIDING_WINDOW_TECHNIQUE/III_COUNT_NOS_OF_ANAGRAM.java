package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

import java.util.HashSet;

//      see i want count of angrams of a pattern in given string..
//      so first i need to find all anagrams annd then just check how many times all are present!
//        so anaghram is basically all diffenmrt combiantioon of string
//        so all angram of given string are..for,fro,rfo,rof,ofr,orf


//        but what if i say we have best solution..
//        so first check all window size of 3 and check ineach wondow count of each letter is match or not... if matched count++!!
//        so if ypu are taking about all possuble combination then hashmap  not hashset!!

import java.util.Arrays;

public class III_COUNT_NOS_OF_ANAGRAM {
    public static void main(String[] args) {
        String s = "forxxorfxaofr";
        String pattern = "for";
        int k = pattern.length();
        int count = 0;

        // Frequency of pattern
        int[] patternFreq = new int[26];
        for (char c : pattern.toCharArray()) {
            patternFreq[c - 'a']++;
        }

        // Loop through each window of size k
        for (int i = 0; i <= s.length() - k; i++) {
            int[] windowFreq = new int[26];

            for (int j = i; j < i + k; j++) {
                windowFreq[s.charAt(j) - 'a']++;
            }

            if (Arrays.equals(patternFreq, windowFreq)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
