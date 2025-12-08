package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;

import java.util.Arrays;

public class IV_LEARN_ARRAYS {
    public static void main(String[] args) {
//        Arrays class hai!!

        Integer[] numbers = {1,2,3,4,55,66}; // normal array me bhi chalega!!!
//        System.out.println(numbers);// aise print nhai hota array bahi!:( // pass byu refernce!
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

//        sorted array!!
        Arrays.sort(numbers); // quick sort karta hai!! and if length >8192 hai toh parellel sort karta hai!
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

//        binary search ...only for sorted array so sort pahile use karo!!
        int index = Arrays.binarySearch(numbers,4);
        System.out.println("index of element 4 is: "+index);


//        if hamre array me kuch bharna hai pahile se hai so hum fills use karenge!
       Arrays.fill(numbers,-1);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
