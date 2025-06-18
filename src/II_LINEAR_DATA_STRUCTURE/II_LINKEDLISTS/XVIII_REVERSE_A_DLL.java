//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//
//class DoublyNode{
//    int data;
//    DoublyNode next;
//    DoublyNode prev;
//
//    public DoublyNode(int data){
//        this.data=data;
//        this.next = null;
//        this.prev=null;
//    }
//}
//
//public class XVIII_REVERSE_A_DLL{
//    static void printLL(DoublyNode head){
//        DoublyNode temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+"<=>");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static void reverseDLL(DoublyNode head){
//        DoublyNode temp = head;
//        if (temp==null){
//            return;
//        }
//        reverseDLL(temp.next);
//        System.out.print(temp.data+"<=>");
//
//
//
//
//    }
//
//
//
//
//    public static void main(String[] args) {
//        DoublyNode head = new DoublyNode(1);
//        head.next = new DoublyNode(2);
//        head.next.prev = head;
//        head.next.next = new DoublyNode(5);
//        head.next.next.next = new DoublyNode(8);
//        head.next.next.next.next=new DoublyNode(9);
//        printLL(head);
//        reverseDLL(head);
//        System.out.println("null");
//
//    }
//}
//
//
