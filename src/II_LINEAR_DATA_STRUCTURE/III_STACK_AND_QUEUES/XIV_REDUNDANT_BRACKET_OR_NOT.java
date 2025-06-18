package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class XIV_REDUNDANT_BRACKET_OR_NOT {
    public static void main(String[] args) {
        String str = "a+(b)";
        Stack<Character> s = new Stack<>();
        int count1=0;
        int count2=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='('){
                count1++;
                if (count1>1){

//                    s.push(str.charAt(i));
                }
            }
            else if (str.charAt(i)=='+'|| str.charAt(i)=='-'|| str.charAt(i)=='*'|| str.charAt(i)=='/'){
                count2++;

            }
//            else if (str.charAt(i)==')' && count1>1 && s.peek()=='(' ){
//                s.pop();
//                count--;
//
//            }

        }
        if (count1==count2){
            System.out.println("Not Redudant!!");
        }
        else{
            System.out.println("Redudant!");
        }


    }
}
