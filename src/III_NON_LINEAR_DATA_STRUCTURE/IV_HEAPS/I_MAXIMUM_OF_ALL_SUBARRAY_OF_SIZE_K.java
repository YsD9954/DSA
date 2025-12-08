package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class I_MAXIMUM_OF_ALL_SUBARRAY_OF_SIZE_K {
    public static void main(String[] args) {
//        GIVEN...
        int k=3;
        int arr[] = {1, 3, 3, 3, 2};


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); //maximum bola toh minheap!!
        int ans[] = new int[arr.length-k+1];//yue dekh lena test case e smagh raha hai ki arraylength - k kiya toh ek kam pada so..+1 kiya!!!
        int i=0;
        int temp=0;
        while (i<arr.length){
//            step 1
            while (maxHeap.size()!=k){
                maxHeap.add(arr[i]);
                i++;
            }
//            step2
            ans[temp]=maxHeap.peek();
//            step3
            maxHeap.remove(arr[temp]); //as temp will be 0,1,2,...!!
            temp++;
        }

        for (int j=0;j<ans.length;j++){
            System.out.print(ans[j]+" ");
        }

    }
}

//NOTE=>
//1. K ELEMENTS KO ADD KARO FIRST!!
//2. MAX WITHIN THAT K ELEMENTS!!
//3. REMOVE THE FIRST ELEMENT AND ADD NEW ELEMENT!! SO YOUR K WIL BE MAINTAIN CALLED WINDOW!!
//4. REPEAT THIS TILL LAST ELEMENT IS NOT ENTER!!