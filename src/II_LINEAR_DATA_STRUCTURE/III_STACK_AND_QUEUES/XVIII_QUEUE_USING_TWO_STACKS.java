package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class XVIII_QUEUE_USING_TWO_STACKS {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void add(int data) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into s1 (bottom of original queue)
        s1.push(data);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    static void remove() {
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println(s1.pop());
        }
    }

    public static void main(String[] args) {
        add(5);   // Queue: 5
        add(6);   // Queue: 5, 6
        remove(); // prints 5
        add(3);   // Queue: 6, 3
        remove(); // prints 6
        remove(); // prints 3
        remove(); //empty!
        remove(); //empty!

    }
}
