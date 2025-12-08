

// looks like  => Array!!!
// but imagine like => TREE!!!







// HEAP:-
// TOPIC TO BE COVERED IN HEAPS..........
// 1.ARRAY REPRESENTATION OF BINARY TREE..
// 2.COMPLETE BINARY TREE..
// 3.HEAP..
// 4.INSERT AND DELETE..
// 5.HEAP SORT..
// 6.HEAPIFY..
// 7.PRIORITY QUEUE..






// 1.ARRAY REPRESENTATION OF BINARY TREE..


//             A         ----
//             / \           |
//          B    C          |__|A|B|C|D|E|F|G|....>ARRAY!!!
//         / \  / \        |
//       D   E  F  G    ----

// IF BICH VALE MISSING REMAIN THEM AS IT IS !!!

// RELTn =>
// IF , NODE AT INDEX ---> i
// IT'S LEFT CHILD ---> 2i
// IT'S RIGHT CHILD ---> 2i+1
// IT'S PARENT  ---> (int)i/2..







// 2.COMPLETE BINARY TREE...


// NOTE THEIR IS DIFFERENCE B/W FULL AND COMPLETE BT!!!!!!


// FULL => MAXIMUM JITNI FULL HO SAKTI HAI UTNI FULL HONI CHAYIYE!!
//  COMPLETE => NO EMPTY LOCATION!! TILL LAST ELEMENT LAST ELEMENT CHALEENGE!!  {FULL NAHI HOGI TABHI BHI CHALEGI BUT JITNE HAI UTNE ME EMPTY SPACE NAHI CHAYIE!!}



// IF IN A BINARY TREE NO EXTRA NODE CAN ADD AND SO FOR FURTHER ADDING THE NODE HEIGHT OF HEAP INCRESES SO SUCH HEAP IF B.T IS COMPLETE!!
// EX:-

// 1.
//             A
//           / \
//          B     C
//         / \   / \
//       D   E  F   G
//     #   FULL  BINARY TREE! HEAP!!


// 2.
//             A
//           / \
//          B     C
//         / \   / \
//       D   E  -  -

//     #   YES!!! YES HEAP !! BUT NOT FULL BINARY TREE!! BUT COMPLETE BINARY TREE!!
// 3.
//             A
//           / \
//          B     C
//         / \   / \
//       -   -  D  E

//     #   DEFINETLY NOTTTTTTTTTTTTTTTTTTTTT!!! HEAP SO NEITHER COMPLETE NOR FULL..........








// 3.HEAP..

//                          HEAP
//                           |
//                     --------------
//                     |            |
//                  { MAX }      { MIN }

//     {ANCESTER >> THAN CHILD}  {ANCESTER << THAN CHILD}

//             50         [ANCESTER]       10
//           /  \          /\            /  \
//          40   30        |           30    20     C
//         / \   / \       |          / \   / \
//       15  10 8  16    [CHILDS]   35  40  32  25








// 4.INSERT AND DELETE..

//IT'S A COMPLETE BINARY TREE SO .... SO SIMILAR TO HOW WE IMPLEMENTED BINARY TREE BUT THERE WE USE LINKEDLIST ANS HERE WE WILL GO WITH ARRAY/ARRAYLIST AS WE HAVE SPECIAL CASE!!!
//i.e WE HAVE TO MAINTAIN ORDER THAT IS HIGH IN FIRST LEVEL AND THEN SECOND LEVEL AND CONTINUE...

// LET'S CODE ... ALL IMPLEMENTATION....

//INSERT =>
//1. WE KNOW WE WILL INSERT AT LAST POSSIBLE END..
//2. THEN WE WILL ITERATE TILL MY INDEX IS NOT BECOME 1 i.e INDEX OF PEEK NODE !
//3. EVERY TIME WE WILL CHECK IF PARENT ADN MY INSERTED VAL IS GREATER OR NOT..IF YES THEN WAP AND CONTIUE THAT WHILE LOOP.. IF CONDn FAILS WE HAVE TO RETURN SO NO NEED TO CHECK TILL WHILE LOOP END AS WE HAVE CORRECT HEAP SO ATA ANY LEVEL IF CONDn FAILS THAT WILL FAILS AFTER WORD TOO....

