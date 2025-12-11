package I_BASIC_ALGORITHMS.V_RECURSION;

import java.util.ArrayList;
import java.util.List;

public class XI_PALINDROM_PARTITIONING {

    public static void backtrack( String s, List<String> temp, List<List<String>> ans) {
        if (s.length()==0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(0, i + 1);
            if(isPalindrom(sub)){
                temp.add(sub);
                backtrack(s.substring(i+1), temp, ans);
                temp.remove(temp.size() - 1);
            }

        }
    }
    public static boolean isPalindrom(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="aab";
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        backtrack(s, temp, ans);
        System.out.println(ans);

    }
}
