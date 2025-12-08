package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class V_CHOCLATE_DISTRIBUTION_MINDIFFERENCE {
    public static void main(String[] args) {
        int m =5;
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        Collections.sort(arr);
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        int minDiff= Integer.MAX_VALUE;
        int i=0,j=i+m-1; // ZERO BASED INDEXING....mere ko ek kam karna padega as meko m ka set lena hai so mera i pakadke aur m-1 hio aage jaunga right?...so 5 ke set keliyae mera i=0 hai toh mera j=4 hoga toh hi !!1
        while(j<arr.size()){
            if(minDiff>arr.get(j)-arr.get(i)){
                minDiff = arr.get(j)-arr.get(i);
            }
            i++;
            j++;
        }
        System.out.println();
        System.out.println(minDiff);
    }
}



//NOTE=>
//LOGIC VAISE KUCH HAI NHI MUZHE BASS MINIMUM DIFFERNCE CHAYIE THAT TOH SORTED KARKE HIO POSSIBLE HAI BAKI SAB COMBINQATION TOH ELIMINATIE HO JAYENGE!!!

