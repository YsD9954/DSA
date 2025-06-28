//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinarySearchTree.*;
//
//class Node{
//    int data;
//    Node right;
//    Node left;
//    Node(int data){
//        this.data=data;
//        this.right = null;
//        this.left = null;
//    }
//
//}
//
//class BinaryTree{
//    static Node root;
//    BinaryTree(){
//        this.root=null;
//    }
//
//}
//
//
//class BinarySearchTree{
//    static Node root;
//    public BinarySearchTree(){
//        this.root=null;
//    }
//    static Node insert(Node root,int data){
//        if (root==null){
//            root=new Node(data);
//            return root;
//        }
//        else if (data<root.data){
//            root.left = insert(root.left,data);
//        }
//        else {
//            root.right = insert(root.right,data);
//        }
//        return root;
//
//    }
//
//    static Queue<Integer> queue = new LinkedList<>();
//
//    static Queue btElements(Node root){
//
//        if (root==null){
//            return null;
//        }
//        btElements(root.left);
//        queue.add(root.data);
////        System.out.println(root.data);
//        btElements(root.right);
//
//        return queue;
//    }
//
//    static void inorder(Node root){
//        if (root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//
//
//
//
//
//
//}
//public class YOO_XXVII_BT_TO_BST {
//    public static void main(String[] args) {
////        let's creaate firt our binarytree and then use..
//
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left=new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left=new Node(4);
//        tree.root.left.right=new Node(5);
//
//        Queue<Integer> q = new LinkedList<>();
//        q= btElements(tree.root);
//        Node root = null;
//
//        while (!q.isEmpty()){
//            root = insert(root,q.peek());
//            q.remove();
//        }
//        inorder(root);
//        System.out.println();
//
//    }
//}
//
//
