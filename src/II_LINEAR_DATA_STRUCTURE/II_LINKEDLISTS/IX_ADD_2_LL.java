//
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
//public class IX_ADD_2_LL {
//    static void printLL(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//
//    static void add(Node head,Node head2){
//        Node temp = head;
//        int arr[] = new int[5];
//        int i=0;
//        while (temp!=null){
//            arr[i] = temp.data;
//            temp=temp.next;
//            i++;
//        }
//        int num1=0;
//        for (int j=0;j<i;j++){
//            num1=num1*10+arr[j];
//
//        }
//        Node temp2 = head2;
//        int arr2[] = new int[5];
//        int l=0;
//        while (temp2!=null){
//            arr[l] = temp2.data;
//            temp2=temp2.next;
//            l++;
//        }
//        int num2=0;
//        for (int j=0;j<i;j++){
//            num2=num2*10+arr[j];
//
//        }
//        int num = num1+num2;
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
//
//
//    }
//
//    public static void main(String[] args) {
//        Node node = new Node(1);
//        node.next = new Node(2);
//        node.next.next = new Node(3);
//        Node node2 = new Node(4);
//        node2.next = new Node(5);
//        node2.next.next = new Node(6);
//
//
//        printLL(node);
//        System.out.println();
//        printLL(node2);
//        System.out.println();
//        add(node,node2);
//
//    }
//}
//
//
//
