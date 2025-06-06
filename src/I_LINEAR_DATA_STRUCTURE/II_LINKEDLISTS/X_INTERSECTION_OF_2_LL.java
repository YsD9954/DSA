package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }

}
public class X_INSERTION_OF_2_LL {

    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        Node node2 = new Node(5);
        node2.next = new Node(4);
        node2.next.next = new Node(3);
        node2.next.next.next = new Node(2);
        printLL(node);
        System.out.println();
        printLL(node2);
    }
}
