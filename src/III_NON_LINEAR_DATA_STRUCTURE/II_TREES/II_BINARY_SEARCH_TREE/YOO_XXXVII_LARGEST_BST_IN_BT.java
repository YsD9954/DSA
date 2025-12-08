//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
//
//import java.util.ArrayList;
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
//class BinaryTree {
//    static Node root;
//
//    BinaryTree() {
//        this.root = null;
//    }
//}
//
//class BinarySearchTree {
//    static Node root;
//
//    public BinarySearchTree() {
//        this.root = null;
//    }
//
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
//    static void inorder(Node root, ArrayList<Integer> a) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, a);
//        System.out.print(root.data + " ");
//        a.add(root.data);
//        inorder(root.right, a);
//    }
//}
//
//// Helper class for info during recursion
//class Info {
//    boolean isBST;
//    int size;
//    int min;
//    int max;
//
//    Info(boolean isBST, int size, int min, int max) {
//        this.isBST = isBST;
//        this.size = size;
//        this.min = min;
//        this.max = max;
//    }
//}
//
//public class YOO_XXXVII_LARGEST_BST_IN_BT {
//
//    static int maxSize = 0;
//
//    // Function to find largest BST in BT
//    static Info largestBST(Node root) {
//        if (root == null)
//            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//
//        Info left = largestBST(root.left);
//        Info right = largestBST(root.right);
//
//        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
//            int currSize = left.size + right.size + 1;
//            maxSize = Math.max(maxSize, currSize);
//            return new Info(true, currSize,
//                    Math.min(root.data, left.min),
//                    Math.max(root.data, right.max));
//        }
//
//        return new Info(false, 0, 0, 0);
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(6);
//        tree.root.left = new Node(7);
//        tree.root.right = new Node(3);
//        tree.root.right.left = new Node(2);
//        tree.root.right.right = new Node(4);
//        tree.root.left.right = new Node(1);
//
//        System.out.print("Inorder Traversal: ");
//        ArrayList<Integer> a = new ArrayList<>();
//        inorder(tree.root, a);
//        System.out.println();
//
//        largestBST(tree.root);
//        System.out.println("Size of largest BST in BT: " + maxSize);
//    }
//}
