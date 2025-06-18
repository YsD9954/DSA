package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXX_WILDCARD_STRING_MATCHING {
    public static void main(String[] args) {
        String s = "ge?ks*";
        String pattern = "geeksforgeeks";
        String ans ="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' || s.charAt(i) == '?') {
                if (i == s.length() - 1) {
                    ans = ans + pattern.substring(i);
                } else if (s.charAt(i + 1) == pattern.charAt(i + 1)) {
                    ans = ans + pattern.charAt(i);
                } else {
                    // <<<<< THIS WAS MISSING >>>>>
                    if (s.charAt(i) == '?') {
                        ans = ans + pattern.charAt(i); // '?' matches any single char
                    } else if (s.charAt(i) == '*') {
                        ans = ans + pattern.substring(i); // '*' matches rest of string
                        break; // done
                    }
                }
            } else {
                ans = ans + s.charAt(i); // normal character
            }
        }
        System.out.println(ans);
        if (ans.equals(pattern)){
            System.out.println("Yes!");
        }
        else {
            System.out.println("No!");
        }
    }
}
