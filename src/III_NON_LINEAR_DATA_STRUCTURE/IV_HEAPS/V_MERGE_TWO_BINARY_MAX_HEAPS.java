package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class V_MERGE_TWO_BINARY_MAX_HEAPS {
    public static void main(String[] args) {
        int a[] = {10, 5, 6, 2};
        int b[] = {12, 7, 9};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;

        while (i<a.length){
            maxHeap.add(a[i]);
            i++;
        }

        int j=0;

        while (j<b.length){
            maxHeap.add(b[j]);
            j++;
        }

        int ans[] = new int[a.length+b.length];
        int y=0;
        while (!maxHeap.isEmpty()){
            ans[y]=maxHeap.poll();
            y++;
        }

        for (int z=0;z<ans.length;z++){
            System.out.print(ans[z]+" ");
        }
    }
}

//NOTE=>
//1.JYADA  DIMMAG MAT LAGAO JUST DONO KO EK HEAP MNE ADD KARIO HEAP USKA KAM KARDEGA ...
//2. BSU MEKO LAST ME ARRAY CHAYIE THA SO MENE USKO FORSE NAYE ARRAYA ME ADDA KR DIYA....CHINDI!!!!