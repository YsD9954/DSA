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
//public class VIII_ADD_1_TO_A_LINKED_LIST_NUMBER {
//    static void printLL(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//
//    static void add1(Node head){
//        Node temp = head;
//        int arr[] = new int[5];
//        int i=0;
//        while (temp!=null){
//            arr[i] = temp.data;
//            temp=temp.next;
//            i++;
//        }
//        int num=0;
//        for (int j=0;j<i;j++){
//            num=num*10+arr[j];
//
//        }
//        num=num+1;
//
//        String str = String.valueOf(num);
////        System.out.println(str);
//        temp=head;
//        int k=0;
//        while(temp!=null){
//            temp.data=(int)str.charAt(k)-'0'; ///********BHAI ASCIII VALUE DEG AAPNA JAVA ISLIYE HUM 0 SE SUBYTARXCK KARENGE SO APNE KO SO APNE KO FIRSE ORIGINAL NUMEBR SYSYEM SE O/P AAYEG ALIKE ASCII 48 IS ZERO SO..*********
////            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//            k++;
//        }
//        printLL(head);
//    }
//
//    public static void main(String[] args) {
//        Node node = new Node(1);
//        node.next = new Node(2);
//        node.next.next = new Node(3);
//        node.next.next.next = new Node(4);
//        node.next.next.next.next = new Node(5);
//        printLL(node);
//        System.out.println();
//        add1(node);
//
//    }
//}
//
//
//
