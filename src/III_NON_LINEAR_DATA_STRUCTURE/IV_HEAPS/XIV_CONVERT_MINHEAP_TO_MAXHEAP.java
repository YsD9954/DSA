package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class XIV_CONVERT_MINHEAP_TO_MAXHEAP {
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);
        }

        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll()+" ");
        }
    }
}
