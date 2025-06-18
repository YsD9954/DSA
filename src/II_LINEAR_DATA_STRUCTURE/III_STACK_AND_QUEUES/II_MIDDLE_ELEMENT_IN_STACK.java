//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class II_MIDDLE_ELEMENT_IN_STACK {
//
//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        int len=s.size();
//        int count=0;
//        while (count!=(len/2)){//direct size mat daalooo because then har baar pop karneke baad vho size recalucate hoga sand empty stack error aayega bc..
//            s.pop();
//            count++;
//        }
//        System.out.println(s.peek());
//
//    }
//}
