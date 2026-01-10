package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class XVI_PRINT_LONGEST_COMMON_SUBSEQUENCE {
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
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int m = x.length();
        int n = y.length();
        dp = new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs(x, y, m, n));
        String ans = "";
        int i =m;
        int j=n;

        while(i>0&&j>0){
            if(x.charAt(i-1)==y.charAt(j-1)) {
                ans+=x.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j]){
                    j--;
                }
                else{
                    i--;
                }
            }
        }
//        System.out.println(ans); ..reverse karo!
        for(int k = ans.length()-1;k>=0;k--){
            System.out.print(ans.charAt(k));
        }
    }
}

//recursive+memozize => Top to bottom  => that is length --> 0!!!
