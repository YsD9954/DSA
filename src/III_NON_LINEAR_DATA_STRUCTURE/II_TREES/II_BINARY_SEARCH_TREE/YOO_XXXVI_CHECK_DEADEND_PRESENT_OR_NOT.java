//
//
//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
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
//    static void leafNodes(Node root, ArrayList<Integer> a){
//        if (root==null){
//            return;
//        }
//        if (root.left==null && root.right==null){
//            a.add(root.data);
//        }
//        leafNodes(root.left,a);
//        leafNodes(root.right,a);
//    }
//    static void inorder(Node root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//}
//
//public class YOO_XXXVI_CHECK_DEADEND_PRESENT_OR_NOT {
//    public static void main(String[] args) {
//        int bst[] = {8, 7, 10, 2, 9, 13};
//        Node root = null;
//        for (int i=0;i<bst.length;i++){
//            root=insert(root,bst[i]);
//        }
//        inorder(root);
//
//        ArrayList <Integer> a = new ArrayList<>();
//        leafNodes(root,a);
//        System.out.println();
//        Boolean flag = false;
//        for (int i=0;i<a.size();i++){
//            int count=0;
//            for (int j=0;j<bst.length;j++){
//                if (a.get(i)+1==bst[j] || a.get(i)-1==bst[j]||a.get(i)-1==0){ //special condn fo r if leaf node is 1 so uske laeft zro nhi ja sakt aisluoiye..
//                    count++;
//                }
//            }
//            if (count>=2){
//                System.out.println(a.get(i));
//                flag = true;
//            }
//        }
//        System.out.println(flag);
//    }
//}
//
//
