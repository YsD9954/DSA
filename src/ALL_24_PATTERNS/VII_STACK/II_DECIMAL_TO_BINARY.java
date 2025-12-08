package ALL_24_PATTERNS.VII_STACK;

import java.util.Stack;

public class II_DECIMAL_TO_BINARY{
    static String decToBinary(int n) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push remainders into stack
        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n = n / 2;
        }

        // Step 2: Build the binary string
        String ans = "";
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans.isEmpty() ? "0" : ans;
    }

    // Optional: for testing
    public static void main(String[] args) {
        System.out.println(decToBinary(12)); // Output: 1100
        System.out.println(decToBinary(5));  // Output: 101
        System.out.println(decToBinary(1));  // Output: 1
    }
}
