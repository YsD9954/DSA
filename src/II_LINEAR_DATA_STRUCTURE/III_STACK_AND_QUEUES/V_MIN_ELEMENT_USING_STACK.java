//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class V_MIN_ELEMENT_USING_STACK {
//    public static void main(String[] args) {
//        int arr[] = {34, 335, 1814, 86};
//        Stack<Integer> s = new Stack<>();
//        s.push(arr[0]);
//
//        for (int i=0;i<arr.length;i++){
//            if (s.peek()>arr[i]){
//                s.pop();
//                s.push(arr[i]);
//            }
//        }
//
//        System.out.println(s.peek());
//    }
//}
