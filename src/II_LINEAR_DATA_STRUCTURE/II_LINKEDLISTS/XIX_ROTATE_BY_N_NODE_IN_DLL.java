//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//import java.sql.SQLOutput;
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
//
//public class XIX_ROTATE_BY_N_NODE_IN_DLL {
//
//    static void printDLL(DoublyNode head){
//        DoublyNode temp = head;
//        if (temp==null){
//            System.out.println("null");
//        }
//        while (temp!=null){
//            System.out.print(temp.data+"<=>");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static void rotateNDLL(DoublyNode head,int N){//COUNTER CLOCKWISE HAI YAAD RAKHO..
//        DoublyNode temp = head;
//        int count=1;
//        while (temp.next!=null){
//            count++;
//            temp=temp.next;
//        }
//        DoublyNode tail=temp;
////        System.out.println(tail.data);
//        if (N>count){
//            N=N%count;
//        }
////        System.out.println(count);
////        System.out.println(N);
//        temp = head;
//        for (int i=0;i<N-1;i++){ // INTENTIONALY ME N-1 TAK GAYA BECAUSE THEN MEKO NODE TUNEKO NHI HO RAHE THE..
//            temp=temp.next;
//        }
//        tail.next=head;
//        head=temp.next;
//        temp.next=null;
//        head.prev=null;//AA...AAAAAAAA...AAAAAAAAAAAAHAHAHAHA....MAAAAAAAAAAAAARRRRRRRRIIIIII!!!!!
//        DoublyNode temp2=head;
//        while(temp2!=null){
//            System.out.print(temp2.data+"<=>");
//            temp2=temp2.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args) {
//        DoublyNode head = new DoublyNode(1);
//        head.next=new DoublyNode(2);
//        head.next.prev=head;
//        head.next.next=new DoublyNode(3);
//        head.next.next.next=new DoublyNode(4);
//        head.next.next.next.next=new DoublyNode(5);
//        printDLL(head);
//        rotateNDLL(head,3);
//
//    }
//}
//
//
