package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class VII_LARGEST_SUBSTRING_WITH_NO_REPEATING_CHARACTERS {
    public static void main(String[] args) {

//        HEY NO REPAEATING MEANS .. UNIQUE ONLY!! SIMPLE:)

        String s = "aabacbebebe";

        int max_chars=0;


        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // only lowercase a-z
            int unique = 0;
            for (int j = i; j < s.length(); j++) {            // add current character
                if (freq[s.charAt(j) - 'a'] == 0) {
                    freq[s.charAt(j) - 'a']++;
                    unique++;
                    max_chars=Math.max(max_chars,unique);

                }

                // shrink window if NOT unique
                else{
                    break;
                }
            }
        }

        System.out.println("Longest substring length with unique characters: " + max_chars);
    }
}
