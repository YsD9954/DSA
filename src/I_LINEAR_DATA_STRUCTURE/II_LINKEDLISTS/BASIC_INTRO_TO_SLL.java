//
//
////1->2->3
//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data=data;
//        this.next =null;
//    }
//
//
//}
//public class BASIC_INTRO {
//
//     static void printLL(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//
//        }
//         System.out.println("null");
//    }
//    static void reverse(Node head){
//         Node temp = head;
//         if(temp==null){
//             return;
//         }
//
//         else {
//             reverse(temp.next);
//             System.out.print(temp.data+ " -> ");
//         }
//
//    }
//    static void detectLoop(Node head){ // ithink sorted haki toh loop hai else nahi..
//         Node temp = head;
//         int arr[]= new int[5];
//
//         while (temp!=null){
//
//
//         }
//    }
//
//    public static void main(String[]args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        printLL(head);
//        reverse(head);
//        System.out.print("null");
//
//
//
//    }
//}