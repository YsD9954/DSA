package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
// SORTING=>ARRANGING DATA IN SOME LOGICAL ORDER
// EX=>
// NUMERIC VALUES-> ASCENDING OR DESCENDING ORDER
// ALPHANUERIC VALUES->DICTIONARY ORDER

// -----------------------------------------------------------------

// 1.BUBBLE SORT
// 2.SELECTION SORT
// 3.INSERTION SORT
// 4.MERGE SORT
// 5.QUICK SORT
// 6.HEAP SORT


//                                                          ✨1. BUBBLE SORT

// CONCEPT==========================>

// 36,19,29,12,5

// ROUND1=>

// 36,19,29,12,5
// -----
// 19,36,29,12,5
//   -----
// 19,29,36,12,5
//       -----
// 19,29,12,36,5
//          -----
// 19,29,12,5,|36|

// here WE GOT LAST ELEMENT !!



// ROUND2=>

// 19,29,12,5,36
// -----
// 19,29,12,5,36
//   -----
// 19,12,29,5,36
//       -----
// 19,12,5,|29|,36

// here WE GOT SECOND LAST ELEMENT !!



// ROUND3=>

// 19,12,5,29,36
// -----
// 12,19,5,29,36
//       -----
// 12,5,|19|,29,36


// ROUND4=>

// |5|,12,19,29,36

// here WE GOT FINAlLY SORTED LIST BY BUBBLE SORT!!!!!!!!!!!!!!!!



// LET,S CODE IT!!!!


//public class BAIC_SORTING_CONCEPT {
//    public static void main(String[] args) {
//
//        int arr[] = {36,19,29,12,5};
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=0;j<arr.length-1-i;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//}




//                                                          ✨2. SELECTION SORT
// SELECTION SORT =>SEARCHING +SORTING!!
// ->ALGO MAINTANS TWO SUBARRAY


// EX=>38,52,9,18,6,62,13

// 1.38,52,9,18,6,62,13
//   |__________|
// SEARCHED FOR SMALLEST IN COMPLETE ARRAY AND THEN SWAP WITH THAT NO.{CHEKED FROM 1ST INDEX}
// 2.6,52,9,18,38,62,13
//   -        --
// SEARCHED FOR SMALLEST IN COMPLETE ARRAY AND THEN SWAP WITH THAT NO. {CHECKED FROM 2ND INDEX }
//3. 6,9,52,18,38,62,13
//     -----
//4. 6,9,13,18,38,62,52
//       --          --
//5. 6,9,13,18,38,62,52
//   KOI BHI ELEMENT 18N SE CHOTA NAHI HAI SO SAME ARRAY RETURN
//6. 6,9,13,18,38,62,52
// KOI BHI ELEMENT 38N SE CHOTA NAHI HAI SO SAME ARRAY RETURN
//7. 6,9,13,18,38,62,52
//8. 6,9,13,18,38,52,62
//                -- --
// SO HERE WE COME TO LAST INDEX SO NEXT COMPARE NAHI KAR SAKTE SO WE GOT SORTED ARRAY!!!






// LET'S CODE IT!!
//
//
//public class BAIC_SORTING_CONCEPT {
//    public static void main(String[] args) {
//
//        int arr[] = {36,19,29,12,5};
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//}

//                                                          ✨3. INSERTION SORT


// CHOSE ELEMENT FROM START TO END ACCORDING TO INDEX AND INSERT IT IN APPROPIATE ORDER!!

// 5,1,6,2,4,3
// 1.->5,1,6,2,4,3
// 2.->1,5,6,2,4,3
// 3.->1,5,6,2,4,3
// 4.->1,2,5,6,4,3
// 5.->1,2,4,5,6,3
// 6.->1,2,3,4,5,6


// LET'S CODE IT!!
//
//    public class BAIC_SORTING_CONCEPT {
//        public static void main(String[] args) {
//            int arr[] = {5,1,6,2,4,3};
//
//            for (int i=0;i<arr.length;i++){
//                int temp=arr[i];
//                int j=i;
//                while(j>0 && arr[j-1]>temp){
//                    arr[j]=arr[j-1];
//                    j=j-1;
//                }
//                arr[j]=temp;
//            }
//
//            for (int i=0;i<arr.length;i++){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }





//                                                          ✨4. MERGE SORT


//                      ______________________
//                      |48|36|13|52|19|94|21|
//                      ----------------------
//                             /   \
//                     48,36,13    52,19,94,21
//                       / \           / \
//                     48 36,13    52,19  94,21
//                     |    /\       /\     /\
//                     48  36 13   52 19   94 21
//                     |   \  /     \ /     \ /
//                     48   13,36  19,52   21,94
//                      \     /       \      /
//                      13,36,48     19,21,52,94
//                             \       /
//                       13,19,21,36,48,52,94


// LET'S CODE IT!!!

    public class BASIC_SORTING_CONCEPT {
        public static void main(String[] args) {
            int arr[] = {5, 1, 6, 2, 4, 3};
            int start=0;
            int end=arr.length-1;
            for (int i=0;i<arr.length;i++){
                int mid = (start+end)/2;

            }


        }
    }






