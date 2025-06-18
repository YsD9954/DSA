package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XII_EDIT_DISTANCE {
    public static void main(String[] args) {
        String s1 = "YashUoek";
        String s2 = "YashDoke";
        System.out.println("s2-" + s2);
        // We have to change/edit s1 according to s2...

//        3 operations..
//
//        1. Insert..
//        2. Remove...
//        3. Replace...

//        Insert...
        for (int i = 0; i < s2.length(); i++) {
            String tempinsert = String.valueOf(s2.charAt(i));
            if (!s1.contains(tempinsert)) {
                s1 = s1 + tempinsert;
            }
        }
        System.out.println(s1);

//        Remove
        for (int i = 0; i < s1.length(); i++) {
            String tempremove = String.valueOf(s1.charAt(i));
            if (!s2.contains(tempremove)) {
                s1 = s1.replace(tempremove, "");
            }
        }
        System.out.println(s1);

//        Replace
        StringBuilder s1Builder = new StringBuilder(s1);
        for (int i = 0; i < s2.length() && i < s1Builder.length(); i++) {
            if (s1Builder.charAt(i) != s2.charAt(i)) {
                s1Builder.setCharAt(i, s2.charAt(i)); // Directly replace character
            }
        }
        System.out.println(s1Builder.toString());
    }
}


//Note :-
//1. just insert me s2 ka loop laga ke s1 me jo nhi hai vho add karo..
//2. remove me ulta s1 ka loop lagake jo s2 me nhi hai vho s1 se nikalo ..
//3. relapce m e strig builder use karke bass s1 and s2 compare karo index by index and see same hi ki nahi nahi hoga toh direct replace karo as string bulder use kiya hai..