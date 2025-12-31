package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class XIV_COUNT_OF_SUBSET_WITH_SUM_EQUAL_TO_TARGET {

        public static int MOD = 1000000007;
        static Integer[][] dp;

        public static int solve(int[] nums, int target, int sum, int idx) {
            if (idx == nums.length) {
                return (sum == target) ? 1 : 0;
            }

            if (dp[idx][sum] != null) return dp[idx][sum];

            int include = 0;
            if (sum + nums[idx] <= target) {
                include = solve(nums, target, sum + nums[idx], idx + 1);
            }
            int exclude = solve(nums, target, sum, idx + 1);

            return dp[idx][sum] = (include + exclude) % MOD;
        }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3} ;
        int target = 6;
        dp = new Integer[nums.length][target + 1];
        int count = solve(nums, target, 0, 0);
        System.out.println(count);//3
    }
}
