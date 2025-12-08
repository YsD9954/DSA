package II_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//import java.util.LinkedList;
//
//    class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//
//public class I_REVERSE_LINKEDLIST {
//        public static void printList(Node head){
//            Node temp = head;
//            while (temp!=null){
//                System.out.print(temp.data+"->");
//                temp=temp.next;
//            }
//            System.out.println("null");
//        }
//
//                            // METHOD I
////    public static Node reverseLL(Node head){
//////        1->2->3->4->5
//////        5->4->3->2->1
//////      1=>1
//////      1->2=>2->1
//////      1->2->3=>3->2->1
//////      1->2->3->4=>4->3->2->1
//////      1->2->3->4->5=>5->4->3->2->1
////
////
////
////        Node curr = head;
////        Node prev = null;
////        Node temp;
////        while (curr!=null){
////             temp= curr.next;
////
////            // Reverse current node's next pointer
////            curr.next = prev;
////
////            // Move pointers one position ahead
////            prev = curr;
////            curr = temp;
////        }
////        return prev;
////
////    }
//
////                              METHOD II
//    public static void reverseLLbyrecusion(Node head){
//
//            Node temp = head;
//            if (temp==null){
//                return;
//            }
//            reverseLLbyrecusion(head.next);
//             System.out.print(temp.data+"->");
//    }
//
//    public static void main(String[] args) {
//
//            Node head = new Node(1);
//            head.next = new Node(2);
//            head.next.next = new Node(3);
//            head.next.next.next = new Node(4);
//            head.next.next.next.next = new Node(5);
//
//            printList(head);
//
////            head = reversesLL(head);
////            printList(head);
//
//            reverseLLbyrecusion(head);
//            System.out.print("null");
//
//    }
//}
