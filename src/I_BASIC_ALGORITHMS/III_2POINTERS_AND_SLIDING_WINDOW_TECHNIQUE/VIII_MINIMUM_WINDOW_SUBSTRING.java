package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

import java.util.*;

public class VIII_MINIMUM_WINDOW_SUBSTRING {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        int required = need.size();
        int formed = 0;
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue())
                formed++;

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char d = s.charAt(left);
                window.put(d, window.get(d) - 1);
                if (need.containsKey(d) && window.get(d).intValue() < need.get(d).intValue())
                    formed--;

                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}


//NOTE=>
//ONE OF THE TOUGHEST LIKE HE KAR LIYA TOH KUCH BHI KAR LONGE!!
//UBER ME AAY HAI SO SAMJLO!!