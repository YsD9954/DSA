package I_BASIC_ALGORITHMS.V_RECURSION;

public class XIV_ZERO_ONE_KNAPSACK {
    public static int o1knap(int W,int[] val,int[] wt,int valsum,int wtsum,int i, int n){
        if(wtsum>W){ // first ye check karp...condition ka order matter karta hai!!
            return Integer.MIN_VALUE;//so that max val na ho!
        }

        if(i>n-1){
            return valsum;
        }

        //include karo
        int include = o1knap(W,val,wt,valsum+val[i],wtsum+wt[i],i+1,n);
        //nhi toh mat karo..
        int exclude = o1knap(W,val,wt,valsum,wtsum,i+1,n);

        return Math.max(include,exclude);

    }

    public static void main(String[] args) {
        int W = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        int valsum=0;
        int wtsum = 0;
        int n= wt.length;
        System.out.println(o1knap(W,val,wt,valsum,wtsum,0,n));

    }
}

//0-1 Knapsack → each item only once
//Unbounded Knapsack → same item multiple times
//Fractional Knapsack → can take parts of an item


//learning..
//1. recursive call me kabhi bhi i++ or i-- or ++i or --i nhi karna !! i+1 and i-1 yahi!!!
//2. base cases ka order bahut matter karta hai..

