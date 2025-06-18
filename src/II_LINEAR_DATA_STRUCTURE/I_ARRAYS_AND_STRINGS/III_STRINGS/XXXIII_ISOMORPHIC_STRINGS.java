package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXXIII_ISOMORPHIC_STRINGS {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] mappingS = new int[256];
        int[] mappingT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mappingS[chS] == 0 && mappingT[chT] == 0) {
                mappingS[chS] = chT;
                mappingT[chT] = chS;
            } else {
                if (mappingS[chS] != chT || mappingT[chT] != chS)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }
}
