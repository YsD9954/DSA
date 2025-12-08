//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
//
//import java.util.ArrayList;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE.BinarySearchTree.inorder;
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
//    static void inorder(Node root, ArrayList<Integer> arrayList) {
//        if (root == null) return;
//        inorder(root.left,arrayList);
//        arrayList.add(root.data);
////        System.out.print(root.data + " ");
//        inorder(root.right,arrayList);
//    }
//}
//
//public class YOO_XXXIII_COUNT_NODES_LIES_IN_RANGE {
//    public static void main(String[] args) {
//        BinarySearchTree tree1 = new BinarySearchTree();
//        tree1.root = new Node(100);
//        tree1.root.left = new Node(50);
//        tree1.root.right = new Node(300);
//        tree1.root.left.left = new Node(20);
//        tree1.root.left.right = new Node(70);
//
//        ArrayList<Integer> a = new ArrayList<>();
//
//        inorder(tree1.root,a); // yaha pe a me sab values mil jayenge..
//
//        int l=20;
//        int h =60;
//
//        int count=0;
//        for (int i=0;i<a.size();i++){
//
//            if (l<=a.get(i) && a.get(i)<=h){
//                count++;
//                System.out.println(a.get(i));
//
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
