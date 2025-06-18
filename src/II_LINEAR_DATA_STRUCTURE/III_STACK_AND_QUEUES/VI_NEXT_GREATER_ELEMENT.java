//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class VI_NEXT_GREATER_ELEMENT {
//    public static void main(String[] args) {
//        int arr[] = {6, 8, 0, 1, 3};
//        Stack<Integer> s = new Stack<>();
////        s.push(arr[0]);
//
//        for (int i=0;i<arr.length;i++){
//            s.push(arr[i]);
//            for (int j=i+1;j<arr.length;j++){
//                if (s.peek()<arr[j]){
//                    s.pop();
//                    s.push(arr[j]);
//                    break;
//                }
//            }
//            if (s.peek()==arr[i]){
//                s.pop();
//                s.push(-1);
//            }
//            System.out.print(s.peek()+", ");
//            s.pop();
//        }
//    }
//}
