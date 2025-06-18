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
//public class IV_REMOVE_LOOP_IN_LL {
//
//    public static void printList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//    public static Node reverseInGroups(Node head, int k) {
//        if (head == null) return null;
//        Node prev = null;
//        Node curr = head;
//        Node next = null;
//        int count = 0;
//
//        // Reverse first k nodes
//        while (curr != null && count < k) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            count++;
//        }
//
//        // Recursively call for the remaining list
//        if (next != null) {
//            head.next = reverseInGroups(next, k);
//        }
//
//        // Return new head of this reversed group
//        return prev;
//    }
//
//    public static void main(String[] args) {
//
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//
//        int pos=2;
//
//        System.out.println("Original List:");
//        printList(head);
//        if (pos!=0){
//            head.next.next.next.next.next = null;
//            System.out.println("lOOP REMOVED!");
//
//        }
//        else{
//            System.out.println("NO LOOP WAS THERE!");
//
//        }
//
//    }
//}
