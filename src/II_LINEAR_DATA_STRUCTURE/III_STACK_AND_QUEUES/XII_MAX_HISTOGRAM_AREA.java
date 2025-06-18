package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.Stack;

public class XII_MAX_HISTOGRAM_AREA {
    public static int[] prevSmaller(int heights[]){
        int leftAns[] = new int[heights.length];
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                leftAns[i] = -1;
            }else{
                leftAns[i] = st.peek();
            }
            st.push(i);
        }
        return leftAns;
    }
    public static int[] nextSmaller(int heights[]){
        Stack<Integer> st = new Stack<>();
        int rightAns[] = new int[heights.length];
        for(int i = heights.length-1; i >= 0 ; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rightAns[i] = heights.length;
            }else{
                rightAns[i] = st.peek();
            }
            st.push(i);

        }
        return rightAns;
    }
    public static int largestRectangleArea(int[] heights) {
        int left[] = prevSmaller(heights);
        int right[] = nextSmaller(heights);
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++){
            int area =  (right[i] - left[i] - 1) * heights[i];
            ans = Math.max(ans, area);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(largestRectangleArea(arr));
    }
}
