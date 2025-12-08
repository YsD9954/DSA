//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class I_NTH_FIBONACCI_NUMBER {
//
//    public static int fibbo(int n){
//        if (n<=1){
//            return n;
//        }
//
//        return fibbo(n-1)+fibbo(n-2);
//    }
//    public static void main(String[] args) {
//        int n=7;
//        System.out.println("Nthh Fibonnacci - "+fibbo(6));
//
//
////        for series...
//        System.out.println("Fibbo series!!");
//        for (int i=0;i<=n;i++){
//            System.out.println(fibbo(i));
//        }
//    }
//}
//
//
//
////NOW AS WE DISCUSSED I WANT TO REDUCED TIME COMPLEXITY FROM 2^n TO n!!
//

//
//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class I_NTH_FIBONACCI_NUMBER {
//
//    public static int fibbo(int n, int[] dp) {
//        if (n <= 1) {
//            return n;
//        }
//        if (dp[n] != -1) return dp[n];
//        return dp[n] = fibbo(n - 1, dp) + fibbo(n - 2, dp);
//    }
//
//    public static int nthFibonacci(int n) {
//        int dp[] = new int[n + 1];
//        for (int i = 0; i <= n; i++) dp[i] = -1; // fixed
//        return fibbo(n, dp);
//    }
//
//    public static void main(String[] args) {
//        int n = 7;
//        System.out.println("Nth Fibonacci - " + nthFibonacci(n));
//    }
//}

//WAY II => TABULATION!!!!





package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class I_NTH_FIBONACCI_NUMBER {


    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println("Nth Fibonacci - " + dp[n]);

    }
}

