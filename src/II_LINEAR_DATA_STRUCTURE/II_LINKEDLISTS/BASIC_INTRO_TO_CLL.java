//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//
//class Node {
//    int data;
//    Node next;
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//public class BASIC_INTRO_TO_CLL {
//    static void printLL(Node head){
//        System.out.print(head.data+"->");
//        Node temp= head.next;
//        while (temp!=head){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println(head.data);
//    }
//
//    static Node insertAtStart(Node head, Node node){
//        if (head == null){
//            node.next = node; // single node points to itself
//            return node;
//        } else {
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next; // find last node
//            }
//            temp.next = node;     // last node -> new node
//            node.next = head;     // new node -> old head
//            head = node;
//            return head;          // new head
//        }
//    }
//    static Node insertAtLast(Node head, Node node){
//        if (head == null){
//            node.next = node; // single node points to itself
//            return node;
//        } else {
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next; // find last node
//            }
//            temp.next = node;     // last node -> new node
//            node.next = head;     // new node -> old head
//            return head;          // original head ko no changve!!
//        }
//    }
//
//    static Node deleteAtStart(Node head){
//        if (head.next == null){
//            head=null;
//            return head;
//
//        } else {
//            Node temp = head;
//
//            while (temp.next != head) {
//                temp = temp.next; // find last node
//            }
//            temp.next= head.next;     // last node -> new node
//            head=head.next;     // new node -> old head
//
//            return head;          // new head
//        }
//    }
//    static Node deleteAtEnd(Node head){
//        if (head.next == null){
//            head=null;
//            return head;
//
//        } else {
//            Node temp = head;
//
//            while (temp.next.next != head) {
//                temp = temp.next; // find last node
//            }
//            temp.next= head;      // last node -> new node
//            return head;          // new head
//        }
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next=head;
//        printLL(head);
//        Node node = new Node(6);
//        head=insertAtStart(head,node);
//        printLL(head);
//        Node node2 = new Node(8);
//        head=insertAtLast(head,node2);
//        printLL(head);
//        head=deleteAtStart(head);
//        printLL(head);
//        head=deleteAtEnd(head);
//        printLL(head);
//
//    }
//}
//
//
//
////OPERATIONS=>>
////1.INSERT -> START AND END
////2.DELETE ->START AND END