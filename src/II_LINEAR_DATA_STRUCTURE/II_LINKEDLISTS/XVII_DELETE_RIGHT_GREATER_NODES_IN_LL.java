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
//public class XVII_DELETE_RIGHT_GREATER_NODES_IN_LL {
//
//    static void printLL(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static Node deleteRightGreater(Node head) {
//        // Step 1: Store values from LL into array
//        int[] arr = new int[100]; // Assuming max 100 nodes
//        int n = 0;
//        Node temp = head;
//
//        while (temp != null) {
//            arr[n++] = temp.data;
//            temp = temp.next;
//        }
//
//        // Step 2: Filter array from right side
//        int[] res = new int[n];
//        int index = 0;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = n - 1; i >= 0; i--) {
//            if (arr[i] >= max) {
//                res[index++] = arr[i];
//                max = arr[i];
//            }
//        }
//
//        // Step 3: Create new LL from filtered result (reverse it back)
//        Node newHead = null;
//        for (int i = index - 1; i >= 0; i--) {
//            Node newNode = new Node(res[i]);
//            newNode.next = newHead;
//            newHead = newNode;
//        }
//
//        return newHead;
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//
//        System.out.println("Original Linked List:");
//        printLL(head);
//
//        Node newHead = deleteRightGreater(head);
//
//        System.out.println("After deleting nodes with greater value on the right:");
//        printLL(newHead);
//    }
//}
