
// TIME AND SPACE COMPLEXITY


// 1.WHAT IS COMPLEXITY ???

// SO TAKE AN EXAMPLE...
//           |OLD COMPUTER                       |                 MACBOOK
// --------------------------------------------------------------------------------------------------
// DATA =>   |1M ELEMENTS IN AN ARRAY            |                 1M ELEMENTS IN AN ARRAY
// ALGO =>   | LINEAR SEARCH                     |                 LINEAR SEARCH
// TIME =>   | 10 SEC                            |                  1 SEC

// SO WHICH ONE HAVE BETTER TIME COMPLEXITY??

// I GUESS--- MACBOOK
// WRONGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG!!!!!!!!!!!!
// THEN -- OLD COMPUTER
// AGAIN WRONGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG!!!!!!!!!!!!!
// SO  ANS IS *****BOTH*****

//  |------------------------------------|
// | TIME   COMPLEXITY  !=  TIME TAKEN  |
//|------------------------------------|


// HERE FOR OLD MACHINE.......

//      TIME
//  5.1K|           .
//  200 |        .
//  100 |     .
//  10  |  .
//      |--|--|--|--|--|--SIZE

// HERE FOR OLD MACHINE.......

//      TIME
//  5.1K|
//  1K  |              .
//  500 |           .
//  200 |
//  100 |        .
//  19  |
//  10  |     .
//  1   |  .
//      |--|--|--|--|--|--SIZE



//  FROM BOTH GRAPHS WE CAN SEE THAT LINEARITY IS COMMON BUT SLOPE,TIME IS DIIFERENT
//       HENCE............................................................
// TIME COMPLEXITY IS FUNCTION THAT TELL US HOW TIME VARIES AS VARIATION IN I/P IS DID!!





// 2.WHY??

// AS TIME FOR ***O(const)<O(logN)<O(N)***

// so BINARY SEARCH IS BETTER THAN LINEAR SEARCH




// 3.WHAT DO WE CONSIDER WHEN THINKING ABOUT COMPLEXITIES!!!

// I)ALWAYS LOOK FOR WORST CASE COMPLEXITIES!!!
// i.e- 10 M KO FOCUS KAREGA KYA 10 KO??

// II)ALWAYS LOOK AT COMPLEXITY FOR LARGE/∞ DATA

// III) IGNORE CONSTANTS
//   REASONS:-
// ->EVEN THOUGH VALUE OF ACTUAL TIME IS DIFFERNT THEY ARE ALL GROWING LINEARITY
// ->WE DON'T CARE ABOUT ACTUAL TIME
// ->THIS IS WHY WE IGNORE ALL CONSTANT


// IV)ALWAYS IGNORE LESS DOMINATING TERMS!!

// EX-1==>
// O(3N^{3}+4N^{2}+5N+6)
// =>(N3+N2+N)
// =>O(N3)



// REPRESENTATION (NOTATIIONS) OF TIME COMPLEXITY ...===========>>>>>>>>>

// BIG O - WORST TC (UPPER BOUND)
// BIG THETA - AVERAGE TC
// BIG OMEGA - BEST TC (LOWER BOUND)

// NOTE=> *NO ONE INTERESTED INTO LOGIC EVERYONE WANTS TC ONLY SO WE ARE ALWAYS USE 'O()' AND NJOT OTHERS...!!!!*

// BUT STILL TP KARTE HAI ..

//                                      WHAT IS BIG O?
// TIME COMPLEXITY/FUNCTION/RELATIONSHIP WILL NEVER EXCEED THAT VALUE INSIDE 'O'

// SO MATHEMATICALLY...........
// f(N) = O(g(N))
// SO...
// lim  f(N)/g(N) < ∞
// N->∞

// EX-
// O(N^3)=6N^3+5N^2+3N+7
// =>
// lim  6N^3+5N^2+3N+7/N^3
// N->∞
// =>
// 6+0+0 ==> 6<∞
// HENCE VERIFIED!!!!!!!!!!!!!

