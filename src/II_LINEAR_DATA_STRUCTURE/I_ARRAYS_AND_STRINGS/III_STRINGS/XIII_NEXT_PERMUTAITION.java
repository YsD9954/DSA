//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
//
//public class XIII_NEXT_PERMUTAITION {
//    public static void main(String[] args) {
//        String s= "241750";
//        nextPermute(s, "");
//    }
//    public static void nextPermute(String str, String ans) {
//        if (str.length() == 0) {
//            System.out.println(ans);
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            String ros = str.substring(0, i) + str.substring(i + 1);
//            permute(ros, ans + ch);
//        }
//    }
////}
