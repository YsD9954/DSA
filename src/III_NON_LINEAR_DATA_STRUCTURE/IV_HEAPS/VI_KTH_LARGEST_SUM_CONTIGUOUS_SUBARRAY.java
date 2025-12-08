package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class VI_KTH_LARGEST_SUM_CONTIGUOUS_SUBARRAY {
    public static void main(String[] args) {
        int arr[] = {20, -5, -1};
        int k=3;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxHeap.add(sum);
            }
        }
        int count =0;
        while (count!=k-1){ //meko peek me answer chayie toh ek kam tak loop chalao!!!!
            maxHeap.poll();
            count++;
        }
        System.out.print("kth largest sum - "+maxHeap.peek());




    }
}


//NOTE=>
//1. DEKAHO SUBARRAY BOLA MATLAB CONTIUOS ELEMENTS ONLY TOH JYADA TENSION  NHI LENEKA...2 LOOP LAGAKE NORMAL TRAVERSE!!
//2. NOW HAME BASS HAR EK I KELIYE USKE SABH SUBARRAY CHAYIE AND THEN JUST ADD EACH SUBARRAY!!
