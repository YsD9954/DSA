package I_BASIC_ALGORITHMS.VIII_COLLECTION_FRAMEWORK;


// IN ORDER TO STUDY COLLECTION FRAMEWORKS WE HAVE TO FIRST KNOW WHY & HOW?

// FIRST OF ALL WHAT IS DATA STRUCTURE??
//->IT IS WAY BY WHICH WE CAN STORE THE DATA IN EFFICIENT WAY ..
//                                                 /\
//                                         (TIME)  (SPACE)


//   SO NOW WHAT IS DSA??
//   ->DATA STRUCTURE AND ALOGORITHMS..
//        SAME HAI BUT BY USING ALOGORITHMS WE ENHANCE THE WAY DATA IS  STRUCTURED
// TO FEEL :).......

// AS HAM , GOOGLE ME GAYE-> AMAJON PE JAKE-> HP LAPTOPS DALE->THEN HAM PRICE VARY KIYE
//                                  |               |                    |
//                           (SEARCHING ALGO)   (SEARCHING ALGO)   (SORTING ALGO)

// ABHI ISS ALOGORITHMS KA JAB DATA STRUCTURE KE SATH MILAB HOTA HAI TAB EK JABRI SYSTEM DESIGN HOTI HE..
// NOTE=>YE SAB ALGO BOHOT FAST WORK HONGE TO HI USER USE KAREGA OTHERWISE NAHI


// NOW BUT COLLECTION FRAMEWORKS AND D.S KA KYA RELATION HAI???
// SO LET'S DEKHTE HAI..



//                                        D.S
//                                         |
//       ----------------------------------------------------------------------
//       |                                                                    |
//   PRIMITIVE D.S                                                  NON-PRIMITIVE D.S
// (1 entity -> 1 data..)                                          (1 entity -> multiple data..)
//       |                                                                    |
// {JO 8 HAMNE BASICS ME KIYE THE..}                               -----------------------------
// i.e-boolean                                                     |                           |
//     char                                                    LINEAR D.S                    NON-LINEAR D.S
//     byte,short,int,long                                         |                           |
//     float,double                                             eg-String          _______________________
//                                                                 Array           |            eg-Graph  |
// * NOT MORE THAN THIS *                                         _________________|            Trees     |
//                                                               | List,Set,Queue                         |
//         ||                                                    | Arraylist,LinkedList                   |
//         \/                                                    | HashSet,LinkedHashSet                  |
// USED IN ....                                                  | etc..                                  |
// ->CALCULATORS                                                  \                                      /
// ->SNAKE GAMES                                                    \                                  /
// ->COURRENCY CONVERTOR                                              \------------------------------/
// ->LIKE THIS MANY MORE..                                                            ||
//                                                                                    \/
//                                                                          * COLLECTION FRAMEWORKS*
//                                                                                   ||
//                                                                                   \/
//                                                                          NON PRIMITIVE USED IN..
//                                                                          ->E COMMERCE.
//                                                                          ->SOCIAL NETWORKING.
//                                                                          ->BANKING.


// COLLECTION FRAMEWORKS =>

//COLLECTION ->IT IS THE SINGLE ENTITY OR OBJECT WHICH CAN STORE MULTIPLE DATA..
//FRAMEWORK -> SET OF LIBRARY..
//SO COLLECTION FRAMEWORK => IT IS THE SET OF PREDEFINED class & interface WHICH IS USED TO STORE MULTIPLE DATA..

//**NOTE==>
//SO ONTHER QUESTION IS THAT WHAT IS DIFFERENCE B/W COLLECTION FRAMEWORK V/S COLLECTION V/S COLLECTIONS
//1.COLLECTION FRAMEWORK(API) :-
//*"IT IS AN API WHICH CONTAINS PREDEFINED classes & interfaces ..."*

//2.COLLECTION(interface):-
//*"IT IS THE ROOT interface (PRESENT IN java.util.package) OF ALL THE COLLECTION OBJECT.."*

//3.COLLECTIONS(Utility Class):-
//*"IT IS THE UTILITY CLASS WHICH CONTAIN ONLY STATIC METHODS"*


//SO TALKING ABOUT COLLECTION FRAMEWORK,,
//COLLECTION FRAMEWORK => COLLECTOION + MAP + ITERATOR!

// 		                                                ____________
// 		                                                [COLLECTION]
// 	                                                    ------------
// 		                                                       |
// 	            |----------------------------------------------|---------------------------------------|
//              |                                              |                                       |
//       List(interface)                                    Set(interface)                        Queue(interface)
//               |{implements THE List}                          |                                        |
//  |------------|-----------|                            |---------------|                         ----------------
// Arraylist  LinkedList   Vector(legacyClass)          HashSet       SortedSet(interface)           |              |
//                             |                             |               |                    priorityQueue  Deque(interface)
//                           Stack(legacyClass)            LinkedHashSet   NavigableSet(interface)                       |
//                                                                           |                                       ArrayDeque
//                                                                         TreeSet






//         What is Legacy Class :-
//         Collection Framework was not present in early versions of java. Instead it defines only several classes and one interface to store the objects.
// But when Collection Framework came, these old classes were re-engineered or modified to support the Collection Framework. These old classes are known are legacy classes.


//                                                    _____
//                                                    [Map]
//                                                    -----                                Dictionary
//                                                      |                                       |
//        |------------|-----------------|--------------|---------------------------------------|
//        |            |                 |              |                                       |
//       HashMap       |           WeakHashMap     SortedMap  (interface)                       |
//       |       IdentityHashMap                        |                                       |
//       |                                        NavigableMapc(interface)                   Hashtable
// LinkedHashMap                                        |                                       |
//                                                  TreeMap                                Properties



//                                                    __________
//                                                    [Iterator]
//                                                    ----------                                Dictionary
//                                                        |
//                                                  ListIterator (interface)



//SO WE JSUT STUDY THOSE WE USE OR IMP ONLY AS ALL OTHJER ARE VERY SIMILAR TO THIS SO WE DON'T NEED TO BOTHER ABIOUT ALL OTHER..
//COLLECTION=>
//LIST-> arraylist,linkedlist(DONE✅),stack(DONE✅) => JAHA CONTIGUOS LIST ME DYNAMICALLY(NOT LIKE ARRAY KI PAHILE HI MENTION KARNA PADTA!) VALUES STORE KARNI HAI !!
//SET-> hashset, linkedhashset, treeset => IF MUCHE UNIQUE VALUES STORE KARNA HAI!
//QUEUE(DONE✅)-> arraydeque,linkedlist, ,priorityqeque(heaps!) => IF PRIORITY SET KARNA HAI!!

//MAP=>
//HASHMAP
//TREEMAP
//LINKEDHASHMAP

//NOTE => IF WE KNOW ANY METHODS OF ANY ONE FOR EACH INTERFACE SO ALL CLASS WILL HAVE SAME SO OBJECT SIRF CHANGE HOGA!!
//EX-
//LIST ME ALL ARRAYLIST, LINKEDLIST,ADN ALL IN LIST WILL HAVE SAME METHODS!!
//SAME FOR SET AND QUEUE ALSO ..BUT IF WE EXPECT KI HASHSET ADN STACK KE SAME HONGE SO NAHI BECAUSE BOTH CLASSES ARE IMPLEMENTING DIFFERENT CLASS!!




//SO WE JUST NEED TO COMPLETE => ..
//ARRAYLIST
//HASHSET
//TREESET
//HASHMAP
//TREEMAP