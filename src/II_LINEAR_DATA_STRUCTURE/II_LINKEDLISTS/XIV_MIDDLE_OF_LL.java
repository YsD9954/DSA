//
//
//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
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
//public class XIV_MIDDLE_OF_LL {
//
//    static void printLL(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static void middle(Node head){
//        Node temp = head;
//        int count = 0;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
////        System.out.println(count);
//        temp=head;
//
//        for (int i=0;i<Math.ceil(count/2);i++){
//            temp=temp.next;
//        }
//        System.out.println("Middle Element :- "+temp.data);
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//
//
//        System.out.println("Original List:");
//        printLL(head);
//        middle(head);
//
//    }
//}
