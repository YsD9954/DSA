package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class VIII_MERGE_K_SORTED_LINKED_LIST {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.add(4);
        l2.add(5);

        l3.add(6);
        l3.add(7);

        l4.add(8);
        l4.add(9);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i=0;
        while (i<l1.size()){
            minHeap.add(l1.get(i));
            i++;
        }
        int j=0;
        while (j<l2.size()){
            minHeap.add(l2.get(j));
            j++;
        }
        int k=0;
        while (k<l3.size()){
            minHeap.add(l3.get(k));
            k++;
        }
        int l=0;
        while (l<l4.size()){
            minHeap.add(l4.get(l));
            l++;
        }


        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+"->");
        }
        System.out.println("null");
    }
}
