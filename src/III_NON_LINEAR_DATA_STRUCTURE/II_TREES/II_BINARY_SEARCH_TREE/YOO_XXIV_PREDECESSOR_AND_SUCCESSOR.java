//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.Stack;
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
//    static Node predecessor(Node root, int key){
//        Node predecessor = null;
//        while (root!=null){ //jab tak leaf nhi aata tab tak check laro..
//            if (key>root.data){ // if mera node kam hai toh ..
//                predecessor=root;
//                root=root.right; // right me jao kyuki usse bada bhi predcessor ho sakta hai ..
//            }
//            else {
//                root=root.right;//if mera node jyada hai..toh kam left jao udher kam ho sakta hai..
//            }
//
//        }
//
//        return predecessor;
//    }
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
//public class YOO_XXIV_PREDECESSOR_AND_SUCCESSOR {
//    public static void main(String[] args) {
//        int bst[] = {1,2,3,4,5,9,6};
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
//        int key =4;
//        Node predecessor = predecessor(root,key);
//        System.out.println("predecessor = "+ predecessor.data);
//        Node successor = successor(root,key);
//        System.out.println("successor = "+successor.data);
//    }
//}
//
//
