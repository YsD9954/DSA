package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class XIII_VALID_SUBSTRING {
    public static void main(String[] args) {
        String str = "[()()]}";
        int count=0;
        Stack<Character> s = new Stack<>();
        boolean balanced = true;

        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
                s.push(str.charAt(i));

            }
            else{
                if (!s.isEmpty() && str.charAt(i)=='}' && s.peek()=='{' ){
                    s.pop();
                    count+=2;
                }
                if (!s.isEmpty() && str.charAt(i)==')' && s.peek()=='(' && !s.isEmpty()){
                    s.pop();
                    count+=2;

                }
                if (!s.isEmpty() && str.charAt(i)==']' && s.peek()=='[' && !s.isEmpty()){
                    s.pop();
                    count+=2;

                }
            }
        }

        System.out.println(count);
    }
}
