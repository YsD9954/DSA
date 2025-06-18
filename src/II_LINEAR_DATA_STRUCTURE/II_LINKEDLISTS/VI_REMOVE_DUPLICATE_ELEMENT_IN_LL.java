//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//class Node {
//    int data;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class VI_REMOVE_DUPLICATE_ELEMENT_IN_LL {
//
//    static void printLL(Node head) {
//        // Step 1: Count size
//        int size = 0;
//        Node temp = head;
//        while (temp != null) {
//            size++;
//            temp = temp.next;
//        }
//
//        // Step 2: Store values in array
//        int[] arr = new int[size];
//        temp = head;
//        int i = 0;
//        while (temp != null) {
//            arr[i++] = temp.data;
//            temp = temp.next;
//        }
//
//        // Step 3: Find duplicates using array
//        boolean[] isDuplicate = new boolean[size];
//        for (i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] == arr[j]) {
//                    isDuplicate[j] = true;  // mark duplicate
//                }
//            }
//        }
//
//        // Step 4: Remove duplicate nodes from LinkedList
//        Node dummy = new Node(-1);
//        dummy.next = head;
//        Node prev = dummy;
//        temp = head;
//        i = 0;
//        while (temp != null) {
//            if (isDuplicate[i]) {
//                prev.next = temp.next;  // remove
//            } else {
//                prev = temp;
//            }
//            temp = temp.next;
//            i++;
//        }
//
//        // Step 5: Print updated list
//        temp = dummy.next;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(3);
//        printLL(head);
//    }
//}
