package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class XXI_INTERLEAVING_OF_2_HALF_OF_THE_QUEUE {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Queue<Integer> q = new LinkedList<>();
        int i=0;
        int middle=(int)Math.ceil(arr.length/2.0);//for odd as even keliye kuch farak nahi padega!!
        int j=middle; //jabh even hai toh kuch nahi hoga but odd mee kaam aayega kyuki mene bich element free kardiya abhi
        while(i!=arr.length/2 && j!=arr.length){//j!=arr.length vali condition bhi laga sakte hai...!!
            q.add(arr[i]);
            q.add(arr[j]);
            i++;
            j++;
        }
        if (arr.length%2!=0){ //jo middle ne element choda vho abhi i hoga as i++ toh hua but condotion satisfy nhi hua isliye i update hoga and vho hum yaaha ue karenge!!!
            q.add(arr[i]);
        }
       System.out.println(q);

    }
}
//Note :- interleaving matlab 2 grp me divide karke ek dono ka ek ek element ko one by one alernate addd karo queeu me..
//problem simple hai for even number..
//but odd ke liye hum bass middle ko isloate KARENGE !!!buss so last me middle priont karenge addditionlly for odd case!!