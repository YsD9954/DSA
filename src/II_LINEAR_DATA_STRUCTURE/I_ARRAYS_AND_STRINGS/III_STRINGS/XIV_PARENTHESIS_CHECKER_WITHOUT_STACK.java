package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XIV_PARENTHESIS_CHECKER_WITHOUT_STACK {
    public static boolean isBalanced(String s) {
        int roundCount = 0, curlyCount = 0, squareCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') roundCount++;
            else if (ch == ')') roundCount--;
            else if (ch == '{') curlyCount++;
            else if (ch == '}') curlyCount--;
            else if (ch == '[') squareCount++;
            else if (ch == ']') squareCount--;

            // If any closing bracket comes before its corresponding opening bracket
            if (roundCount < 0 || curlyCount < 0 || squareCount < 0) {
                return false;
            }
        }

        // All counts should be zero for a balanced string
        return roundCount == 0 && curlyCount == 0 && squareCount == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[()()]{}")); // true
        System.out.println(isBalanced("{[()]}"));   // true
        System.out.println(isBalanced("[({)]}"));   // false
        System.out.println(isBalanced("[(])"));     // false
        System.out.println(isBalanced("({[]})"));   // true
    }
}