// WE CAN CONCLUDE THIS....LIKE
// IT'S A UPPER BOUND!!!!!!!!!!!!!!!!





//                                      WHAT IS BIG OMEGA?? Ω(N)

// ->********OPPOSITE OF BIG O!!!*********

// lim  f(N)/g(N) > 0
// N->∞


// EX -
// FIND LOWER AND UPPER BOUND OF N^2

// ==>i.e=>O(N) & Ω(N)

// SO HERE COMES BIG THETA WHICH IS COMBINATION OF O(N) & Ω(N)






//                                          BIG THETA θ(N) ==>



// 0 < lim  f(N)/g(N) < ∞
//   N->∞




// LITTLE o NOTATIION==>

// ->UPPER BOUND!!!!!!11

// BUT NOT STRICT!! LOOSE UPPER!!!


// BIG O                       |          LITTLE o
// O(g)                        |           o(g)
// f<=g                        |         F<g (STRICT!!)



// SO...............

//   lim  f(N)/g(N) =0
//   N->∞






// LITTLE Ω NOTATIION=>

// LOOSLY LOWER!!!! NOT STRICT!!


// BIG Ω                       |          LITTLE  ω
// Ω(g)                        |           ω(g)
// f>=g                        |         F>g (STRICT!!)


// //   lim  f(N)/g(N) = ∞
// //   N->∞





// -------------------------------QUESTIONS----------------------------


// for(i=1;i<=N){
//     for(j=1;j<=k;j++){
//         //SOME OPERATIONS THAT TAKE TIME 't'


//     }
//     i=i+k
// }


// Solution==>
// SEE HAMARE PASS O(?) SOCHNA HAI BSS..

// inner loop=>O(kt)

// FOR OUTER LOOP =>
// i=  1,1+k,1+2k,1+3k,1+4k....1+xk
// so, 1+xk<=N
// xk<=N-1
// x=(N-1)/k



// total=O(kt*x)==>O(t*N-1)==>O(Nt)











// NOW COMES TO THEEEEEEEEEEEEEEEEEEEEEE..............

// SPACE COMPLEXITY!!!!!!


// space that's it!!!!!!!!!!!!!!!
//SPACE = AUXILARY SPACE + INPUT SPACE
//                |              |
//       {SPACE YOU USED TO SOLVE PROBLEM} {SPACE YOU USE TO STORE PROBLEM}

//EX-
//int a = sc.nextInt(); => AUXILARY SPACE
//int b = sc.nextInt(); => AUXILARY SPACE
//int c = a+b; =>  INPUT SPACE


// RECURSIVE ALGORITHM===>

//             f(1)
//             /\
//         f(3)  f(2)
//         / \   /  \
//     f(2) f(1) f(1) f(0)
//     /\
// f(1) f(0)

// SO IN STACKS NOT MORE THAN ONE BRANCH CAN PLACE!!!!

// SO -->
// LONGEST CHAIN --> f(1)->f(3)->f(2)->f(1)
//                           OR
//                   f(1)->f(3)->f(2)->f(0)

// BUT NOT ANY OF THE OTHER POSSIBLITIES!!!!!


// CONCLUDE==> ONLY CALL THAT ARE INTERLINKED WILL BE IN THE STACK AT SAME TIME

// SPACE COMPLEXITY = HEIGHT OF TREE or PATHS!!!!!!!!!!!!!!!!!!!!













// TWO TYPE OF RECURRENCE RELATIONSHIP==>

// 1.LINEAR RECURRENCE =>
// 2.DIVIDE AND CONQUER=>

// FOLLOW NOTES!!!!!!!==>https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/lectures/15-complexity/Time%20and%20space%20notes
//.
//.
//.
//.
//.
//BUT KUCH NHI SIMPLY BIG O NOTATION USE KARENGE!!!