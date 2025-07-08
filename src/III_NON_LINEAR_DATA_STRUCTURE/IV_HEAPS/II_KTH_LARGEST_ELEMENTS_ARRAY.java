package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.PriorityQueue;

public class II_KTH_LARGEST_ELEMENTS_ARRAY {
    public static void main(String[] args) {
        int arr[] = {12, 5, 787, 1, 23};
        int k = 2;

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int i=0;
        while (i<arr.length){
            while (minheap.size()<=k){
                minheap.add(arr[i]);
                i++;
            }
            minheap.poll();
        }

//        so mere pass abhi ulte values hai so meko naye ans me reverse order me store karne hai!!

        int ans[] = new int[k];
        for (int j=k-1;j>=0;j--){ //>=0 and k-1 se shuru karo as ha k=2 me 0,1,2 => 3 elements add nhi kar akte
            ans[j]= minheap.poll();
        }
        for (int j=0;j<k;j++){
            System.out.print(ans[j]+" ");
        }

    }
}

//NOTE=>
//1. JHAMNE MAX HEAP SE START KIYA BUT LAST ELEMNT KO REMOVE KARNA BAHUT TOUGH HAI SO USE MIN HEAP SO POLL AKR SAKTE HO..
//2. ABHI HAMARE APSS MIN HEAP HAI TOH HUM NAYA ARRAY ME DIRECTLY REVERSE ORDER ME STORE KARKE O/P DEDENGE...!!!