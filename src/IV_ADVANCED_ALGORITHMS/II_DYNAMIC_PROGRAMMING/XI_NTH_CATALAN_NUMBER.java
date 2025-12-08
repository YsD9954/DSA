
//class Solution {
    // public static int findCatalan(int n) {
    //     long ncat = 1;

    //     long nume = fact(2*n);
    //     long deno = fact(n+1)*fact(n);

    //     ncat = nume/deno;

    //     return (int) ncat;

    // }
    //     public static long fact(int n){
    //     long fact =1;

    //     for (int i=1;i<=n;i++){
    //         fact *=i;
    //     }
    //     return fact;

    // method2

    // if (n <= 1) {
    //     return 1;
    // }

    // // catalan(n) is the sum of catalan(i) *
    // // catalan(n-i-1)
    // int res = 0;
    // for (int i = 0; i < n; i++) {
    //     res += findCatalan(i) * findCatalan(n - i - 1);
    // }

    // return res;



    // }
    // method 3...
    // static long binomialCoeff(int n, int k) {
    //     long res = 1;
    //     for (int i = 0; i < k; ++i) {
    //         res *= (n - i);
    //         res /= (i + 1);
    //     }
    //     return res;
    // }

    // static int findCatalan(int n) {
    //     long res = binomialCoeff(2 * n, n);
    //     res /= (n + 1);
    //     return (int)(res % 1000000007);
    // }

//}


//LAST DP!!!


package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;


public class XI_NTH_CATALAN_NUMBER {

    public static int nthCatalan(int n){
        int dp[] =  new int[n+1];
        dp[0]=dp[1]=1;

        for (int i=2;i<=n;i++){
            dp[i]=0;
            for (int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];

            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        System.out.println(nthCatalan(43));
    }
}
