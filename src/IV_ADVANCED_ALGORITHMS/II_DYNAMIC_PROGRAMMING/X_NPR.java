
//                                                    LOGIC 1 -> NOT COMPLETELY CORRECT!!1

//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class X_NPR {
//    public static int permutationCoeff(int n, int k) {
//        if(k>n) return 0;
//
//        long nPk = fact(n)/fact(n-k);
//
//        return (int)nPk;
//    }
//    public static long fact(int n){
//        long fact =1;
//
//        for (int i=1;i<=n;i++){
//            fact *=i;
//        }
//        return fact;
//    }
//    public static void main(String[] args) {
//        System.out.println(permutationCoeff(5,2) );
//    }
//}
//
//
////AGAIN  LAFDA HAI KI IF N AND K BAHUT JAYADA HAIA TOH LAVDE LAG JAYENGE!!!SO LONG LE KE BHI MATLAB NHI SO HAME HAR BAAR DIC=VIDE KARKE SOORE KANRA CHAYIE SO TRHAT VHO DIVISION HUM TORE KAR SAKRTE HAI !!
////THAT CAN BE DON E USING DP!!!
//
//

//                                                                LOGIC2 - SAME BADA INTEGER KA PROBLEM!!

//
//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class X_NPR {
//    public static int permutationCoeff(int n, int k) {
//        if(k>n) return 0;
//
//        int fact[] = new int[n+1];  //dp vala arrray hai !!!
//
//        fact[0]=1; // factorial kabhi bhi 0 nhi hoga!!
//
//        for(int i=1;i<=n;i++){
//            fact[i] = i*fact[i-1]; // 10! = 10 *9!...so hame 1 se shuru karenge as humne 0 ka pata hia fact so fact[i-1] hamesha pata rahega!!!
//
//        }
//        return fact[n]/fact[n-k]; // now you will say ki fact[n-k] kaise aaya but see mera n>k toh mere pass 0 to n sabh fact hai toh mereaass usme fact[n-k] toh aahi jayega na...!!!
//
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(permutationCoeff(5,2) );
//    }
//}
//
//


//                                                  LOGIC III - THIDA ALAG HAI BAASS BUT SAME ERROR

//(N-K)! = N*N-1*N-2*N-K+1*(N-K)!
//         ---------------------
//            (N-K)!


//SOO.. WE NEED ONLY => N*N-1*N-2*N-K+1

//i.e 5P2 => 5*4!!



//package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;
//
//public class X_NPR {
//
//    public static int permutationCoeff(int n, int k) {
//        if (k > n) return 0;
//
//        long result = 1;
//        for (int i = 0; i <k; i++) {
//            result *= (n-i);
//        }
//
//        return (int)result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(permutationCoeff(5,2) );
//    }
//}
//







//                                  LOGIC IV -



package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class X_NPR {


        public static int permutationCoeff(int n, int k) {

            final int MOD = 1000000007;

            if (k > n) return 0;

            long result = 1;

            for (int i = 0; i < k; i++) {
                result = (result * (n - i)) % MOD;
            }

            return (int) result;
        }



    public static void main(String[] args) {
        System.out.println(permutationCoeff(5,2) );
    }
}

