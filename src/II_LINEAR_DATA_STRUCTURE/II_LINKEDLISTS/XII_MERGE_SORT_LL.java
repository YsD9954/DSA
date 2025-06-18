//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//
//    }
//
//
//}
//public class XII_MERGE_SORT_LL {
//    static void printLL(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//
//        }
//        System.out.print("null");
//    }
//
//    static void mergeSort(Node head){
//        Node temp = head;
//        int arr[] = new int[5];
//        int i=0;
//        while(temp!=null){
//            arr[i]=temp.data;
//            i++;
//            temp=temp.next;
//
//        }
//        for (int j = 0; j < i - 1; j++) {
//            for (int k = j + 1; k < i; k++) {
//                if (arr[j] > arr[k]) {
//                    int t = arr[j];
//                    arr[j] = arr[k];
//                    arr[k] = t;
//                }
//            }
//        }
//
//        temp=head;
//        for (int y=0;y<i;y++){
//            temp.data=arr[y];
//            temp=temp.next;
//        }
//        printLL(head);
//
//    }
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//        printLL(head);
//        System.out.println();
//        mergeSort(head);
//    }
//}









//ye toh apan ne kiya ...but SALA ye toh selection sort hai...
//ye lo MERGESORT..

//
//
//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//
//    }
//
//
//}
//public class XII_MERGE_SORT_LL {
//    static void printLL(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//
//        }
//        System.out.print("null");
//    }
//
//    static void mergeSort(Node head){
//        Node temp = head;
//        int arr[] = new int[5];
//        int i=0;
//        while(temp!=null){
//            arr[i]=temp.data;
//            i++;
//            temp=temp.next;
//
//        }
//        for (int j = 0; j < i - 1; j++) {
//            for (int k = j + 1; k < i; k++) {
//                if (arr[j] > arr[k]) {
//                    int t = arr[j];
//                    arr[j] = arr[k];
//                    arr[k] = t;
//                }
//            }
//        }
//
//        temp=head;
//        for (int y=0;y<i;y++){
//            temp.data=arr[y];
//            temp=temp.next;
//        }
//        printLL(head);
//
//    }
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//        printLL(head);
//        System.out.println();
//        mergeSort(head);
//    }
//}
