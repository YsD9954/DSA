//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import javax.crypto.spec.PSource;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinarySearchtree.*;
//
//
////BINARY TREE KA SEARCH o(N) WHERE N=HEIGHT !!
////BUT...BST=> log(n) WHERE n<N!!!
//
//
////SO, BINARY SEARCH TREE IS BINARY TREE!!!...BUT SPECIAL . AND SEARCH IS OPTIMIZED!!!
//
////BST=>A binary tree in which for each node,
////     all elements in its left subtree are less than the node,
////     and all elements in its right subtree are greater than the node.
////     and all subtree are also BST ...
////     NO DUPLICATES (EXPLICELTY BOLA HOGA TOH EXCEPTION BUT HUM MANKE CHALENGE NHI HOTA!!!)
//
//
////HUM HAMESHA INORDER TRAVESAL KARENGE SO THAT O/P HAMESHA SORTEDE AAYEGA AND IN INCREASING ORDER
//
//
////LET'S CODE ...
////1. INSERT
////2. SEARCH
////3. DELETE
//
//
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data){
//        this.data = data;
//        this.right= null;
//        this.left=null;
//    }
//}
//
//class BinarySearchtree{
//    static  Node root;
//
//    public BinarySearchtree(){
//        this.root=null;
//    }
//
//    public static void inorder(Node root) {
//        if (root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//
//    //1. INSERT
//
//    public static Node insertm(Node root,int data){
//        if (root==null){
//            root = new Node(data);
//            return root;
//        }
//        if (data<root.data){
//            root.left =insertm(root.left,data);
//
//        }
//        else {
//            root.right =insertm(root.right,data);
//
//        }
//        return root;
//    }
//
//    //2. SEARCH
//    public static Boolean search(Node root,int data){
//        if (root==null){
//            return false;
//        }
//        if (data==root.data){
//            return true;
//        }
//        if (data>root.data){
//            return search(root.right,data);
//        }
//        else {
//            return search(root.left,data);
//        }
//    }
//
//    static Node delete(Node root,int data){
//        if (root==null){
//            return null;
//        }
//        if (data>root.data){
//            root.right= delete(root.right,data);
//        }
//        if (data<root.data){
//            root.left= delete(root.left,data);
//        }
//        else {
////            case1 node is leaf..
//
//            if (root.left==null&&root.right==null){
//                return null;
//            }
////            case2
//            else if (root.right==null){
//                return root.left;
//            }
////            case3
//            Node IS = inorderSuccessor(root.right);
//            root.data = IS.data;
//            root.right=delete(root.right,IS.data);
//        }
//        return root;
//    }
//
//    public static Node inorderSuccessor(Node root){
//        while (root.left!=null){ //null ho hi nhi sakta ..
//            root=root.left;
//        }
//        return root;
//    }
//}
//
//
//public class YOO_WELCOM_TO_BST {
//    public static void main(String[] args) {
//        BinarySearchtree bst = new BinarySearchtree();
//        int arr[] = {1,2,5,4,6,3};
//        Node root=null;
//        for (int i=0;i<arr.length;i++){
//            root=insertm(root,arr[i]);
//        }
//        inorder(root);
//        System.out.println();
//        Boolean result = search(root,3);
//        if (result){
//            System.out.println("Found!");
//        }
//        else{
//            System.out.println("Not Found!");
//        }
//        System.out.println();
//
//        delete(root,4);
//        inorder(root);
//    }
//}