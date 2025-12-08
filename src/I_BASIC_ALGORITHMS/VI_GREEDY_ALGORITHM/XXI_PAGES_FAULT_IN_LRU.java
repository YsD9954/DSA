package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.beans.PropertyEditorManager;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class XXI_PAGES_FAULT_IN_LRU {
//    static boolean isPresesnt(int num,int mem[]){
//        boolean flag=false;
//        for(int i=0;i<mem.length;i++){
//            if(num==mem[i]){
//                return true;
//            }
//        }
//        if(flag==false){
//            for(int i=0;i<mem.length-1;i++){
//                mem[i]=mem[i+1];
//            }
//            mem[mem.length-1]=num;
//        }
//        return false;
//    }
//    static int pageFaults(int N, int C, int pages[]) {
//        // code here
//        int mem[] = new int[C];
//        int faultPages=0;
//        for(int i=0;i<C;i++){
//            mem[i]=pages[i];
//            faultPages++;
//        }
//
//        for(int i=C;i<N;i++){
//            if(!isPresesnt(pages[i],mem)){
//                faultPages++;
//
//            }
//        }
//
//        return faultPages;
//
//    }


//    WROOOOOOOOOOOOOOOOOOONNNNNNNNNNNNNNNNNNGGGGGGGGGGGGGGGGGGGGG!!


//    WHY BRUTE FORCE WRONG?

//    1. current code adds the first C pages directly to mem, assuming they are all distinct.
//
//    2.The isPresesnt() function isn't updating the usage order of memory slots correctly based on LRU.
//
//   3. Even if a page is already present, you're not moving it to the most recently used (end) position.

//SO CORRECT LOGIC IS TO USE LL AND SET...


//    SET WILL HANDLE THE MEMORY so THAT DUPLICATE PAGES DIRECTLY ADD NHI HONGE....AND LL WILL HANDLE LRU...SO REMOVE FIRST KAR SAKTE HAI
//SIMPLE THA BC..............


    public static void main(String[] args) {
        int N = 9, C = 4;
        int pages[] = {5, 0, 1, 3, 2, 4, 1, 0, 5};
            Set<Integer> memory = new HashSet<>();
            LinkedList<Integer> lru = new LinkedList<>();
            int faults = 0;

            for (int i = 0; i < N; i++) {
                int page = pages[i];

                // If page is not present
                if (!memory.contains(page)) {
                    faults++;

                    // If memory is full, remove least recently used
                    if (memory.size() == C) {
                        int lruPage = lru.removeFirst();
                        memory.remove(lruPage);
                    }

                    memory.add(page);
                } else {
                    // If already present, remove it from current position
                    lru.remove((Integer) page);
                }

                // Add the current page as most recently used
                lru.addLast(page);
            }

        System.out.println(faults);
        }

}
