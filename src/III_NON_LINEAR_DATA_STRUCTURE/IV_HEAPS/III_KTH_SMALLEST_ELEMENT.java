

package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
import java.util.Collections;
import java.util.PriorityQueue;

public class III_KTH_SMALLEST_ELEMENT {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;

//                                    METHOD I


        PriorityQueue<Integer> minheap = new PriorityQueue<>();
//        I WANT MINIMUM ONLY SO THAT'S IT SO DIRECT MIN HEAP ME SABH VALUE ADD KARDUNGA AND PEEK LELUNAGA jab tak k na aajaye!!

        for (int i = 0; i < arr.length; i++) {
            minheap.add(arr[i]);
        }
        int count=0;
        while (count!=k-1){ // just [ahile rok doo!!
            minheap.poll();
            count++;
        }
        System.out.println("Kth Smallest Element - "+minheap.peek());


//                                          MEHTOD II

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
//        k size ka max heap leta hu and poll karte jaunga till last em[lement and last me peek hoga vhi kth smallest !!!]
        int y=0;
        while (y<arr.length){
            while (maxheap.size()<=k){
                maxheap.add(arr[y]);
                y++;

            }
            maxheap.poll();
        }

        System.out.println("Kth Smallest Element - "+maxheap.peek());

//                                              OPTIMIZED METHOD II..

        PriorityQueue<Integer> maxheap2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (maxheap2.size() < k) {
                maxheap2.add(arr[i]);
            } else if (arr[i] < maxheap2.peek()) {
                maxheap2.poll();
                maxheap2.add(arr[i]);
            }
        }
        System.out.println("Kth Smallest Element - " + maxheap2.peek());



    }
}

