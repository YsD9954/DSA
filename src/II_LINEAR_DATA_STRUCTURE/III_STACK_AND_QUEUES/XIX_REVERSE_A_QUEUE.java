package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class XIX_REVERSE_A_QUEUE{
//    method 1-recursiion!!
//    static void revese(Queue<Integer> q){
//        if (q.isEmpty()){
//            return;
//        }
//        int front = q.remove();
//        revese(q);
//        q.add(front);
//    }

//    method2-stack!!!
static void revese(Queue<Integer> q){
    Stack<Integer> s = new Stack<>();
    while (!q.isEmpty()){
        s.push(q.remove());
    }
    while (!s.isEmpty()){
        q.add(s.pop());
    }
}

    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 10, 2, 6};
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        revese(q);
        System.out.println(q);
    }
}
