package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class XII_PARTITION_EQUAL_SUBSET_SUM {

    static boolean equalPartition(int arr[]) {
        // METHOD 1 ---- FAILED:(
        // sort
        // 1,5,5,11
        // 1`<11
        // 1+5<11
        // 1+5+5=11;



//         Arrays.sort(arr);

        // int i=0,j=arr.length-1;
        // int sumi=arr[i];
        // int sumj=arr[j] ;
        // while(i<j){
        //     if(sumi<sumj){
        //         i++;
        //         sumi+=arr[i];
        //     }
        //     else if(sumi==sumj){
        //         return true;
        //     }
        //     else{
        //         j--;
        //         sumj+=arr[j];
        //     }
        // }

        // return false;

        // what if bichme ka ek part adn baki ek part!!
        // 1 6 11 6
        // wronggggggggggggg!!!!!!


//      METHOD2-----  CORRECT WAY DP!!!

        Arrays.sort(arr);

        int sum = 0;
        for (int num : arr) sum += num;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);

        for (int num : arr) {
            Set<Integer> nextDP = new HashSet<>();
            for (int t : dp) {
                nextDP.add(t);
                nextDP.add(t + num);
            }
            dp = nextDP;
        }

        return dp.contains(target);

    }

    public static void main(String[] args) {
        int arr[]  = {1, 5, 11, 5};
        System.out.println(equalPartition(arr));
    }
}

//NOTE=>
//SIREF DP LAGAO!!
//1. WE HAVE TO FIND EQUAL SUBSET SO IF WE GET HALF OF IT THEN REST WILL BE DEFINATELY HALF OF IT
//2. SO WE NEED A SUBSET WHICH IS SUM/2  SUM = PURE ARRAY KA SUM!! HERE IS 22 SO WE FIND 11!!
//3. IF SUM/2 IS ODD SO IT'S IMMO=POSSIBLE TO DIVIDE IN 2 EQULA PART AND HENCE FALSE!!
//4.  SO WE HASHSET TO FIND SUM/2 AND WE JUST WANT SUM/2 IN THAT SET SO IF IT GOT THEN TRUE ELSE FALSE..
//5 SO IN HASHSET WE ADDED 0 SO THAT IF LAST ANY ELEMTN ADDED TRHAT WILL ADD TO THAT FIRST ELEMENT WILL ADD TO THAT 0 ADN THEN THA TWIL ADD TIN HASHSET AND THIS WILL CONTINUE LIKE EVRY NEW ELEMENT WILL ADD TO ALL NUMBERS IN HASHSET SO..EITHER IT WILL IT OWN LIKE AFTER ADDIGN 0 OR IT WIL SOME ELESE BYUADDINGTO ANOTHER NUMBR
//6.SO HERE WE WILL GET ALL POSSIBLE SUBSET SUMS AND IF (SUM/2) IS THERE RETURN TRUE ELSE FALSE

//IN OTUR EX=>
//ARRYS SORT=>{1,5,5,6}.. & SUM%2=11!!!


//ARR={}// KISIKO NHI TRAVERSE KIYA..
//SET ={0}..INTIALLY
//ARR={1}// 1 PE AAYA..
//SET ={0,0+1}..=> {0,1}
//ARR={1,5}// 5 PE AAYA..
//SET ={0,1,0+5,1+5}=> {0,1,5,6}
//ARR={1,5,5}// DUSRE 5 PE...
//SET ={0,1,5,6,0+5,1+5,5+5,6+5}..=>{0,1,5,6,5,6,10,11}=> {0,1,5,6,10,11}..NO DUPLICATES..=>*SEE 11 AA GAYA HAI SO BUT STILL AS LOOP HIUMNE LAST TAK HAI SO LAST TAK CHULU RAKHENGE!!*
////ARR={1,5,5,11}..
////SET ={0,1,5,6,10,11}=>{0,1,5,6,10,11,0+11,1+11,5+11,6+11,10+11,11+11}=>{0,1,5,6,10,11,11,12,16,17,21,22}..=>FIRSE 11 AAGAYA HAI ..MATTER NHI KART ABUT HTIK HAI!!

//SO IS SUM/2=11 PRESENT IN SET?===> YES!!=> TRUE!!!