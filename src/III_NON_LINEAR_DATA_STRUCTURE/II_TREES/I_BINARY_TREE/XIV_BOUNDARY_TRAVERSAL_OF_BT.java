//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.Stack;
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
//    static void printLeafNodes(Node root){
//
//        if (root == null) return;  // base case
//
//        if (root.right == null && root.left==null) {
//            System.out.print(root.data+" ");
//            return;
//        }
//
////        System.out.println("=>"+root.data);
//        printLeafNodes(root.left);
//        printLeafNodes(root.right);
//
//
//
//
//
//    }
//
//    static void printDiagonal(Node root) {
//        if (root == null) return;
//
//        // Print root
//        System.out.print(root.data + " ");
//
//        // 1. Print left boundary (excluding leaves)
//        Node curr = root.left;
//        while (curr != null) {
//            if (curr.left != null || curr.right != null)  // not a leaf
//                System.out.print(curr.data + " ");
//            if (curr.left != null)
//                curr = curr.left;
//            else
//                curr = curr.right;
//        }
//
//        // 2. Print leaf nodes
//        printLeafNodes(root);
//
//        // 3. Print right boundary in reverse (excluding leaves)
//        curr = root.right;
//        Stack<Integer> stack = new Stack<>();
//        while (curr != null) {
//            if (curr.left != null || curr.right != null)  // not a leaf
//                stack.push(curr.data);
//            if (curr.right != null)
//                curr = curr.right;
//            else
//                curr = curr.left;
//        }
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//
//        System.out.println();
//    }
//
//}
//
//public class XIV_BOUNDARY_TRAVERSAL_OF_BT {
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
//        System.out.println();
//
//    }
//}
//
//
////NOTE=> BOUNDARY MATLAB => ALL LEFT(NOT LEAF) + LEAF+ALL RIGHT(NOT LEAF)
////1. ALL LEFT BY GOING TO LEFT TILL LEFT IS NOT NULL!!!! BUT ADD CONDITION OF NOT LEAF!!
////2. PRINT ALL LEAF NODES!!
////3.REVERSE (BY STACK) ALL RIGHT BY GOING TO RIGHT TILL RIGHT IS NOT NULL!!! BUT ADD CONDITION OF NOT LEAF!!!
