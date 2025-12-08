package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XVI_MAXSUM_AFTER_K_NEGATION {

        public static long maximizeSum(long a[], int n, int k) {
            Arrays.sort(a);
            int maxsum=0;
            int i=0;
            while(k!=0){
                if(i<a.length && a[i]<0){
                    //condn1 => mere pass -ve numbers hai!! simple positive karte rakho!!
                    // intenally hame 0 se start kiya beacuse sort me jitna jyada negative hoga utna hi vho first(starting me left) aayega  so utna jyada positive hoga after sign change ..so max number ko humne positive kiya..and hence sort imp hai!!

                    a[i]=-1*a[i];
                    k--;
                    i++;
                }
                else if(k%2==0){
                    // condn2 => if mere pass sabh negative khatam ho gaye so niow meko dekhna padega bacha hua k odd hai ya even if ..
                    // even  hai...=> toh aise samjo ki mene ek positive number ko 2 bar sign change karvya so vhio vhi number banega so kya farak padta o/p me..
                    // ghnata..so even number ko kuch mat karo direct 0 karo and main contion fail kardo1
                    k=0;
                }
                else{
                    // condn3=> abhi negstive khatam and k bi odd hai so ..???

                    // now hamra left vale numebr chote nhi hai as hamare sabse chote the jab vho -ve the butr bahi vho sabh postive ho gaye and ence

                    //firse findout which is mallet and then just swap it's sign
                    long min = a[0];
                    int minIndex = 0;
                    for (int j = 1; j < a.length; j++) {
                        if (a[j] < min) {
                            min = a[j];
                            minIndex = j;
                        }
                    }
                    a[minIndex] = -1 * a[minIndex];
                    k--;
                }
            }


            for(int j=0;j<a.length;j++){
                maxsum+=a[j];
            }

            return maxsum;
        }


    public static void main(String[] args) {

        int n = 5, k = 1;
        long arr[] = {1, 2, -3, 4, 5}   ;
        System.out.println(maximizeSum(arr,n,k));
    }
}
