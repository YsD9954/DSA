//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
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
//    static Node successor(Node root,int key){
//        Node successor = null;
//        while (root!=null){ //jab tak khatam nhi hora...i.e koi leaf nhi aata tab tak
//            if (key<root.data){ //if mera node key se jyada  hai
//                successor=root;
//                root=root.left; //mera succssor toh hai but meko aur kam dekhna chayie...
//            }
//            else{
//                root=root.right; //if mera node key se kqm hai toh right me jaoand check usse bada
//            }
//        }
//
//        return successor;
//    }
//
//
//
//}
//public class YOO_XXV_INORDER_SUCCESSOR_ALL_NODES {
//    public static void main(String[] args) {
//        int bst[] = {1,2,3,8,5,9,7};
////        let's creaate firt our bst and then use..
//
//        Node root=null;
//        for(int i=0;i<bst.length;i++){
//            root=insert(root,bst[i]);
//        }
//
////        we know now inoerder output sorted aata hai so hum first and last element ko hi print karenge..
//
//        inorder(root);
//        System.out.println();
//        for(int i=0;i<bst.length;i++){
//            Node successor = successor(root,bst[i]);
//            if (successor==null){
//                System.out.println("successor of "+ bst[i]+" -> "+ -1);
//            }
//            else {
//                System.out.println("successor of "+ bst[i]+" -> "+successor.data);
//            }
//        }
//
//
//    }
//}
//
//
