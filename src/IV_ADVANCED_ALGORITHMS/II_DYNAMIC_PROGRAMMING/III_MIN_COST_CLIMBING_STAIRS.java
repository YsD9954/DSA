//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class III_MIN_COST_CLIMBING_STAIRS {
//    public static int minCost(int cost[],int idx){
//        if (idx>=cost.length) return 0;
//
//        return cost[idx]+Math.min(minCost(cost,idx+1),minCost(cost,idx+2));
//    }
//    public static int minCostClimbingStairs(int cost[]){
//        return Math.min(minCost(cost,0),minCost(cost,1));
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {10, 15, 20};
//        System.out.println(minCostClimbingStairs(arr));
//    }
//}

//SAME TIME EXCEED AAYEGA ....SO LET'S USE DP!!!



//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//import java.util.Arrays;
//
//public class III_MIN_COST_CLIMBING_STAIRS {
//    public static int minCost(int cost[],int idx,int dp[]){
//        if (idx>=cost.length) return 0;
//        if (dp[idx]!=-1) return dp[idx];
//        return cost[idx]+Math.min(minCost(cost,idx+1,dp),minCost(cost,idx+2,dp));
//    }
//    public static int minCostClimbingStairs(int cost[]){
//        int dp[] = new int[cost.length];
//        Arrays.fill(dp,-1);
//        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        System.out.println(minCostClimbingStairs(arr));
//    }
//}

//WAYII - TABULATION!!!
//SEE..HAMRE PASS COST HAI TOH HAR EK STAIRS KELIYE USKA NIM COST NIKALTE ZYENGE SO WE WILL GET LAST OR SECOND LAST AS HUM 2 STEP YA 1 STEP LE SAKTE HAI..ISLIYE!!





package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

import java.sql.SQLOutput;
import java.util.Arrays;

public class III_MIN_COST_CLIMBING_STAIRS {

    public static int minCostClimbingStairs(int cost[]){
        int n = cost.length;
        int dp[] = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i=2;i<n;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]); //IF SECOND LAST KM H0GA TOH UDHER SE HI TOP JAYENGE NHI TOH LAST VALE!!
    }

    public static void main(String[] args) {
        int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost));



    }

}
