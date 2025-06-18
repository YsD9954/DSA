package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class X_SORT_THE_STACK {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);


        int arr[] = new int[s.size()];
        int y=0;
        while (!s.isEmpty()){
            arr[y]=s.peek();
            s.pop();
            y++;
        }

        for (int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
            s.push(arr[i]);
        }
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
