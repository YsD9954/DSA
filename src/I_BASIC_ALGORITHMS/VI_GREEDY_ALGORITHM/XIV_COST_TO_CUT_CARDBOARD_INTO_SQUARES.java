package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XIV_COST_TO_CUT_CARDBOARD_INTO_SQUARES {

        public static int minimumCostOfBreaking(int[] x, int[] y,int m,int n) {
            // code here
            Arrays.sort(x);
            Arrays.sort(y);

            int hCount = 1, vCount = 1;
            int i = x.length - 1, j = y.length - 1;
            int totalCost = 0;

            while(i>=0 &&j>=0){
                if (x[i] >= y[j]) {
                    totalCost += x[i] * hCount;
                    vCount++;
                    i--;
                }
                else {
                    totalCost += y[j] * vCount;
                    hCount++;
                    j--;
                }
            }

            while (i >= 0) {
                totalCost += x[i] * hCount;
                vCount++;
                i--;
            }

            // Process remaining horizontal cuts
            while (j >= 0) {
                totalCost += y[j] * vCount;
                hCount++;
                j--;
            }

            return totalCost;
        }

    public static void main(String[] args) {
        int m = 6, n= 4, x[] = {2, 1, 3, 1, 4}, y[] = {4, 1, 2};
        System.out.println(minimumCostOfBreaking(x,y,m,n));



    }
}
