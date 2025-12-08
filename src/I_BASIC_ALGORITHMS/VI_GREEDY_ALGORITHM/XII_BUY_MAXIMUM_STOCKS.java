package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XII_BUY_MAXIMUM_STOCKS {

    public static int buyMaximumProducts(int n, int k, int[] price) {

        int sum=0;
        int stocks=0;

        int maxproduct[][] = new int[n][2];

        for(int i=0;i<n;i++){
            maxproduct[i][0]=i+1;
            maxproduct[i][1]=price[i];

        }

        Arrays.sort(maxproduct,(a, b)->(a[1]-b[1]));


        for(int i=0;i<n;i++){
            for(int j=1;j<=maxproduct[i][0];j++){
                sum+=maxproduct[i][1];
                stocks++;
                if(sum>k){
                    stocks--;
                    return stocks;
                }
            }

        }

        return stocks;


    }

    public static void main(String[] args) {
        int arr[]={11,13,9,4};
        System.out.println(buyMaximumProducts(4,46,arr));
    }
}

//NOTE=>
//1. MEKO ITH DAY PE ME MAX I STOCK KHARID SAKTA HU.. => LIKE DAY 1 PE 1, DAY2-2,DAY3-3...
//2. MEKO K DIYA HAI...MERA NET AMUOUNT MUST BE LESS THAN K ..

//EK ex DEKHAO SABH SAJ JAYEGA!!...
// k=46 & {11,13,9,4}
// 11*1+13*2+9*1 => 46 toh bhar gaya  and sirf 4 stocks
// 4*4+9*3 => 46 bhara but 7 stocks..
//so hame sort karna hai and then check karo so maxstoclk aaya jayenge simple ..