//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.next=null;
//
//    }
//
//}
//public class VII_MOVE_LAST_ELEMENT_TO_FRONT {
//    static void printLL(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//
//    static void moveLtoF(Node head){00
//        Node temp = head;
//        while (temp.next.next!=null){
//            temp=temp.next;
//        }
////        System.out.println(temp.data);
//        Node timepass = temp.next;
//        Node timepasshead=head;
//        temp.next = null;
//
//        head=timepass;
//        head.next=timepasshead;
//        printLL(head);
//
//
//
//    }
//    public static void main(String[] args) {
//        Node node = new Node(1);
//        node.next = new Node(2);
//        node.next.next = new Node(3);
//        node.next.next.next = new Node(4);
//        node.next.next.next.next = new Node(5);
//        printLL(node);
//        System.out.println();
//        moveLtoF(node);
//
//
//    }
//}
//
//
////NOte -
////1.kuch nhi sirf last element nikal do and then bas usko head se connect kardo and note second last vale ko null karo nahi toh infinite loop lagega bc..
