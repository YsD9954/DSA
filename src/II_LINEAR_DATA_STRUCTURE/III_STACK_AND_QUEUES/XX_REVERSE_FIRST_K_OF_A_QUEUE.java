package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class XX_REVERSE_FIRST_K_OF_A_QUEUE {
    static void reverse(Queue<Integer> q, int k){
        int i=0;
        if (q.isEmpty()){
            return;
        }
        Queue<Integer> q2 = new LinkedList<>();
        while (!q.isEmpty()){
            q2.add(q.remove());
        }
        Stack<Integer> s= new Stack<>();
        while(i<k){
            s.push(q2.remove());
            i++;
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k=3;
        Queue<Integer> q = new LinkedList<>();
        int i=0;
        while (i<arr.length){
            q.add(arr[i]);
            i++;

        }
        System.out.println(q);
        reverse(q,k);
        System.out.println(q);


    }
}
