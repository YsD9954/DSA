
//LET'S START WITH DP..............................'

//NOW FIRST OF AL WHAT IS DYNAMIC PROGRAMMING??????

//THE OPTIMISTIC WAY TO SOLVE RECURSIVE PROBLEMS

//LET'S UNDERSAND WITH AN EXAMPLE..........
//
//
//LET'S SUPPOSE WE HAVE 3 COINS (1,5,7) ..
//AND WE HAVE TO MPAY 18 Rs SO HOW WE PAY??
//
//SO BY FIRST VIEW ON QUESTION
//7 X 2 = 14
//1 X 4 = 4
//
//TOATAL 18 BUT WE USED TOTAL 6 COINS !!!!!
//SO IS THIS OPTIOMISTIC !! NOT..........................
//SO THIS IS CALLED GREEDY ALGO !!!
//
//
//SO INSTEAD OF THAT ...........
//7X1=7
//5X2=10
//1X1=1
//
//TOTAL =18  SO HERE WE USE ONLY 4 COINS !!!!
//SO THIS ONE IS OPTIMISTIC...
//AND CALLED DYNAMIC APPROACH !!!!!!!!!!
//


//LET'S UNDERSTAND WITH ONE OF THE BET EXAMPLE!!
//CONSIDER EXAMPLE OF FIBONACCI SERIES!!!!!!!!!!!!

//FIRST SEE AAM JINDAGI :(!!!!!!!!!!!!!.............................

//int fib(int n){
//    if(n<=1){
//        return n;
//    }
//    return fib(n-2)+fib(n-1);
//}


//SO HERE LET n=5;
//
//                   fib(5)
//               /              \
//        fib(3)                 fib(4)
//        /    \                  /   \
//    fib(1)   fib(2)      fib(2)       fib(3)
//             /  \          /  \          /   \
//        fib(0)  fib(1) fib(0) fib(1)  fib(1)  fib(2)
//                                                /   \
//                                            fib(0) fib(1)



//HERE WE ARE CALLING SAME FUNCTION WITH SAME PARAMETER WHICH CAUSE IN TIME COMPLEXITY !!!!!!!!!!1111

//SO IF KNOW ALLREADY SAME FUNCTION IS CALLED WITH SAME PARAMETER SO NO NEED TO CALL INSTAED OF THAT WE CAN PROVIDE VALUE DIRECTLY AS WE KNOW THE RESULT!!!!!!!!!!!!!!!!!


//SO HERE TIME COMPLEXITY = 2^n


//NOW INSTED OF THAT WE IF DO............

//WAY I=> MEMOIZATION METHOD!!!



//
//WE CREWATED AN ARRAY TO STORE RESULT OF CALLS
//NOW INTIALLY ALL INDEX ARE HAVING VALUE -1
//SO WHEN AS FUNCTION CALL DONE THE VALUE WILL STORE IN THE THAT PARTICULAR INDEX WHICH SHOW PARAMETER
//i.e IF fib(0) called then -> result will store in the 0 th index of array !!! ....and so on....




//{ F => |0|1|1|2|3|5|  }

//
//                   fib(5)
//               /              \
//        fib(3)                 fib(4)
//        /    \                  /   \
//    fib(1)   fib(2)      fib(2)       fib(3)
//             /  \
//        fib(0)  fib(1)


// HA PATA HAI NHI SAMJA !! SEE THIS ..................



// HERE MENE FIRST 5 CHSAYE TOH -> 3 AND 4 KO CALL KIYA BUT FIST 3 KO AND THEN 4 KO... {ARRAY = |-1|-1|-1|-1|-1|-1}...(n+1)SIZE HERE 0 TO 5 SO 6 SIZE KA!!!!!!!
// THEN 3 NE -> 1 KO AND 2 KO (1ST 1 AND THEN 2) =>BUT 1 TOH BASE CASE SO RETURN 1 !! ...ARRAY = |0|1|-1|-1|-1|-1}
// THEN BACHA 2 SO VHO CALL LAGA DEGA 0 AND 1 ANDF BOTH ARE BASE CASE... SO FIBO OF 2 WILL BE 1(0+1)  {ARRAY = |0|1|1|-1|-1|-1}
// NOW ABHI AS WE GOT FIBO OF 1 & 2=> FIBBO OF 3 IS 2 (1+1)...{ARRAY = |0|1|1|2|-1|-1}
// SO NOW FIBBO OF 3 COMPLETE HUA ABHI CALL LAGEGI FIBBO OF 4 SO NOW ...HAME FOR FIBBO OF 4 WE WANT FIBO OF 2 AND 3!!!
// NOW MERE ARRAY ME ALREADY SAVED HAI SO NO NEED TO FINBD AND CALL KARNEKI NO NEED!! SO MERA FIBBO OF 4 WILL BE 3 (1+2)...{ARRAY = |0|1|1|2|3|-1}
// AND LAST I HAVE FIBBO OF 3 AND 4 SO, FIBO OF 5 IS 5(2+3)...{ARRAY = |0|1|1|2|3|5}...

// SO OUR TIME COMPLEXITY IS => N...i.e O(N)!!!!!!!!!!!!!!!1


//WAY II=> TABULATION / ITTERATION (ASLI DP!!!!!)

// YAHA PE HAME DP ARRAY BANAYA HAI RIGHT!!
// => SO... N+1 SIZE KA ARRAY BANAO!!
//=> THEN MERE PASS DP[0] AND DP[1] HAI TOH SIRF DIRECT FOR LOOP LAGAKE N-1 AND N-2 INDEX KO ADD KARO
//LAST ME FOR NTH NUMBER RETURN DP[N]!!!

//DP[] = |0|1| | | | | |
//DP[] = |0|1|1| | | | |...(0+1!!!)
////DP[] = |0|1|1|2| | | |...(1+1!!!)
////DP[] = |0|1|1|2|3| | |...(1+2!!!)
////DP[] = |0|1|1|2|3|5| |...(2+3!!!)
////DP[] = |0|1|1|2|3|5|8|...(3+5!!!)
//SO DP[N] => LAST INDEX VALA ELEMENT => VAHI TOH ANSWER THA MERE BHAI NTH FIBBO KA!!!

//SO IN SHORT PRE ANS KO USE KARKE AGLE ANSWER ME DALNA !!! THIS IS ASLI DP!!!

























