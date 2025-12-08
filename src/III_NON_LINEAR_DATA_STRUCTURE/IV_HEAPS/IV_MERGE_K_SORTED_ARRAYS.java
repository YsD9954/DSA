package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.PriorityQueue;

public class IV_MERGE_K_SORTED_ARRAYS {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                minHeap.add(arr[i][j]);
            }
        }

        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }

    }
}
