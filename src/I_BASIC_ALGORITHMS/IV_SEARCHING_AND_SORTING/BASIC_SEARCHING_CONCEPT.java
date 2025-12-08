package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

//                            SEARCHING
//2 TYPES OF SEARCHING...
//1.LINEAR SEARCH
//2.BINARY SEARCH
//------------------------------------------------------------------------------------------
//                          🌟 LINEAR:- *****SEQUENTIAL MANNER!!!*****

//✨ ALGORITHM..
//I. LOOP=>i -> 0 TO n WITH i++(INCRENMENT OF 1 FOR EACH ITERATION)...
//II. CONDITION => IF i==x ==>ELEMENT FOUND!!
             // => ELSE ==>NOT FOUND!!!
//III. EXIT..

//✨ CODE..
//ARRAY...=>
//NORMAL "traversing"  !!!!!!!!!!!!
    //for(int i to n){
    //    check X ==arr[i];
    //    print(X "- index at -",i);
    //}
    //return -1 //if not present!

//✨ TIME COMPLEXITY..
// FOR EACH ITERn => 0 TO n
// T(L.S)=n

//                          🌟 BINARY SEARCH=>
//                           *****i.FAST SEARCHING ALGO!
//                                ii.DIVIDE & CONQUER!
//                                iii.ARRRAY MUST BE SORTED!*****




//✨ ALGORITHM..
//I. SET START=0 AND END =n-1 SO WE NEED FIND X!!
//II. LOOP=>WHILE LAGAO TILL START<END ...
//III. MID = (START+END)/2!
//IV. CONDITION => IF MID==X ==>ELEMENT FOUND!!
//              => ELSE IF MID > X ==>END=MID-1!!!
//              => ELSE => START=MID+1!!!
//V. EXIT..

//✨ CODE..
//ARRAY...=>
//start=0,end=arr.length-1;
    //while(start<=end){
    // 	    int mid = (start+end)/2;

    // 	    if(arr[mid]==X){
    // 	        return mid;
    // 	    }
    // 	    if(arr[mid]<=X){
    // 	        start= mid+1;
    // 	    }
    // 	    else{
    // 	        end=mid-1;
    // 	    }

    // 	}
    // 	return -1;

// ✨ TIME COMPLEXITY => logn
// 	HERE!!!
//       n > logn
// 	so T(L.S)>T(B.S)

// !!!!!!!!!!!!!!	HENCE BINARY SEARCH IS BETTER OPTION   !!!!!!!!!!11




//BEST EXAMPLE FOR BINARY SEARCH IS -> "FIND STARTING AND ENDING INDEX OF TARGET"...
//~FACEBOOK QUESTION...


//                                  ... LINEAR SEARCH ...
//public class BASIC_SEARCHING_AND_SORTING {
//    public static void main(String[] args) {
//        int arr[] = {5,7,7,7,7,8,8,10};
//        int target = 7;
//        int temp1=0;
//        int temp2=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                temp1=i;
//                 while(arr[temp1]==target){
//                     temp1--;
//                 }
//                 temp2=i;
//                 while(arr[temp2]==target){
//                     temp2++;
//                 }
//                 break;
//            }
//        }
//        System.out.println((temp1+1)+"  "+(temp2-1)); //dono loop ek baar aage jayenge..so ..
//    }
//}


//                                  ... BINARY SEARCH ...
//public class BASIC_SEARCHING_AND_SORTING {
//    public static void main(String[] args) {
//        int arr[] = {5,7,7,7,7,8,8,10};
//        int target = 7;
//        int start=0;
//        int end=arr.length-1;
//        int i=0;
//        int mid = 0;
//        int temp1=mid;
//        int temp2=mid;
//        while(start<end){
//             mid = (start+end)/2;
//             if (arr[mid]==target){
//                 start=end; //for stoping nexr iteration...as hame ek target mil gaya then baki toh uske baju me hi hoge as sorted array hai.....simple!:)
//                 temp1=mid;
//                 while(arr[temp1]==target){
//                     temp1--;
//                 }
//                 temp2=mid;
//                 while(arr[temp2]==target){
//                     temp2++;
//                 }
//             } else if (arr[mid]>target) {
//                 end = mid+1;
//             }
//             else {
//                 start=mid-1;
//             }
//         }
//        System.out.println((temp1+1)+"  "+(temp2-1)); //dono loop ek baar aage jayenge..so ..
//    }
//}









