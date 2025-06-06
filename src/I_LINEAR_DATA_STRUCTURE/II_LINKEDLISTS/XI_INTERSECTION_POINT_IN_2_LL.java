package I_LINEAR_DATA_STRUCTURE.II_LINKEDLISTS;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }

}
public class XI_INSERTION_POINT_IN_2_LL {
    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {

    }
}
