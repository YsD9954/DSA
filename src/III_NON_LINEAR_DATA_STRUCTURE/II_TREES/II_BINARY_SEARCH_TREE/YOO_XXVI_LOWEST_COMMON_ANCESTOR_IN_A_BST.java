//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
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
//class BinarySearchTree{
//    static Node root;
//    BinarySearchTree(){
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
//    static Node LCA(Node root, int n1, int  n2) {
//        if (root == null) return null;
//
//        if (n1<root.data && n2<root.data ) {
//            return LCA(root.left, n1, n2);
//        } else if (n1>root.data && n2>root.data) {
//            return LCA(root.right, n1, n2);
//        } else {
//            return root; // This is the split point
//        }
//    }
//
//
//
//}
//public class YOO_XXVI_LOWEST_COMMON_ANCESTOR_IN_A_BST {
//    public static void main(String[] args) {
//        int bst[] = {10, 5, 1, 7, 40, 50};
////        let's creaate firt our bst and then use..
//
//        Node root=null;
//        for(int i=0;i<bst.length;i++){
//            root=insert(root,bst[i]);
//        }
//
//
//        inorder(root);
//        System.out.println();
//
//        Node r = LCA(root,7,5);
//
//        System.out.println("LCA: "+r.data);
//
//
//
//    }
//}
//
//
