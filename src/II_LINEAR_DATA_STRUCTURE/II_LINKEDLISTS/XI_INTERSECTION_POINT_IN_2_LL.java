//package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;
//
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//
//    }
//
//
//}
//public class XI_INTERSECTION_POINT_IN_2_LL {
//    static void printLL(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//
//        }
//        System.out.print("null");
//    }
//
//    static int getLength(Node head) {
//        int count = 0;
//        while (head != null) {
//            count++;
//            head = head.next;
//        }
//        return count;
//    }
//    static void pointOfIntersection(Node head1,Node head2){
//        int len1 = getLength(head1);
//        int len2 = getLength(head2);
//
//        int diff = Math.abs(len1 - len2);
//
//        Node longer = len1 > len2 ? head1 : head2;
//        Node shorter = len1 > len2 ? head2 : head1;
//
//        // Advance longer list by the difference in length
//        for (int i = 0; i < diff; i++) {
//            longer = longer.next;
//        }
//
//        // Traverse both together and find the intersection point
//        while (longer != null && shorter != null) {
//            if (longer == shorter) {
//                System.out.println("Intersection at node with data: " + longer.data);
//                return;
//            }
//            longer = longer.next;
//            shorter = shorter.next;
//        }
//
//        System.out.println("No intersection found.");
//
//    }
//    public static void main(String[] args) {
//        Node node1 = new Node(4);
//        node1.next = new Node(1);
//        node1.next.next = new Node(8);
//        node1.next.next.next = new Node(4);
//        node1.next.next.next.next = new Node(5);
//
//        Node node2 = new Node(5);
//        node2.next = new Node(6);
//        node2.next.next = new Node(1);
//        node2.next.next.next = new Node(8);
//        node2.next.next.next.next = new Node(4);
//        node2.next.next.next.next.next = new Node(5);
//
//        pointOfIntersection(node1,node2);
//    }
//}
