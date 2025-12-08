//package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;
//
//import java.util.Stack;
//
//import java.util.Stack;
//
//class Node {
//    int data;
//    Node left, right;
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class BinaryTree {
//    Node root;
//
//    void print(Node root) {
//        if (root == null) return;
//        System.out.print(root.data + " ");
//        print(root.left);
//        print(root.right);
//    }
//
//    void isHeap(Node root, boolean[] flag) {
//        if (root == null || !flag[0]) return;
//
//        if (root.left != null) {
//            if (root.data < root.left.data) flag[0] = false;
//            isHeap(root.left, flag);
//        }
//
//        if (root.right != null) {
//            if (root.data < root.right.data) flag[0] = false;
//            isHeap(root.right, flag);
//        }
//    }
//}
//
//public class XI_IS_BINARY_TREE_HEAP {
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        bt.root = new Node(10);
//        bt.root.left = new Node(6);
//        bt.root.right = new Node(8);
//        bt.root.left.left = new Node(4);
//        bt.root.left.right = new Node(5);
//        bt.root.right.left = new Node(-1);
//        bt.root.right.right = new Node(7);
//
//        bt.print(bt.root);
//        System.out.println();
//
//        boolean[] flag = new boolean[]{true};
//        bt.isHeap(bt.root, flag);
//
//        System.out.println("Is Max-Heap: " + flag[0]);
//    }
//}
//
////Note =>
////2 property must passed!
////1. complete binary tree!! that is last level me left se hi bharna hoga if full nhi hora hai toh!!!
////2. koi node uske child se chota nhi hoga assuming MAX HEAP!!!
