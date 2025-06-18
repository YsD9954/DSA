//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class VIII_ARITHMETIC_EXPRESSION_EVALUATION {
//
//    public static void main(String[] args) {
//        String expression = "(2+4)*(4+6)"; // You can change this
//        System.out.println("Result: " + evaluate(expression));
//    }
//
//    public static int evaluate(String expr) {
//        Stack<Integer> operands = new Stack<>();
//        Stack<Character> operators = new Stack<>();
//
//        int i = 0;
//        while (i < expr.length()) {
//            char ch = expr.charAt(i);
//
//            if (ch == ' ') {
//                i++;
//                continue;
//            }
//
//            // If digit, parse full number (handle multi-digit)
//            if (Character.isDigit(ch)) {
//                int num = 0;
//                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
//                    num = num * 10 + (expr.charAt(i) - '0');
//                    i++;
//                }
//                operands.push(num);
//            }
//
//            // If opening bracket
//            else if (ch == '(') {
//                operators.push(ch);
//                i++;
//            }
//
//            // If closing bracket
//            else if (ch == ')') {
//                while (!operators.isEmpty() && operators.peek() != '(') {
//                    int val2 = operands.pop();
//                    int val1 = operands.pop();
//                    char op = operators.pop();
//                    operands.push(applyOp(val1, val2, op));
//                }
//                operators.pop(); // pop '('
//                i++;
//            }
//
//            // If operator
//            else if (isOperator(ch)) {
//                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
//                    int val2 = operands.pop();
//                    int val1 = operands.pop();
//                    char op = operators.pop();
//                    operands.push(applyOp(val1, val2, op));
//                }
//                operators.push(ch);
//                i++;
//            }
//        }
//
//        // Remaining operations
//        while (!operators.isEmpty()) {
//            int val2 = operands.pop();
//            int val1 = operands.pop();
//            char op = operators.pop();
//            operands.push(applyOp(val1, val2, op));
//        }
//
//        return operands.pop();
//    }
//
//    static boolean isOperator(char ch) {
//        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
//    }
//
//    static int precedence(char op) {
//        if (op == '+' || op == '-') return 1;
//        if (op == '*' || op == '/') return 2;
//        return 0;
//    }
//
//    static int applyOp(int a, int b, char op) {
//        switch (op) {
//            case '+': return a + b;
//            case '-': return a - b;
//            case '*': return a * b;
//            case '/': return a / b; // assume no divide by zero
//        }
//        return 0;
//    }
//}
