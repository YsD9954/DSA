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
//public class XIII_QUICKSORT_IN_LL {
//
//    static void printLL(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    // Helper to get the last node of a list
//    static Node getTail(Node head) {
//        while (head != null && head.next != null) {
//            head = head.next;
//        }
//        return head;
//    }
//
//    // Partition the list and return pivot node
//    static Node[] partition(Node head, Node end) {
//        Node pivot = end;
//        Node prev = null, cur = head, tail = pivot;
//        Node newHead = null, newEnd = tail;
//
//        while (cur != pivot) {
//            if (cur.data < pivot.data) {
//                if (newHead == null) newHead = cur;
//                prev = cur;
//                cur = cur.next;
//            } else {
//                if (prev != null) prev.next = cur.next;
//                Node temp = cur.next;
//                cur.next = null;
//                tail.next = cur;
//                tail = cur;
//                cur = temp;
//            }
//        }
//
//        if (newHead == null) newHead = pivot;
//
//        return new Node[]{newHead, pivot, tail};
//    }
//
//    // The main quicksort recursive function
//    static Node quickSortRec(Node head, Node end) {
//        if (head == null || head == end)
//            return head;
//
//        Node[] partitioned = partition(head, end);
//        Node newHead = partitioned[0];
//        Node pivot = partitioned[1];
//        Node newEnd = partitioned[2];
//
//        // Sort left part
//        if (newHead != pivot) {
//            Node temp = newHead;
//            while (temp.next != pivot)
//                temp = temp.next;
//            temp.next = null;
//
//            newHead = quickSortRec(newHead, temp);
//
//            // Attach pivot back
//            temp = getTail(newHead);
//            temp.next = pivot;
//        }
//
//        // Sort right part
//        pivot.next = quickSortRec(pivot.next, newEnd);
//
//        return newHead;
//    }
//
//    static Node quickSort(Node head) {
//        Node tail = getTail(head);
//        return quickSortRec(head, tail);
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//
//        System.out.println("Original List:");
//        printLL(head);
//
//        head = quickSort(head);
//
//        System.out.println("Sorted List:");
//        printLL(head);
//    }
//}
