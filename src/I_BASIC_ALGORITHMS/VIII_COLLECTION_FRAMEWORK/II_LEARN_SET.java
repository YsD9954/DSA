package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;

public class II_LEARN_HASHSET {
    public static void main(String[] args) {
//        SET=> NO DUPLICATE + No(i.e Random) order!!
//        uniqye hash generate hoga and that's the reason
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


    }
}
