package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Deque;
import java.util.LinkedList;

public class XVI_STACK_USING_DEQUE {
    static Deque<Integer> dq = new LinkedList<>();
    static void push(int data){
        dq.addLast(data);
    }
    static void pop(){
        int temp=dq.removeLast();
        System.out.println(temp);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        pop();
        push(3);
        push(4);
        pop();

    }
}
