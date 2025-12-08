package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class II_SHOP_IN_CANDY_STORE {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 4};
        int k = 2;

//        by using stack but error aara..

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//
//        Arrays.sort(arr);
//        int min =0;
//        int max=0;
//
//        Stack<Integer> stack = new Stack<>();
//        int i=0;
//        int j=arr.length-1;
//        while (stack.size()<arr.length){
//            stack.push(arr[i]);
//            min +=arr[i];
//            i++;
//            int c=0;
//            while (c<k){
//                stack.push(arr[j]);
//                c++;
//                j--;
//            }
//        }
////        System.out.println(min);
//
//        arrayList.add(min);
//
//        Stack<Integer> stack2 = new Stack<>();
//        int z=0;
//        int y=arr.length-1;
//        while (stack2.size()<arr.length){
//            stack2.push(arr[y]);
//            max +=arr[y];
//            y--;
//            int c2=0;
//            while (c2<k){
//                stack2.push(arr[z]);
//                c2++;
//                z++;
//            }
//        }
////        System.out.println(max);
//        arrayList.add(max);
//
//        System.out.println(arrayList.get(0)+" , "+arrayList.get(1));
//




//      by niormal logical way...


        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);

        // Minimum cost
        int min = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            min += arr[i];
            i++;
            j -= k;
        }

        // Maximum cost
        int max = 0;
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            max += arr[j];
            j--;
            i += k;
        }

        res.add(min);
        res.add(max);
        System.out.println(res.get(0)+","+res.get(1));


    }
}


//Note => dekha muzhe min and max cost chayie to buy all candies if mene koi bhi ek candi lo  toh 2 candy free!!!!!!!!!!!!!

//so for min => sort karo => buy from min end (left) and free me lelo right se!!
//for max => sort karo => buy from max end(right) and free me lelo left se!!
//arraylist me add karne bola hai islye!! last me arraylist return kardo!!!