//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE.BinarySearchTree.*;
//
//class Node {
//    int data;
//    Node right;
//    Node left;
//
//    Node(int data) {
//        this.data = data;
//        this.right = null;
//        this.left = null;
//    }
//}
//
//class BinarySearchTree {
//    static Node root;
//
//    BinarySearchTree() {
//        this.root = null;
//    }
//
//    // Normal BST insert (used in original version, not used now)
//    static Node insert(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        } else if (data < root.data) {
//            root.left = insert(root.left, data);
//        } else {
//            root.right = insert(root.right, data);
//        }
//        return root;
//    }
//
//
//    static void preorder(Node root) {
//        if (root == null) return;
//        System.out.print(root.data + " ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//}
//
//public class YOO_XXXV_PREORDER_TO_BST {
//    public static void main(String[] args) {
//        int bst[] = {40,30,35,80,100};
//        Node root = null;
//        for (int i=0;i<bst.length;i++){
//            root=insert(root,bst[i]);
//        }
//        preorder(root);
//
//    }
//}
//
//
