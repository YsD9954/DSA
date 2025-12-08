
//SOLUTION 1 => RECURION EASY!!

package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.util.ArrayList;

public class III_PERMUTATIONS {
    static void permute(String s,String perm,int index){
        if (s.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i =0;i<s.length();i++){
            char currChar = s.charAt(i);
            String newStr = s.substring(0,i)+s.substring(i+1);
            permute(newStr ,perm+currChar,index+1);

        }
    }
    public static void main(String[] args) {
        String s ="ABC";

        permute(s,"",0);
    }
}

//NOTE=>
//                                       "ABC"/""
//                                    /     |     \
//                                 BC/A    AC/B    AB/C
//                                /  \     /  \     /  \
//                           C/AB   B/AC C/BA A/BC  B/CA A/CB
//                           /      |     |     |    |     \
//                     ""/ABC  ""/ACB ""/BAC ""/BCA ""/CAB  ""/CBA
//
//SO MAIN STRING EMPTY HOGAY SO THAT'S IT -> EMPTY HOGAY HENCE BASE CASE HIT THAT'S IT LEXILOGIOCAL O/P AAGAYA!!

//SO SEE HOW MANY CALLS LAG RAHI HAI =>
// TIME COMPLEXCITY=> O(N)
//SPACE COMPLEXITY => HAAD SE BHI GANDI!!!



//package I_BASIC_ALGORITHMS.VII_BACKTRACKING;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//
//public class III_PERMUTATIONS {
//    public static void permute(char[] arr, Set<String> ans, int index) {
//        if (index >= arr.length) {
//            ans.add(new String(arr));
//            return;
//        }
//
//        // Use a set to avoid duplicate swaps at the same recursion level
//        Set<Character> used = new HashSet<>();
//
//        for (int j = index; j < arr.length; j++) {
//            if (used.contains(arr[j])) continue;
//            used.add(arr[j]);
//
//            swap(arr, index, j);
//            permute(arr, ans, index + 1);
//            swap(arr, index, j); // backtrack
//        }
//    }
//
//    public static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static ArrayList<String> findPermutation(String s) {
//        Set<String> resultSet = new HashSet<>();
//        char[] arr = s.toCharArray();
//        permute(arr, resultSet, 0);
//
//        ArrayList<String> resultList = new ArrayList<>(resultSet);
//        Collections.sort(resultList); // Optional: to keep output sorted
//        return resultList;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> result = findPermutation("ABC");
//        for (String perm : result) {
//            System.out.println(perm);
//        }
//    }
//}


