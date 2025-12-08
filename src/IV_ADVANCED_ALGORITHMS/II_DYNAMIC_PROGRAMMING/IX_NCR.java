package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class IX_NCR {

//    DIRECT FATORIAL SE NAHI HOGA AS JAN N ADN R BADE JONGR TO H DENOMINATIOR ME N!AND N-R! HOG AJO KI LONG ME BHI NHI BETHEGA SO DIVIDE BY ZERO KA EXCEPTION HOGA AND HENCE HAME HAAR ITERATION ME CHECK KARNA PADEGA!!!


    public static int nCr(int n, int r) {
        if (r > n) return 0;           // Edge case fix
        if (r > n - r) r = n - r;      // Symmetry optimization

        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);

            if (res > Integer.MAX_VALUE) {
                throw new ArithmeticException("Result exceeds int range");
            }
        }

        return (int) res;
    }


    public static void main(String[] args) {
        int n = 21;
        int r = 16;
        long result = nCr(n, r);
        System.out.println(result);  // Expected: 20349
    }
}




//BIUT HAMNE DP NAHI LAGAYA BHAI!!!
