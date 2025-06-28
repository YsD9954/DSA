//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.Stack;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.*;
//
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
//    static Stack<Integer> s = new Stack<>();
//    BinaryTree() {
//        root = null;
//    }
//
////    DEDH SHANA WAY OF MIRROR - SAME O/P !!!   MAT KAR LAVDU...
//
//
////    static void mirror(Node root){
////        if(root==null){
////            return;
////        }
////        mirror(root.left);
//////        System.out.print(root.data+" "); ..no need to print as inorder thodi print karna hai,.
////        s.push(root.data);//extra hai bass itna..
////        mirror(root.right);
////
//////        abhi basss print kard0
////        while (!s.isEmpty()) {
////            System.out.print(s.peek()+" ");
////            s.pop();
////        }
////    }
//
////    ACTUAL MIRROR-RECURSION AND SWAPING CHILD ONLY
//
//    static void mirror(Node root) {
//        if (root == null){
//            return;
//        }
//        // mirror tje child
//        Node temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        //go to the next child at next level i.e left vale child ke childs and same right vale bhi
//        mirror(root.left);
//        mirror(root.right);
//    }
//    static void inorder(Node root){
//        if (root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//
//    }
//
//}
//
//public class VI_MIRROR_OF_TREE {
//    public static void main(String[] args) {
//
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        inorder(tree.root);
//        System.out.println();
//        mirror(tree.root);
//        System.out.println();
//        inorder(tree.root);
//
//        System.out.println();
//
//
//    }
//}
