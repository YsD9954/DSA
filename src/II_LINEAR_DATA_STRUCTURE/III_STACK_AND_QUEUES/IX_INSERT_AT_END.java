package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class IX_INSERT_AT_END {
    static Stack<Integer>  s = new Stack<>();

    public static void insert_at_end(int data){
        if (s.isEmpty()){
            s.push(data);
        }
        else {
            int a = s.pop();
            insert_at_end(data);
            s.push(a);
        }
    }
    static void print(){
        if (s.isEmpty()){
            return;
        }

        int temp = s.pop();
        System.out.println(temp);
        print();
    }


    public static void main(String[] args) {
        insert_at_end(5);
        insert_at_end(4);
        insert_at_end(5);
        insert_at_end(2);
        insert_at_end(1);

        print();



    }
}
