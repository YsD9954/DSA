package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

public class I_LEARN_LIST {
    public static void main(String[] args) {
//        see in arrray we neeed to define how much size we need ....
//        int arr[] = new int[34];

//        so if want same but we don't know how much space we need we will use arraylist...


        ArrayList<Integer> arrayList = new ArrayList<>(); // so empty arraylist banegi..
        arrayList.add(1);//default size 10 hogayi... as arraylist me jabhi bhi pahila element add hoga 10 size ka space banega so inner array of size 10 is created!!!
        arrayList.add(2);// so internally sirf vho arry bharega no new space will create
        arrayList.add(3);//-||-
//        :
//        :
//        :
//        :
        arrayList.add(10);//same yaha bhi jo inetrnal array tha vho bharega ..
        arrayList.add(11); // now 10 size bhar gayi hai so hame naya space ki jarurat hai toh naya array firse banega!
//        now each time if there is need of increase size of arraylist so size will become (n+n/2+1)..
//        so new size will be 10+5+1=>16..
//        so till 16 tak naya internal array nhi banega sirf usme hi add hoga..
//        and then same way 16 ke baad 16+8+1=>25 ...25+12+1=>38...and this will continue as per our requirement!!





//        so there are multiple differt methods...
//        add at index!
        arrayList.add(2,45);
        System.out.println(arrayList);


//       add another list to our list!
        ArrayList<Integer>arrayList2 = new ArrayList<>();
        arrayList2.add(78);
        arrayList2.add(67);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

//        get element at particular index...
        System.out.println(arrayList.get(2));

//        update the elemnet at index..
        arrayList.set(2,100);
        System.out.println(arrayList);

//      is element present..
        System.out.println(arrayList.contains(2));

//        remove at index..
        arrayList.remove(3);
        System.out.println(arrayList);

//        remove the value...
        arrayList.remove(Integer.valueOf(45));//ye element hai...toh nikalega
        arrayList.remove(Integer.valueOf(23)); //ye element nhi hai!..bc nhi nikalega but kuch error nhi bss
        System.out.println(arrayList);

//        puri list khatam..
        arrayList2.clear();
        System.out.println(arrayList2);


//        iterating in arraylist!
//        by for loop!
        for (int i=0;i<arrayList.size();i++){
            System.out.println("for loop element: "+arrayList.get(i));
        }
//        by for each loop!
        for (Integer element: arrayList){
            System.out.println("for each loop element: "+element);
        }
//        by iterator!
        Iterator<Integer> it = arrayList.listIterator();
        while (it.hasNext()){
            System.out.println("Iterator: "+it.next());
        }



    }
}
