//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.height;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//// BinaryTree class for managing the tree
//class BinaryTree {
//    Node root;
//
//    BinaryTree() {
//        root = null;
//    }
//
//    public static int height(Node root){
//        if(root==null){
//            return 0;
//        }
//        int left = height(root.left);
//        int right=height(root.right);
//        return Math.max(right,left)+1;
//    }
//}
//
//public class III_HEIGHT_OF_TREE {
//    public static void main(String[] args) {
//
//        // Creating the tree manually:
//        //         1
//        //       /   \
//        //     2       3
//        //   /   \
//        //  4     5
//
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        System.out.println(height(tree.root));
//
//    }
//}
