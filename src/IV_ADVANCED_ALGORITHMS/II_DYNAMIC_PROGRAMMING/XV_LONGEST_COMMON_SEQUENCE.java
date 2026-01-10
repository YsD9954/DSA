package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class XV_LONGEST_COMMON_SEQUENCE{
    public static int dp[][];
    public static int lcs(String x, String y, int i, int j) {
        if(i==0|| j==0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(x.charAt(i-1)==y.charAt(j-1)) {
            return dp[i][j] = 1 + lcs(x, y, i - 1, j - 1);
        }
        else{
            return dp[i][j] = Math.max(lcs(x, y, i - 1, j ),lcs(x, y, i , j - 1));
        }
    }
    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        dp = new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs(X, Y, m, n));
    }
}

//recursive+memozize => Top to bottom  => that is length --> 0!!!