//DELETE =>"DELETE PEEK ELEMENT HOGA... SO POP!!"
//1. ADD LAST ELEEMNT AT ROOT(TOP/PEEK) SO A[1] = A[N]..
//2. REMOVE LAST NODE!!!
//3. PROPAGATE ROOT NODE TO IT'S ORIGINAL NODE...

//
//package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
//
//class Heap{
//
//    int size;
////    int arr[]= new int[Integer.MAX_VALUE]; //Exception in thread "main" java.lang.OutOfMemoryError
//    int arr[]= new int[100];//safer side 100 leneka..
//    Heap(){
//        int size=0;
//        arr[0]=-1;
//    }
//
//
//    public void insert(int val){
//        size=size+1;
//        arr[size]=val;
//
//        int i=size;
//        while (i>1){
//            int parent = i/2;
//            if(arr[i]>arr[parent]){
//                int temp = arr[parent];
//                arr[parent] = arr[i];
//                arr[i]=temp;
//
//                i=parent;
//            }
//            else {
//                return;
//            }
//        }
//    }
//
//    public void delete(){
//        arr[1]=arr[size];
//        size=size-1;
//        int i=1;
//        while(i<size){
//            int left=2*i;
//            int right = 2*i+1;
//
//            if (left<size&&arr[i]<arr[left]){
//                int temp = arr[left];
//                arr[left] = arr[i];
//                arr[i]=temp;
//                i=left;
//            }
//            if (right<size && arr[i]<arr[right]){
//                int temp = arr[right];
//                arr[right] = arr[i];
//                arr[i]=temp;
//                i=right;
//
//            }
//            else {
//                return;
//            }
//        }
//    }
//
//    public void print() {
//        for (int i=1;i<=size;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//
//public class WELCOME_TO_HEAPS {
//    public static void main(String[] args) {
//        Heap h= new Heap();
//        h.insert(50);
//        h.insert(55);
//        h.insert(53);
//        h.insert(52);
//        h.insert(54);
//
//        h.print();
//        h.delete();
//        System.out.println();
//        h.print();
//
//    }
//}


//so NOTE=> IT'S NOT COMPALSORY WE WILL GET SORTED HEAP JUST EVERY LEVEL IS GREATER FROM NEXT LEVEL FOR MAX HEAP AND VICE VERSA FOR MIN HEADP....




// 5.HEAPIFY..
// SAME IT;S ALSO WAY OF CREATING HEAP BUT.............
// FROM LAST ELEMNT i>e FROM RIGHT AND GOES ON CHECKING ULTA
// AND ASK SAME QUESTION AT EACH 'h' IS IT MAKING HEAP IF YES GO UP AND OTHERWISE CHANE ACCORDINGLY!!!

