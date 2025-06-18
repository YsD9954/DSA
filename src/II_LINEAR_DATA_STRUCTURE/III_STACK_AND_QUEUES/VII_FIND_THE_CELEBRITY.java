//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//import java.util.Stack;
//
//public class VII_FIND_THE_CELEBRITY {
//    public static void main(String[] args) {
//        int arr[][] = {
//                {1, 1, 0},
//                {0, 1, 0},
//                {0, 1, 1}
//        };
//
//        int n = arr.length;
//        Stack<Integer> s = new Stack<>();
//
//        // Step 1: Push everyone to the stack
//        for (int i = 0; i < n; i++) {
//            s.push(i);
//        }
//
//        // Step 2: Find a potential celebrity
//        while (s.size() > 1) {
//            int a = s.pop();
//            int b = s.pop();
//
//            if (arr[a][b] == 1) {
//                // a knows b => a can't be celebrity
//                s.push(b);
//            } else {
//                // a doesn't know b => b can't be celebrity
//                s.push(a);
//            }
//        }
//
//        if (s.isEmpty()) {
//            System.out.println(-1);
//            return;
//        }
//
//        int candidate = s.pop();
//
//        // Step 3: Verify candidate
//        for (int i = 0; i < n; i++) {
//            if (i != candidate) {
//                if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
//                    // candidate knows someone or someone doesn't know candidate
//                    System.out.println(-1);
//                    return;
//                }
//            }
//        }
//
//        System.out.println(candidate);
//    }
//}
