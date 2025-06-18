package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class XVII_STACK_PERMUTATION {
    public static void main(String[] args) {
        int arr[] = {1,2, 3};    // input order
        int ans[] = {3,1,2};    // desired output

        Stack<Integer> stack = new Stack<>();
        int i = 0;  // pointer for arr[]
        int j = 0;  // pointer for ans[]

        while (i < arr.length) {
            stack.push(arr[i++]);      // Push from input to stack

            // Pop while top of stack matches the output
            while (!stack.isEmpty() && stack.peek() == ans[j]) {
                stack.pop();
                j++;
            }
        }

        // After pushing all, check if remaining stack matches output
        while (!stack.isEmpty() && stack.peek() == ans[j]) {
            stack.pop();
            j++;
        }

        if (j == ans.length) {
            System.out.println("Yes, valid stack permutation.");
        } else {
            System.out.println("No, not a valid stack permutation.");
        }
    }
}


//look for first element.
//if i got then i need to store in new array,..
//then look for second ..npot forst lok in remain array and then look ata in stack.peek!!
//if got then store that also ..
//follow same processes...


