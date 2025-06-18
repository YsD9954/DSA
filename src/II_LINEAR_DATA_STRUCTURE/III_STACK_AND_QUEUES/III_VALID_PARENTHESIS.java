//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class III_VALID_PARENTHESIS {
//    public static void main(String[] args) {
//        String str = "[()()]}";
//
//        Stack<Character> s = new Stack<>();
//        boolean balanced = true;
//
//        for(int i=0;i<str.length();i++){
//            if (str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
//                s.push(str.charAt(i));
//            }
//            else{
//                if (str.charAt(i)=='}' && s.peek()=='{'){
//                    s.pop();
//                }
//                if (str.charAt(i)==')' && s.peek()=='('){
//                    s.pop();
//                }
//                if (str.charAt(i)==']' && s.peek()=='['){
//                    s.pop();
//                }
//                else {
//                        balanced = false;
//                        break;
//                }
//            }
//
//        }
//
//        if (balanced && s.isEmpty()){
//            System.out.println("Balanced Parenthesis!!");
//        }
//        else{
//            System.out.println("Not Balanced!");
//        }
//    }
//}
