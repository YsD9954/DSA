package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class VIII_KNAPSACK_PROBLEM {
    public static void main(String[] args) {
        int val[] = {10, 40, 30, 50};
        int wt[] = {5, 4, 2, 3};
        int W = 5;


//        int dp[] = new int[val.length];
//        for (int i=0;i<val.length;i++){
//            if (wt[i]<=W){
//                int max=val[i];
//                for (int j=i+1;j<val.length;j++){
//                    if(wt[i]+wt[j]<=W){
//                        max= max+val[j];
//                    }
//                }
//                dp[i]=max;
//            }
//            else {
//                dp[i]=0;
//            }
//        }
//
//        for (int i=0;i<val.length-1;i++){
////            System.out.println(dp[i]);
//            for (int j=i+1;j<val.length;j++){
//                if (dp[i]>dp[j]){
//                    int temp = dp[i];
//                    dp[i]=dp[j];
//                    dp[j]=temp;
//                }
//            }
//
//        }
//
//
//        System.out.println(dp[val.length-1]);


//    wrong!!!!!!!!!!!!!!!!!!!!!!!!!!!!



        int n = val.length;
        int[][] dp = new int[n+1][W+1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (wt[i-1] <= w) {
                    dp[i][w] = Math.max(
                            val[i-1] + dp[i-1][w - wt[i-1]],
                            dp[i-1][w]
                    );
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        System.out.println(dp[n][W]);
    }

}
//meko value max honi chayie.. and ek val ek hi baar za sakti hai!!...
//i should take such combination vaaha pe wt<= mAX W!! SO THAT MERA O/P VALUE JYADA AAYEGA!!