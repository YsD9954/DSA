package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class XV_STACK_USING_2_QUEUES {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // Push is costly
    static void push(int data) {
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    static void pop() {
        if (q1.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Popped: "+q1.remove());
        }

    }

    public static void main(String[] args) {
        push(2);
        push(3);
        pop();  //  3
        push(4);
        pop();  //  4
        pop();  //  2
    }
}
