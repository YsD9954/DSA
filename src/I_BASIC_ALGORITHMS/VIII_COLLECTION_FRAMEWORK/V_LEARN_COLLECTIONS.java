package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class V_LEARN_COLLECTIONS {
    public static void main(String[] args) {
//        Note it's not collection interface...
//        it's collectioons classs!!!
//        chote mote operations karte hai!!


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(2);


        System.out.println("Min: "+ Collections.min(list));
        System.out.println("Max: "+ Collections.max(list));
        System.out.println("frequency of 2 is:"+ Collections.frequency(list,2));
        Collections.sort(list); // sorted increased!!
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder()); // sorted decreaed!!
        System.out.println(list);

    }
}
