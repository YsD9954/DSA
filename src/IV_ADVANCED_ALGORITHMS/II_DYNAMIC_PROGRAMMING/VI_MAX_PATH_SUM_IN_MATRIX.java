//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class VI_MAX_PATH_SUM_IN_MATRIX {
//    public static int path(int arr[][] , int r, int c){
//        int n = arr.length, m=arr[0].length;
//        if (r==n||c==0|c==m){
//            return Integer.MIN_VALUE;
//        }
//        if (r==n-1) return arr[r][c];
//        int left = path(arr,r+1,c-1);
//        int down = path(arr,r+1,c);
//        int right = path(arr,r+1,c+1);
//        return arr[r][c] + Math.max(left,Math.max(down,right));
//
//    }
//
//    public static int maxPathSum(int arr[][]){
//        int n= arr.length,m=arr[0].length;
//        int ans = -1;
//
//        for (int j=0;j<m;j++){
//            ans=Math.max(ans,path(arr,0,j));
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int arr[][] = {{3, 6, 1},{2, 3, 4},{5, 5, 1}};
//        System.out.println(maxPathSum(arr));
//
//    }
//}



//NOW SAME TIME EXCEED AAYEGA SO LET'S USE DP!!!!

//
//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class VI_MAX_PATH_SUM_IN_MATRIX {
//    public static int path(int arr[][] , int r, int c,int [][]dp){
//        int n = arr.length, m=arr[0].length;
//        if (r==n||c==0|c==m){
//            return Integer.MIN_VALUE;
//        }
//        if (r==n-1) return arr[r][c];
//        if (dp[r][c]!=0) return dp[r][c];
//        int left = path(arr,r+1,c-1,dp);
//        int down = path(arr,r+1,c,dp);
//        int right = path(arr,r+1,c+1,dp);
//        return
//                dp[r][c]=arr[r][c] + Math.max(left,Math.max(down,right));
//
//    }
//
//    public static int maxPathSum(int arr[][]){
//        int n= arr.length,m=arr[0].length;
//        int ans = -1;
//        int dp[][] = new int[n][m];
//
//
//        for (int j=0;j<m;j++){
//            ans=Math.max(ans,path(arr,0,j,dp));
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int arr[][] = {{3, 6, 1},{2, 3, 4},{5, 5, 1}};
//        System.out.println(maxPathSum(arr));
//
//    }
//}



//WAYS II => TABULATION



package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class VI_MAX_PATH_SUM_IN_MATRIX {


    public static int maxPathSum(int arr[][]){
        int m= arr.length,n=arr[0].length;
        int dp[][] = new int[m][n];

        for (int j=0;j<n;j++){
            dp[0][j]=arr[0][j];
        }
        for (int i=1;i<m;i++){
            for (int j=0;j<n;j++){
                int left = (j>0)? dp[i-1][j-1]:0;
                int up = dp[i-1][j];
                int right = (j+1<n)? dp[i-1][j+1]:0;
                dp[i][j]=arr[i][j]+Math.max(left,Math.max(up,right));
            }
        }

        int max=-1;
        for (int j=0;j<n;j++){
            max=Math.max(max,dp[m-1][j]);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][] = {{3, 6, 1},{2, 3, 4},{5, 5, 1}};
        System.out.println(maxPathSum(arr));

    }
}