//LET'S CODE...
//
//package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
//
//class Heap {
//
//    int size;
//    int arr[] = new int[100];
//
//    Heap() {
//        this.size = 0;
//        arr[0] = -1; // Dummy at index 0
//    }
//
//    public void maxHeapify(int arr[], int n, int i) {
//        int largest = i; //ASSUME MY ROOT IS LARGEST...
//        int left = 2 * i; // INDEX OF RIGHT FOR EACH ROOT NODE...
//        int right = 2 * i + 1; // INDEX OF LEFT FOR EACH ROOT NODE...
//
//        if (left <= n && arr[largest] < arr[left]) //JAB LEFT VALA BADA HAI THAN ROOT!
//            largest = left;
//        if (right <= n && arr[largest] < arr[right]) //JAB MERA RIGHT VALA ROOT SE BADA HAI..
//            largest = right;
//
//            // NOW MERE ME MAYBE KOI EK CONDITON TRUE HUI HOGIO YA BITH CONDITOPN TRUE HUI EHGI YA TOH DONO BHI FAIL HUIREHGI!!
//            // MY POINT IS NOT THAT KI CONDION FAIHI KI PASS MEKOHAR EK LEVEL ME LARGEST VALUE CHAYIE THAN THEIR LEFT AND RIGHT NODES!!
//            // AND THAT'S WHYA BITH CONDITION CHECK KIYE HAI BY USING 2 TIMES IF AS IF LEFT BADA HOG ATOH LEFT VALA ROOT HOGA BUT AGAIN RIGHT VALA USSSE BHI BADA HUA AS HAMN E LARGEST INDEX TOH HAR BAAR UODATE KIYA SO VAHA FIRSE PDATE HOGA AS RIGHT LEFT SE BHIBADA HAI!!
//
//              // SO NOW IF WE GOT THE LARGEST VAUE KI INDEX THEN WE WILL SWAP IT
//              NOW IT MAY POSSIBLE KI SORTED O/P NHI AAYEGA AS HUMNE SOME CASES ME LEFT VALE SE REPLACE KIYA THA BUT FIRSE RIGHT VALA BADA NIKLA TOH RIGHT SE REPLACE KIYA SO LEFT VALA APNI JAGH RAHEGA ABD THEN WHILE PRINTING VHO VAISE KI VASE AAYA EVEN IF VHO BADA THA SO SORTED NHI HAI !!!

//        if (largest != i) {
//            int temp = arr[largest];
//            arr[largest] = arr[i];
//            arr[i] = temp;
//            maxHeapify(arr, n, largest);
//        }
//    }
//
//    public void minHeapify(int arr[], int n, int i) {
//        int smallest = i;
//        int left = 2 * i;
//        int right = 2 * i + 1;
//
//        if (left <= n && arr[smallest] > arr[left])
//            smallest = left;
//        if (right <= n && arr[smallest] > arr[right])
//            smallest = right;
//
//        if (smallest != i) {
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//            minHeapify(arr, n, smallest);
//        }
//    }
//}
//
//public class WELCOME_TO_HEAPS {
//    public static void main(String[] args) {
//        Heap h = new Heap();
//        int maxArr[] = {-1, 55, 54, 53, 50, 52};
//        int minArr[] = {-1, 55, 54, 53, 50, 52};
//        int n = 5;
//
//        // Max Heap
//        for (int i = n / 2; i > 0; i--) {
//            h.maxHeapify(maxArr, n, i);
//        }
//        System.out.println("Max Heap:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(maxArr[i] + " ");
//        }
//        System.out.println();
//
//        // Min Heap
//        for (int i = n / 2; i > 0; i--) {
//            h.minHeapify(minArr, n, i);
//        }
//        System.out.println("Min Heap:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(minArr[i] + " ");
//        }
//    }
//}
//






// 6.HEAP SORT..
// SIMPLY PROCESS OF DELETION CARRIED IN SUCH MANNER SO THAT ,
// DELETED WILL BE STORED IN EMPTY SPACE AS ONE ELEMENT IS DELETE ,
// BUT IT IS NOT A PART OF HEAP SO.
// SUBSIQUENTLY WE GOES  ON DELITING AT FINALLY LAST ME COMPLETE SORTED MAP MILEGA
// CALLED AS HEAP SORT!!!!:)

// FOLLOW THAT ONE IMAGE :-C:\Users\Prathamesh\OneDrive\Pictures\Screenshot (1626).png





//LET'S CODE
//1. SWAP A[1] -> A[N]
//2. SIZE -- KARTE JAO TILL SIZE>1..
//3. ROOT NODE BRING TO CORRECT POSITION i.e HEAPIGY!!


