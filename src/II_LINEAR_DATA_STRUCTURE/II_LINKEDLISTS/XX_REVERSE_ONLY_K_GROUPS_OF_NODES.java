//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//
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
//
//public class XX_REVERSE_ONLY_K_GROUPS_OF_NODES {
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
//    static DoublyNode reverseKNodes(DoublyNode head, int k) {
//        DoublyNode curr = head, prev = null, next = null;
//        int count = 0;
//
//        while (curr != null && count < k) {
//            next = curr.next;
//            curr.next = prev;
//            curr.prev = null;
//            if (prev != null) {
//                prev.prev = curr;
//            }
//            prev = curr;
//            curr = next;
//            count++;
//        }
//
//        return prev;
//    }
//
//    // Recursive function to reverse in groups of K
//    static DoublyNode reverseKGroup(DoublyNode head, int k) {
//        if (head == null) {
//            return head;
//        }
//
//        DoublyNode groupHead = null;
//        DoublyNode newHead = null;
//
//        // Move temp to the next group
//        DoublyNode temp = head;
//        int count = 0;
//        while (temp != null && count < k) {
//            temp = temp.next;
//            count++;
//        }
//
//        // Reverse the first K nodes
//        groupHead = reverseKNodes(head, k);
//
//        // Connect the reversed group with the next part
//        if (newHead == null) {
//            newHead = groupHead;
//        }
//
//        // Recursion for the next group
//        head.next = reverseKGroup(temp, k);
//        if (head.next != null) {
//            head.next.prev = head;
//        }
//
//        return newHead;
//    }
//    public static void main(String[] args) {
//        DoublyNode head = new DoublyNode(1);
//        head.next = new DoublyNode(2);
//        head.next.prev = head;
//        head.next.next = new DoublyNode(3);
//        head.next.next.prev = head.next;
//        head.next.next.next = new DoublyNode(4);
//        head.next.next.next.prev = head.next.next;
//        head.next.next.next.next = new DoublyNode(5);
//        head.next.next.next.next.prev = head.next.next.next;
//        head.next.next.next.next.next = new DoublyNode(6);
//        head.next.next.next.next.next.prev = head.next.next.next.next;
//        printDLL(head);
//        head = reverseKGroup(head, 3);
//        printDLL(head);
//
//
//    }
//}
//
//
