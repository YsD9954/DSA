//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
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
//}
//public class X_INTERSECTION_OF_2_LL {
//
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
//    static void intersection(Node head1, Node head2) {
//        Node temp1 = head1;
//        Node temp2 = head2;
//
//        int[] arr1 = new int[5];
//        int[] arr2 = new int[5];
//        int i = 0, j = 0;
//
//        while (temp1 != null && i < arr1.length) {
//            arr1[i++] = temp1.data;
//            temp1 = temp1.next;
//        }
//
//        while (temp2 != null && j < arr2.length) {
//            arr2[j++] = temp2.data;
//            temp2 = temp2.next;
//        }
//
//        Node temp = head1;
//        int count = 0;
//
//        for (int k = 0; k < i; k++) {
//            for (int l = 0; l < j; l++) {
//                if (arr1[k] == arr2[l]) {
//                    if (temp != null) {
//                        temp.data = arr1[k];
//                        temp = temp.next;
//                        count++;
//                        break;  // skip duplicates
//                    }
//                }
//            }
//        }
//
//        // Cut off remaining nodes beyond intersection
//        if (temp != null) temp.next = null;
//
//        // Print only the intersected part
//        temp = head1;
//        for (int p = 0; p < count; p++) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//    }
//
//    public static void main(String[] args) {
//        Node node = new Node(1);
//        node.next = new Node(3);
//        node.next.next = new Node(2);
//        node.next.next.next = new Node(4);
//        node.next.next.next.next = new Node(9);
//        Node node2 = new Node(5);
//        node2.next = new Node(4);
//        node2.next.next = new Node(3);
//        node2.next.next.next = new Node(2);
//        node2.next.next.next.next = new Node(7);
//        printLL(node);
//        System.out.println();
//        printLL(node2);
//        System.out.println();
//        intersection(node,node2);
//    }
//}
