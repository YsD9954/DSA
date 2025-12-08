package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class VII_COINS_CHANGE_PROBLEM {
    public static int count(int coins[], int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base case: There is 1 way to make the sum 0 (by choosing nothing)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];  // Can't include this coin
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];  // Exclude + Include
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 3};
        int sum = 4;
        System.out.println(count(coins, sum));  // Output: 4

    }
}

