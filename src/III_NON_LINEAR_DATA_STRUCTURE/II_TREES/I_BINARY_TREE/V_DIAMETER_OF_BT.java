//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.diameter;
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.height;
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
//    static int height(Node root){
//        if(root==null){
//            return 0;
//        }
//        int left = height(root.left);
//        int right=height(root.right);
//        return Math.max(left,right)+1; //BECAUSE 0 BASED INDEXING..
//    }
//    static int diameter(Node root){
//        if (root==null){
//            return 0;
//        }
//        int leftdia=diameter(root.left);
//        int rightdia=diameter(root.right);
//        int currdia=height(root.left)+height(root.right);
//        return Math.max(currdia,Math.max(leftdia,rightdia));    //    meko tino ka max chayie Math.max(leftdia,rightdia,currdia); ----but max me 2 hi argument pass kar sakte hai is liye first 2 ka max liye and then uska max se 3 re ko max karvaya...
//
//    }
//
//}
//
//public class V_DIAMETER_OF_BT {
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
////        System.out.println(height(tree.root));
//        System.out.println(diameter(tree.root));
//
//
//
//    }
//}
//
//
////NOTE=>
////1. DEKHO HAMAR DIAMETER MATLAB DISTANCE BETWEEN 2 LEAF NODES HI HAI BUT THAT LEAF NODES MUST CREATE LONGEST PATH..
////2. NOW THAT DAIMETER MAY CONTAIN ROOT ELEMETN ..DIAMETER=> LEFT HEIGHT + RIGHT HEIGHT
////3 ROOT NAHI TOH PURE LEFT HI HOGA..DIAMETER=> RECURSIVE CALL OF LEFT NODES
////4.ELSE RIGHT ME HOGA!!!.. DIAMEER => RECURSIVE CALL OF RIGHT NODES
////5.SO FOR EACH CASE WE WILL FIND DIAMETER AND MAX OF 3 IS OUR DIAMETER..
//
////aaya na maajjjjjjjjjjaaaaaaaaa..BIDUUU..