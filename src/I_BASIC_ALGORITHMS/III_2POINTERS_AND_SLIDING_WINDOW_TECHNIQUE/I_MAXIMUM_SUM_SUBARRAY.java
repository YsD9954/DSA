package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class I_MAXIMUM_SUM_SUBARRAY {
    public static void main(String[] args) {

        int arr[] = {2,5,1,8,2,9,1};
        int k=3;

//        so in this question we need max sum of subarray of size 3! simple..

        int max=0;

        for (int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            max=Math.max(max,sum);
        }

        System.out.println(max);
    }
}


//NOTE=>
//SIMPLE HAI SUBARRAY HAI TOH CONTINOUS HIHOGA..SOOUTER LOOP LAGAYA BUSSLRNGTH-K TAKCHALYA..!
//AND THEN HAREK ELEMNET KE WINDOW CHECK KIYA AND STOREBHIKIYA!!
// LAST ME EACH TIME MAX KOUPDATE KIYA IF MAXHAI TOH!
