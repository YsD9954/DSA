package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
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


//public class BASIC_SORTING_CONCEPT {
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
//public class BASIC_SORTING_CONCEPT {
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
//    public class BASIC_SORTING_CONCEPT {
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
//public class BASIC_SORTING_CONCEPT {
//    static void merge(int[] arr, int left, int mid, int right) {
//        int[] temp = new int[right - left + 1];
//
//        int i = left;      // pointer for left half
//        int j = mid + 1;   // pointer for right half
//        int k = 0;         // pointer for temp array
//
//        while (i <= mid && j <= right) {
//            if (arr[i] < arr[j]) {
//                temp[k++] = arr[i++];
//            } else {
//                temp[k++] = arr[j++];
//            }
//        }
//
//        // Copy remaining elements
//        while (i <= mid) {
//            temp[k++] = arr[i++];
//        }
//        while (j <= right) {
//            temp[k++] = arr[j++];
//        }
//
//        // Copy temp back to original array
//        for (int x = 0; x < temp.length; x++) {
//            arr[left + x] = temp[x];
//        }
//    }
//
//    // Merge Sort Function
//    static void mergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid + 1, right);
//
//            merge(arr, left, mid, right);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {36, 19, 29, 12, 5};
//
//        mergeSort(arr, 0, arr.length - 1);
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//}
//
//



//                                                          ✨5. QUICK SORT


// EX=> 15,9,7,13,12,16,4,18,11
// CHOOSE ANY PIVOT !!
// LET PIVOT =12

// |15,9,7,13,|12|,16,4,18,11|
//  --                     --
// |11,9,7,13,|12|,16,4,18,15|
//     -                --
// |11,9,7,13,|12|,16,4,18,15|
//       -            -
// |11,9,4,13,|12|,16,7,18,15|
//         --      --
// |11,9,4,13,|12|,16,7,18,15|

// // NOW FOR SAME LOGIC FOR LEFT AND RIGHT SIDE ONCE AGIAN!!!!
// |11,9,|4,13,|12|,16,7,|18,15|



// LET'S CODE IT!!!!!!11


// class BASIC_SORTING_CONCEPT{
//     public static void main(String[] args){
//         int[] arr = {15,9,7,13,12,16,4,18,11};
//         int leng = arr.length;
//         Main ms = new Main();
//         ms.quickSortRecursion(arr,0,leng-1);
//         ms.printArray(arr);

//     }
//     int partition(int[] arr,int low,int high){
//         int pivot = arr[(low+high)/2];
//         while(low<=high){
//             while(arr[low]<pivot){
//                 low++;
//             }
//             while(arr[high]>pivot){
//                 high--;
//             }
//             while(arr[high]>pivot){
//                 high--;

//             }
//             if(low<=high){
//                 int temp = arr[low];
//                 arr[low]=arr[high];
//                 arr[high]=temp;
//                 low++;
//                 high--;

//             }
//         }

//         return low;

//     }

//     void quickSortRecursion(int[] arr,int low,int high){
//         int pi = partition(arr,low,high);
//         if(low<pi-1){
//             quickSortRecursion(arr,low,pi-1);
//         }
//         if(pi<high){
//             quickSortRecursion(arr,pi,high);

//         }
//     }

//     void printArray(int arr[]){
//         for(int i :arr){
//             System.out.print(i+" ");
//         }
//     }


// }











// 7.HEAP SORT =>

//               ROOT->    ( )
//              EDGE->   /  |  \
//                      ( )( )( )    }
//      PARENT NODE->   /\  \  /\    |->SUB TREE!!
//      CHILD NODE ->  ()() ()()()   }


// TREE IS SEQUENCE OF NODES !!!

// THERE IS STARTING NODE KNOWN ROOT NODE!!

// EVERY NODE OTHER THAN THE ROOT NODE HAS A PARENT NODE!!

// NODES MAY HAVE ANY NUMBER OF CHILDREN!!





//  5,3,4,7,9,6,1

//                          5                 ->LEVEL 0
//                        /   \
//                      3      4              ->LEVEL 1
//                     / \     / \
//                   7    9   6   1           ->LEVEL 2

// 1. THIS IS COMPLETE BINARY TREE!!!
// 2. PARENT NODE>= CHILD NODE ==> MAX HEAP !!!
//    PARENT NODE<= CHILD NODE ==> MIN HEAP !!!
// 3. CONVERT TO ARRAY ....
//   ______________________
//   |22|13|17|11|10|14|12|
//   ----------------------

// FOR CHILD INDEX => 2*i+1 {LEFT} || 2*i+2 {RIGHT}
// FOR PARENT INDEX => i-1 / 2


// let's start heap sort!!!

//      ______________________
//      |22|13|17|11|10|14|12|
//      ----------------------

//                         22

//                    13   ||  17

//                 11   10 || 14  12

//              22,13,17,11,10,14,12
//              --                --
//              12,13,17,11,10,14,22


//              12,13,17,11,10,14,|22
//
//                         12  NOT        13           17
//                         /   ==>        / \  =>      /\
//                       13  POSSIBLE   12 17        12 13
//                                                   /\   /
//                                                 11 10  13
//              13,12,14,11,10,|17,22
//              13,12,14,11,10,|17,22

//                            .
//                            .
//                            .
//                            .
//             { 10,11,12,13,14,17,22 }



// LET'S CODE IT!!


// class Main{
//     public static void main(String[] args){
//         int[] arr = {22,13,17,11,10,14,12};

//         Main ms = new Main();
//         ms.sort(arr);
//         ms.printArray(arr);

//     }

//     void sort(int[] arr){
//         int leng = arr.length;
//         for (int i=leng/2-1;i>=0;i--){
//             heapify(arr,leng,i);
//         }

//         for (int i=leng-1;i>=0;i--){
//             int temp = arr[0];
//             arr[0]=arr[i];
//             arr[i]=temp;

//             heapify(arr,i,0);
// }
//     }
//     void heapify(int[] arr,int n,int i){
//         int largest = i;
//         int li = 2*i+1;
//         int ri = 2*i+2;

//         if(li<n && arr[li]>arr[largest]){
//             largest = li;
//         }

//         if(ri<n && arr[ri]>arr[largest]){
//             largest = ri;
//         }
//         if(largest!=i){
//             int temp = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = temp;

//             heapify(arr,n,largest);

//         }
//     }
//     void printArray(int[] arr){
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



