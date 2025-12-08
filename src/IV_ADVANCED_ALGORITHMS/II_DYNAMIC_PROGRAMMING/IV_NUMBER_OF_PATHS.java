////package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
////
////public class IV_NUMBER_OF_PATHS {
////    public static int numberOfPaths(int m, int n) {
////        if(m==1 && n==1){
////            return 1;
////        }
////        if(m==0||n==0){
////            return 0;
////        }
////        int downWays = numberOfPaths(m-1,n);
////        int rightWays = numberOfPaths(m,n-1);
////        return downWays+rightWays;
////    }
////    public static void main(String[] args) {
////        System.out.println(numberOfPaths(3,3));
////    }
////}
////
////
//////HERE WE KNOW THAT MERA STARTING HOGA 0,0 AND END HOGA M,N....
//////SO WE KNOW THAT ME SIRF RIGHT AND  DOWN JA SAKTA HU SO IF ME ULTA  CONSIDER KARU MERE GRID KO
//////LIKE M,N SE ME 0,0 JANA HAI SO ME SIRF JUB RIGH TJAUNGA TAB COLMN KAM KARUNGA..AND SAME ME DOWN JAUNGA TOH ROW KAM KARUNGA
//////SO BASS KHATAM!!
//////
////
//////BUT LAFDA HAI KI RECURSION SE TIMELIMIT EXCEED HO RA!!
////
////
////
//
//
//
//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//public class IV_NUMBER_OF_PATHS {
//    public static int numberOfPaths(int m, int n) {
//        int dp[][] = new int[m+1][n+1];
//        for (int i=0;i<=m;i++){
//            for (int j=0;j<=n;j++){
//                dp[i][j]=-1;
//            }
//        }
//        return paths(m,n,dp);
//    }
//
//    public static int paths(int m,int n,int dp[][]){
//        if(m==1 && n==1){
//            return 1;
//        }
//        if(m==0||n==0){
//            return 0;
//        }
//        if (dp[m][n]!=-1) return dp[m][n];
//        int downWays = paths(m-1,n,dp);
//        int rightWays = paths(m,n-1,dp);
//        return downWays+rightWays;
//    }
//
//
//
//
//    public static void main(String[] args) {
//        System.out.println(numberOfPaths(3,3));
//    }
//}
//
//
//WAYII => TABULATION!!!

//for this colmn koi left nhi hai so sorf 1!!!
//                                    \|/
//                            dp[][] = 1 1 1 1 1 //<-koi up boax nhi hai so surf 1
//                                     1 2 3 4 5 // <-left + up box ko add karo !!!!
//                                     1 3 6 10 15 // same add akrte jao and fogot about all rest of path meko bass top and left vale ke bax ki parpvah  hai as me sirf right and bottm mwe ja sakta hu!!

package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
public class IV_NUMBER_OF_PATHS {
    public static int numberOfPaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0 ||j==0){
                    dp[i][j]=1;//first row or column ke liye ek hi hai!!
                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        System.out.println(numberOfPaths(3,5));
    }
}


