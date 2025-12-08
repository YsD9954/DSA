package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class II_LEARN_SET {
    public static void main(String[] args) {
//        SET=> NO DUPLICATE !
//        hashset=> uniqye hash generate hoga and that's the reason No order!
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


        Set<Integer> lset = new LinkedHashSet<>(); // baki sabh same hi hoga bss order maintain hoga
        lset.add(1);
        lset.add(5);
        lset.add(2);
        lset.add(4);
        lset.add(3);
        lset.add(5);
        System.out.println(lset);

        Set<Integer> tset = new TreeSet<>(); // baki sabh same hi hoga bss sorted hoga bss
//      tc = o(logn) hogi as baki sabh ki o(n)

        tset.add(1);
        tset.add(5);
        tset.add(2);
        tset.add(4);
        tset.add(3);
        tset.add(5);
        System.out.println(tset);



//        very very imp discussion

//        like if we have class student adn where we have roll and name as parameter of  method naned attendance
//        ex-
//        public class Student{
//            void attendance(String name, int Roll){
//                this.name = name;
//                this.Roll = Roll
//            }
//        }
//        so if we add new stydent if either same name or roll or both so by using set we can't diffenrtiate them as this is new object of student but having same name/roll

//        public class Main{
//            public static void main(String[] args) {
//                Set<Student> studentset = new HashSet<>();
//                studentset.add("ysd",1);
//                studentset.add("psd",2);
//                studentset.add("ssd",3);
//                studentset.add("ysd",1);// this is repeated but still hashset can't differentiate as this is new object!
//            }
//        }
//        so here we need to create equals methods where we compare 2 object and ther name adn roll like..
//        and if we want same name we will consider that but fi roll nois same we will not going to add!
//       so hece obj1.equals(obj2 is very imp menthod !! (not equal()!..s hai!!)

    }
}
