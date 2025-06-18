//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//
//
//
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class XV_SORT_O_1_2_IN_LL {
//    static void printLL(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static void sort_0_1_2(Node head){
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
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(2);
//        head.next = new Node(0);
//        head.next.next = new Node(1);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(0);
//
//
//        System.out.println("Original List:");
//        printLL(head);
//        System.out.println();
//        sort_0_1_2(head);
//    }
//}
