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
//    static void inorder(Node root,ArrayList<Integer> arrayList) {
//        if (root == null) return;
//        inorder(root.left,arrayList);
//        arrayList.add(root.data);
////        System.out.print(root.data + " ");
//        inorder(root.right,arrayList);
//    }
//}
//
//public class YOO_XXXII_BROTHER_FROM_DIFFERENT_ROOTS {
//    public static void main(String[] args) {
//        BinarySearchTree tree1 = new BinarySearchTree();
//        tree1.root = new Node(100);
//        tree1.root.left = new Node(50);
//        tree1.root.right = new Node(300);
//        tree1.root.left.left = new Node(20);
//        tree1.root.left.right = new Node(70);
//
//        BinarySearchTree tree2 = new BinarySearchTree();
//        tree2.root = new Node(10);
//        tree2.root.left = new Node(40);
//        tree2.root.right = new Node(120);
//
//        ArrayList<Integer> a = new ArrayList<>();
//        ArrayList<Integer> b = new ArrayList<>();
//
//        inorder(tree1.root,a); // yaha pe a me sab values mil jayenge..
//        inorder(tree2.root,b); //yaha same b me ...
//
//        int x=60;
//        int count=0;
//        for (int i=0;i<a.size();i++){
//            for (int j=0;j<b.size();j++){
//                if (a.get(i)+b.get(j)==x){
//                    count++;
//                    System.out.println(a.get(i)+","+b.get(j));
//                }
//            }
//        }
//
//        System.out.println("count = "+count);
//
//    }
//
//}
//
//
////NOTE=>
////SIRF QUEUE KARO THAT'S IT KHATAMM..
