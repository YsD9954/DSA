//
//
//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.printRighttView;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right = null;
//    }
//
//}
//class BinaryTree{
//
//    Node root;
//
//    public BinaryTree(){
//        root=null;
//    }
//
//    static void printRighttView(Node root) {
//        if (root == null) return;
//
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            int size = q.size();  // Number of nodes at current level
//
//            for (int i = 0; i < size; i++) {
//                Node curr = q.poll();
//
//                // First node of this level
//                if (i == size-1) {
//                    System.out.print(curr.data + " ");
//                }
//
//                // Add children to queue
//                if (curr.left != null) q.add(curr.left);
//                if (curr.right != null) q.add(curr.right);
//            }
//        }
//    }
//
//
//
//}
//
//public class VIII_RIGHT_VIEW_OF_BT {
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        printRighttView(tree.root);
//    }
//}