//
//package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
//
//class Heap {
//
//    int size;
//    int arr[] = new int[100];
//
//    Heap() {
//        this.size = 0;
//        arr[0] = -1; // Dummy at index 0
//    }
//
//    public void maxHeapify(int arr[], int n, int i) {
//        int largest = i;
//        int left = 2 * i;
//        int right = 2 * i + 1;
//
//        if (left <= n && arr[largest] < arr[left])
//            largest = left;
//        if (right <= n && arr[largest] < arr[right])
//            largest = right;
//
//        if (largest != i) {
//            int temp = arr[largest];
//            arr[largest] = arr[i];
//            arr[i] = temp;
//            maxHeapify(arr, n, largest);
//        }
//    }
//    public void heapSort(int arr[],int n){
//        int size = n;
//
//        while (size>1){
////            step1
//            int temp = arr[size];
//            arr[size]=arr[1];
//            arr[1]=temp;
////            step2
//            size--;
////            step3
//            maxHeapify(arr,size,1);
//        }
//    }
//}
//
//public class WELCOME_TO_HEAPS {
//    public static void main(String[] args) {
//        Heap h = new Heap();
//        int maxArr[] = {-1, 55, 54, 53, 50, 52};
//        int n = 5;
//
//        // Max Heap
//        for (int i = n / 2; i > 0; i--) {
//            h.maxHeapify(maxArr, n, i);
//        }
//        System.out.println("Max Heap:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(maxArr[i] + " ");
//        }
//        h.heapSort(maxArr,n);
//        System.out.println();
//        System.out.println("Sorted MaxHeap:"); //last/peek me max!!
//        for (int i = 1; i <= n; i++) {
//            System.out.print(maxArr[i] + " ");
//        }
//    }
//}
//





//NOW MW BAR BAR BANTE NHI BETHUNGA SO ..

// 7.PRIORITY QUEUE..
//  TWO WAYS...
//                                 PRIORITY QUEUE
//                                       |
//                           ----------------------------
//                           |                          |
// SMALLER NO.S HIGHER PRIORITY                     LARGER NO.S HIGHER PRIORITY
// MIN HEAP !!                                      MAX HEAP !!

// SO WE CAN USE HEAP FOR IMPLEMENTING PRIORITY QUEUE!!

//LET'S CODE IT.....


// FOR MIN HEAP=>PRIORITY QUEUE=> DEFUALT MIN HEAP DEGA IN JAVA BUT FOR C++ REQUIRE TO REVERSE!!
// FOR MIN HEAP=>PRIORITY QUEUE=> REQUIRE TO USE ^COLLECTIONS^ REVERSEORDER FUNCTION .... BUT FOR C++ BYDEFAULT MAX HEPA DEGA!!


//
//package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
//
//import java.util.Collections;
//import java.util.PriorityQueue;
//
//public class WELCOME_TO_HEAPS{
//    public static void main(String[] args) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // it's not interface! it's class unlike Queue...
//        minHeap.add(1);
//        minHeap.add(45);
//        minHeap.add(34);
//        minHeap.add(89);
//        minHeap.add(67);
//        minHeap.add(58);
//        System.out.println("MIN HEAP =>");
//
//        while(!minHeap.isEmpty()){
//            System.out.println(minHeap.poll()); //seee peek pe smallest hota hai but not necessary it will bw soprted but level oreder will be maintain..!!
//        }
//
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // need to reverse!!
//        maxHeap.add(41);
//        maxHeap.add(45);
//        maxHeap.add(34);
//        maxHeap.add(89);
//        maxHeap.add(67);
//        maxHeap.add(58);
//
//        System.out.println("MAX HEAP =>");
//
//        while(!maxHeap.isEmpty()){
//            System.out.println(maxHeap.poll()); //seee peek pe larget hota hai but not necessary it will bw soprted but level oreder will be maintain..!!
//        }
//
//
//    }
//}
//


//NOTE => FOR IDENTIFICATION OF HEAP QUESTION=> YOU WILL BE GIVEN K AND YOU NEED SMALLEST OR LARGEST!!!
// SMALLEST = MAXHEAP!!(TOP PE MAX SO MEKO JITNE SMALEST CHAIYE UTNE ME LE LUNGA ..) AND LARGEST KELIYE MIN HEAP!!