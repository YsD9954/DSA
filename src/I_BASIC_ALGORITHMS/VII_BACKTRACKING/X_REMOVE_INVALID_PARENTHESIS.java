package I_BASIC_ALGORITHMS.VII_BACKTRACKING;



import java.util.*;
public class X_REMOVE_INVALID_PARENTHESIS {

    static Set<String> resultSet = new HashSet<>();
    static Set<String> visited = new HashSet<>();

    public static int minInvalid(String s) {
        int open = 0, close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') open++;
            else if (ch == ')') {
                if (open > 0) open--;
                else close++;
            }
        }
        return open + close;
    }

    public static boolean isValid(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') count++;
            else if (ch == ')') {
                if (count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }

    public static void inValidParenthesis(String s, int min) {
        if (visited.contains(s)) return;
        visited.add(s);

        if (min == 0) {
            if (isValid(s)) resultSet.add(s);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '(' && ch != ')') continue;
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) continue;

            String next = s.substring(0, i) + s.substring(i + 1);
            inValidParenthesis(next, min - 1);
        }
    }


    public static void main(String[] args) {
        String s = "()())()";
        int min = minInvalid(s);
        inValidParenthesis(s, min);
         ArrayList<String> arrayList = new ArrayList<>(resultSet);
        System.out.println(arrayList);
    }
}



// STEPS=>
// 1. FIND MINIMUM INVALID PARENTHESIS..
// 2. FIND CHECK KARO IS IT FORM VALID PARENTHESIS
// 3. AND PRINT ALL COMBINATION USING RECURSION IN LIST..