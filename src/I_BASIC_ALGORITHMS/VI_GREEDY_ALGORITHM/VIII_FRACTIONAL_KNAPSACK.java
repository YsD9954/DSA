package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class VIII_FRACTIONAL_KNAPSACK {
    public static void main(String[] args) {
        int val[] = {60, 100, 120}, wt[] = {10, 20, 30}, capacity = 50;

        int n=val.length;

        int[][] vw = new int[n][2];
        for (int i = 0; i < n; i++) {
            vw[i][0] = val[i];
            vw[i][1] = wt[i];
        }

        // Sort by end time
        Arrays.sort(vw, (a, b) -> Double.compare(
                (double) b[0] / b[1],
                (double) a[0] / a[1]
        ));
        double sum=0;
        int w =0;
        int i=0;
        while(w!=capacity){
            if(vw[i][1]<=(capacity-w)){
                sum+=(1.0)*(vw[i][1])*(vw[i][0]/vw[i][1]);
                w+=vw[i][1];
                i++;
            }
            else{
                int remingWeight = capacity-w;
                sum+=(1.0)*remingWeight*(vw[i][0]/vw[i][1]);
                capacity=w; //conditon fail kardi hamne hi..
//                        i++; no i++ as aage jana hi nhi hai!!
            }
        }
System.out.println(sum);



    }
}

//Note=> DIFFICULT TOH HAI BUT SEE..

// mere pass capcity limited hai toh ..

// first me check karunga ki konsa better hai lena aur muzhe samjega by val/wt ratio...

// 60/10 => 6
// 100/20 => 5
// 120/30 => 4
// so sort according to that and then add till how much you can
// so if ican add full 10 yes..add complete 10*6=>60
// if can i add full 20 then yes add => 20*5 =>100
// if can i add ful 30 no..then how much so  20 only => 20*4=>80..