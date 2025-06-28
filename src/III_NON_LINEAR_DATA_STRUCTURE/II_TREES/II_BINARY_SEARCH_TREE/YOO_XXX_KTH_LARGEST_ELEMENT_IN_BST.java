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
//    static Stack<Integer> s=new Stack<>();
//    static Stack inorderTraverse(Node root) {
//        if (root == null) return null;
//        inorderTraverse(root.left);
//        s.push(root.data);
////        System.out.print(root.data + " ");
//        inorderTraverse(root.right);
//
//        return s;
//    }
//}
//
//public class YOO_XXX_KTH_LARGEST_ELEMENT_IN_BST {
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
//        Stack<Integer> s = new Stack<>();
//        s = inorderTraverse(root);
//        int k =4;
//        if (k>s.size()){
//            System.out.println(k+ " is grater than BST Size!!");
//        }
//        else{
//            for (int i=1;i<k;i++){ //1 se shuru karna padega nhi toh k==1 fail hoga nad last me bhi null pointer aajayega
//                s.pop();
//            }
//            System.out.println(s.peek());
//        }
//        }
//
//}


//NOTE=>
//INORDER TRAVERSE=> STORE ALL IN STACK=>PEEL TILL COUNT IS NOT EQUAL TO K!!!