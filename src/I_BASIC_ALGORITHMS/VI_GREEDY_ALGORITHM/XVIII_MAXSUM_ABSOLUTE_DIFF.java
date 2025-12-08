package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XVIII_MAXSUM_ABSOLUTE_DIFF {
    static int MaxSumDifference(Integer []a, int n)
    {

        int maxsum = 0;

        Arrays.sort(a);
        List<Integer> diff = new ArrayList<>();

        for (int i=0;i<n/2;i++){
            diff.add(a[i]);
            diff.add(a[n-1-i]);
        }
        if(a.length%2!=0){
            diff.add(a[n/2]);
        }

        maxsum = maxsum +
                Math.abs(diff.get(n - 1)
                        - diff.get(0));

        // return the value
        return maxsum;
    }

    // Driver Code
    public static void main(String args[])
    {
        Integer []a = { 1, 2, 4, 8 };
        int n = a.length;

        System.out.print(MaxSumDifference(a, n));
    }
}



//NOTE =>
//1 SORT THE ARRAY!
//2 new list and add smallest ,larget => so diff is max..and do this till all elements aar e not filled!!
//3 for odd length array ek extra bich ka element .....end me aayega!!!
//4