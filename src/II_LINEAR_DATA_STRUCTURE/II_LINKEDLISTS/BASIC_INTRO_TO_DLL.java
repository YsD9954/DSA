//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
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
//public class BASIC_INTRO_TO_DLL {
//    static void printLL(DoublyNode head){
//        DoublyNode temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+"<=>");
//            temp=temp.next;
//        }
//        System.out.println("null");
//
//    }
//    static DoublyNode insertFront(DoublyNode head,DoublyNode node){
//        DoublyNode temp = head;//jarurat nahi hai temp ki but aadat se majbur hu.... beacuse head se hi kaam ho jayega..
//        if (temp==null){
//            return node;
//        }
//        node.next=head;
//        head.prev=node;
//        head=node;
//
//        return head;
//
//    }
//
//    static DoublyNode insertEnd(DoublyNode head,DoublyNode node){
//        DoublyNode temp = head;
//        if (temp==null){
//            return node;
//        }
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        node.prev=temp;
//        temp.next=node;
//        node.next=null;
//
//        return head;
//
//    }
//
//    static DoublyNode deleteFront(DoublyNode head){
//        DoublyNode temp = head;
//        if (temp==null){
//            return null;
//        }
//        head=temp.next;
//        head.prev=null;
//        temp.next=null;
//       return head;
//    }
//
//    static DoublyNode deleteEnd(DoublyNode head){
//        DoublyNode temp = head;
//        if (temp==null){
//            return null;
//        }
//        while (temp.next.next!=null){
//            temp=temp.next;
//        }
//        temp.next=null;
//
//        return head;
//
//    }
//
//
//    public static void main(String[] args) {
//        DoublyNode head = new DoublyNode(1);
//        head.next = new DoublyNode(2);
//        head.next.next = new DoublyNode(5);
//        head.next.next.next = new DoublyNode(8);
//        head.next.next.next.next=new DoublyNode(9);
//        printLL(head);
//        DoublyNode node = new DoublyNode(4);
//        head = insertFront(head,node);
//        printLL(head);
//        DoublyNode node2 = new DoublyNode(6);
//        head = insertEnd(head,node2);
//        printLL(head);
//        head = deleteFront(head);
//        printLL(head);
//        head = deleteEnd(head);
//        printLL(head);
//    }
//}
//
//
//
////Note=>
////1. insert aage se and pichese..
////2. delete aagese and pichese
