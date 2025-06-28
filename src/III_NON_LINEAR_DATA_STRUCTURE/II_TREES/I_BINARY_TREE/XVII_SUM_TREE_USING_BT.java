//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.*;
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
//    static int sumTree(Node root){
//        if (root==null){
//
//            return 0;
//        }
//        int leftSum=sumTree(root.left);
//        int rightSum= sumTree(root.right);
//        int oldval=root.data;
//        root.data=leftSum+rightSum;
//        return root.data+oldval;
//    }
//
//    static void inorder(Node root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//}
//
//public class XVII_SUM_TREE_USING_BT {
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
//        sumTree(tree.root);
//        inorder(tree.root);
//
//    }
//
//
//}
//
//
//
////NOTE=>
////1. CHECK LEFT => TILL NOT NULL GO TO LEFT!!!
////