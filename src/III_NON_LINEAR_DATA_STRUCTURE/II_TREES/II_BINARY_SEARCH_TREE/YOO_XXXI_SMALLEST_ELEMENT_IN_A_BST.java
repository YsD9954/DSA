//
//
//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinarySearchTree.*;
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
//    Node root;
//
//    public BinarySearchTree() {
//        this.root = null;
//    }
//
//    static Node insert(Node root, int data){
//        if (root==null){
//            root=new Node(data);
//            return root;
//        }
//        if (data<root.data){
//            root.left = insert(root.left,data);
//        }
//        else {
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//    static void inorder(Node root) {
//        if (root == null) return;
//        inorder(root.left);
//
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//
//    static Queue<Integer> q=new LinkedList<>();
//    static Queue inorderTraverse(Node root) {
//        if (root == null) return null;
//        inorderTraverse(root.left);
//        q.add(root.data);
////        System.out.print(root.data + " ");
//        inorderTraverse(root.right);
//
//        return q;
//    }
//}
//
//public class YOO_XXXI_SMALLEST_ELEMENT_IN_A_BST {
//    public static void main(String[] args) {
//        int bst[] = {1,2,3,6,5,4};
//        Node root = null;
//        for (int i=0;i<bst.length;i++){
//            root = insert(root,bst[i]);
//
//        }
//        inorder(root);
//        System.out.println();
//
//
//
//        Queue<Integer> q = new LinkedList<>();
//        q = inorderTraverse(root);
//        int k =2;
//        if (k>q.size()){
//            System.out.println(k+ " is grater than BST Size!!");
//        }
//        else{
//            for (int i=1;i<k;i++){ //1 se shuru karna padega nhi toh k==1 fail hoga nad last me bhi null pointer aajayega
//                q.remove();
//            }
//            System.out.println(q.peek());
//        }
//    }
//
//}
//
//
////NOTE=>
////SIRF QUEUE KARO THAT'S IT KHATAMM..
