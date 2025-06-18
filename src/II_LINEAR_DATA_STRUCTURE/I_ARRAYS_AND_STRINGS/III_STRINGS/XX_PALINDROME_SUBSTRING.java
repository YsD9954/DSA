package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XX_PALINDROME_SUBSTRING {
    public static void main(String[] args) {
        String s = "abcd";

        int countperm = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                    countperm++;
                }
            }
        }
        System.out.println("Total Number Of Palindromic Substrings: " + countperm);
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




//idk why but apna kyu nhi chal raha..!!:(
//:
//:
//:
//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
//
//public class XX_PALINDROME_SUBSTRING {
//    public static void main(String[] args) {
//        String s= "abcd";
//
//        int countperm=0;
//        for (int i=0;i<s.length();i++){
//            for (int j=i;j<s.length();j++){ //ctually meko i+1 se karnA tha but muzhe each individual elemetnt bhi ptrint karna hai ..so j bhi i se shuru karenge and then i=j hoga so vahi elenment matlab single element bhi print hoga
//                String sub = s.substring(i,j+1);
//                int count = 0;
//                for (int k=0;k<sub.length();k++){
//                    for (int l =sub.length()-1;l>=0;l--){
//                        if (sub.charAt(k)==sub.charAt(l)){
//                            count++;
//                        }
//                    }
//                }
//                if (count==sub.length()){
//                    System.out.println(sub);
//                    countperm++;
//                }
//
//            }
//        }
//        System.out.println("Total Number Of Substring :- "+countperm);
//    }
//}
