package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class III_LEARN_MAPS {
    public static void main(String[] args) {
//        key and values like store hogi!!
//        unique keys hogi but unorder hogi!!


        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("ysd",1);// string key hai and integer value hai!
        numbers.put("psd",2);
        numbers.put("ssd",3);
        numbers.put("bsd",4);
        numbers.put("ysd",5);
        numbers.put("chu",2);// 2 is value so no matter duplicate hai toh bhi chalege

        System.out.println(numbers);


//      if i wanmt to check is it present or not?
        System.out.println(numbers.containsKey("ysd"));
        System.out.println(numbers.containsValue("ysd"));


//        so now, if i wnat to add by checking if it already exost or not is exist nhi karenge add!
        numbers.putIfAbsent("sbd",56);
        System.out.println(numbers);


//        iterationg in map!!

        //by entry class....
        for (Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
//            System.out.println(e.getKey());//only key!
//            System.out.println(e.getValue());//only values!
        }

//        by key..
        for (String key:numbers.keySet()){
            System.out.println(key);
        }
//        by values...
        for (Integer value:numbers.values()){
            System.out.println(value);
        }



        Map<String,Integer> Tnumbers = new TreeMap<>();//        unique keys hogi and ORDER bhi!! BST BANTI HAI!
        Tnumbers.put("ysd",1);// string key hai and integer value hai!
        Tnumbers.put("psd",2);
        Tnumbers.put("ssd",3);
        Tnumbers.put("bsd",4);
        Tnumbers.put("ysd",5);
        Tnumbers.put("chu",2);// 2 is value so no matter duplicate hai toh bhi chalege

        System.out.println(Tnumbers);

//        ALL METHODS WIOL BE SAME BSS T.C = O(LOGN) HOGI FROM O(N)(HASMAP)

    }
}
