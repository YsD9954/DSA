package II_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;//
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
//public class BASIC_INTRO_TO_SLL {
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


import java.util.LinkedList;

class Node{
    String  data;
    Node next;
    Node(String  data){
        this.data=data;
        this.next = null;
    }

}

public class BASIC_INTRO_TO_SLL {
    static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    static Node add(Node head,String  data){
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(data);
//        temp.next.data=data;
//        System.out.println(temp.data);
        return head;
    }
    static Node del(Node head,String  data){
        Node temp = head;
        while (temp.next.data!=data){
            temp=temp.next;
        }
        Node curr = temp.next;

        temp.next=temp.next.next;
        curr.next=null;
//        temp.next = new Node(data);
//        temp.next.data=data;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node("yash");
        head.next = new Node("shank");
        head.next.next = new Node("smit");
        head.next.next.next =new Node("varun");
        head.next.next.next.next =new Node("rujul");

        print(head);
        System.out.println("null");
        add(head,"rahul");
        print(head);
        System.out.println("null");
        del(head,"varun");
        print(head);
        System.out.println("null");


    }
}