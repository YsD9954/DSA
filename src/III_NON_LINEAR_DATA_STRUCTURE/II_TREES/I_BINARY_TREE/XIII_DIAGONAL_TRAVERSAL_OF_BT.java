//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.printDiagonal;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data){
//        this.data=data;
//        this.right= null;
//        this.left=null;
//    }
//}
//class BinaryTree {
//    Node root;
//
//    BinaryTree() {
//        root = null;
//    }
//
//    static void printDiagonal(Node root) {
//        Queue<Node> q = new LinkedList<>();
//        if (root != null) {
//            q.add(root);
//        }
//        while (!q.isEmpty()) {
//            Node curr = q.remove();
//            while (curr != null) {
//                System.out.print(curr.data + " ");
//                if (curr.left != null) {
//                    q.add(curr.left);
//                }
//                curr = curr.right;
//            }
//        }
//    }
//
//}
//
//public class XIII_DIAGONAL_TRAVERSAL_OF_BT {
//    public static void main(String[] args) {
//
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(8);
//        tree.root.left = new Node(3);
//        tree.root.right = new Node(10);
//        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(6);
//        tree.root.right.right = new Node(14);
//        tree.root.right.right.left = new Node(13);
//        tree.root.left.right.left = new Node(4);
//        tree.root.left.right.right = new Node(7);
//
//        printDiagonal(tree.root);
//
//
//    }
//}
//
//
////NOTE=>
////1.TAKE IT EASYMY BOIII..
////2.FIRST ADD ROOT TO QUEUE..
////3.THEN TAKE CURENT NODE AND THEN PUT QUEUE KA PEEK TO THAT AND PRINT ALL RIGHT VALUE..
////4. VERY IMPORTANT WHILE GOING TOWQRDS RIGHT CHECK THAT FOR EACH NODE(RIGHT VALE) IS THER LEFT NODE..
////5. SO IF THERE IS LEFT NODE THEN DIRECTLY ADD THEM IN QUEUE ..
////6.SO CONTIUE THIS LOOP TILL Q IS NOT EMPTY!!!