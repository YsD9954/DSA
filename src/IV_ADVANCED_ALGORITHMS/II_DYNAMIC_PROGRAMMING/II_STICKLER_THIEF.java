//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class II_STICKLER_THIEF {
//    private static int ans(int[] arr) {
//        return maxLoot(arr,0);
//    }
//
//    private static int maxLoot(int[] arr, int idx) {
//        if(idx>=arr.length) return 0;
//
//        int steal = arr[idx]+maxLoot(arr,idx+2);
//        int skip = maxLoot(arr,idx+1);
//        return Math.max(steal,skip);
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {6,5,1,7,4};
//
//        System.out.println(ans(arr));
//
//    }
//}
//
//
////NOTE=> AAM JINDAGI......:)...RECUURSION!!!
//
//
////1. SEE THAT WE WANT MAX LOOT POSSIBLE AND WE CAN'T LOOT 2 CONSECUTIVE HOUSE...
////2. NOW WE WANT CHOOSE SO WE FIRST FIND STEAL AMOUT AND SKIP AMOUNT..
////3. STEAL IS ARR[I] + MAXLOOT(I++2) AND SKIP IS MAXLOOT(I+1)..
////THEN RETURN MAX OF STEAL AND SKIP!!




//NOW ... BAHUT JYADA CALL ...REDUDANT CALLS... WE HAVE TIME LIMIT EXCEED ISSUE!!!!!!!!!!!!!!!!
//SO LET'S USE DP!!



//
//
//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//import java.util.Arrays;
//
//public class II_STICKLER_THIEF {
//    private static int ans(int[] arr) {
//        int dp[] = new int[arr.length];
//        Arrays.fill(dp,-1);
//
//
//
//        return maxLoot(arr,0,dp);
//    }
//
//    private static int maxLoot(int[] arr, int idx,int[] dp) {
//        if(idx>=arr.length) return 0;
//        if (dp[idx]!=-1) return dp[idx];
//        int steal = arr[idx]+maxLoot(arr,idx+2,dp);
//        int skip = maxLoot(arr,idx+1,dp);
//        return dp[idx]=Math.max(steal,skip);
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {6,5,1,7,4};
//
//        System.out.println(ans(arr));
//
//    }
//}




//WAYII TABULATION...



package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class II_STICKLER_THIEF {

    private static int maxLoot(int[] arr) {
        int n= arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        if(n>1) dp[1] = Math.max(arr[0],arr[1]);
            for (int i=2;i<n;i++){
                dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
            }
            return dp[n-1];

    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,7,4};
        System.out.println(maxLoot(arr));

    }
}

