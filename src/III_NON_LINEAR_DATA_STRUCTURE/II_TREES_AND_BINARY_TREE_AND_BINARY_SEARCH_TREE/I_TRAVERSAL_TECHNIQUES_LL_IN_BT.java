//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.LinkedList;
//import java.util.Queue;
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.*;
//class Node{
//    int data;
//    Node left;
//
//    Node right;
//
//    Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right=null;
//
//    }
//}
//
//class BinaryTree {
//
//    //1. Build Tree from given Preorder Sequence(HUM BINA SEQUENCE KE BHI BANA SAKTE HAI BASS NODES BANAKE UNKO LINKED KARNA PADEGA..)
//
//    static int idx=-1;
//    public static Node buildTree(int[] nodes){
//        idx++;
//        if (nodes[idx]==-1){
//            return null;
//        }
//
//        Node newNode = new Node(nodes[idx]);
//        newNode.left=buildTree(nodes);
//        newNode.right=buildTree(nodes);
//
//        return newNode;
//    }
//
//
////  2.  Tree Traversals-PREORDER!
////    ROOT+LEFT+RIGHT
//
//    public static void preorder(Node root) {
//
//        if (root==null){
//            System.out.print(-1+" ");
//            return;
//        }
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//
//    }
//
//
////  3.  Tree Traversals-INORDER!
////    LEFT+ROOT+RIGHT
//
//    public static void inorder(Node root) {
//
//        if (root==null){
//            System.out.print(-1+" ");
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//
//    }
//
//
//
//
//
////  4.  Tree Traversals-POSTORDER!
////    LEFT+RIGHT+ROOT
//
//    public static void postorder(Node root) {
//
//        if (root==null){
//            System.out.print(-1+" ");
//            return;
//        }
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//
//
//    }
//
//
//
////  5.  Tree Traversals-LEVELORDER!
////    ROOT
////    LEFT
////    RIGHT
//
//    public static void levelorder(Node root) {
//
//        if (root==null){
//            System.out.print(-1+" ");
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (!q.isEmpty()){
//            Node curr = q.remove();
//
//            if (curr==null){
//                System.out.println();
//                if (q.isEmpty()){//tree khatm!!
//                    break;
//                }
//                else { //ek level khatam hui hai bass ...
//                    q.add(null);
//                }
//            }
//            else {
//                System.out.print(curr.data+" ");
//                if (curr.left!=null){ //left hai toh left add kar!!
//                    q.add(curr.left);
//                }
//                if (curr.right!=null){//right hai toh right add ker!!
//                    q.add(curr.right);
//                }
//
//            }
//
//        }
//
//    }
//
//}
//
//public class TRAVERSAL_TECHNIQUES_LL_IN_BT {
//
//
//    public static void main(String[] args) {
//
//        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree tree = new BinaryTree();
//
//        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        preorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        levelorder(root);
//    }
//}
//
