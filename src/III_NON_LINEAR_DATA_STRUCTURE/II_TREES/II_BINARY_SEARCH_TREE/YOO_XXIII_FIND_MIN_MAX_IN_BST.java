//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
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
//    static Stack<Integer>s= new Stack<>();
//    static Stack min_max(Node root){
//
//        if (root==null){
//            return null;
//        }
//        min_max(root.left);
//        s.push(root.data);
////        System.out.print(root.data+" ");
//        min_max(root.right);
//        return s;
//    }
//
//
//
//
//}
//public class YOO_XXIII_FIND_MIN_MAX_IN_BST {
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
//        Stack <Integer> s = new Stack<>();
//        s  = min_max(root);
//        System.out.println("Max="+s.peek());
//        while(s.peek()!=root.data){
//            s.pop();
//        }
//        System.out.println("Min="+s.peek());
//
//    }
//}
//
//
////Note=> STACK KO HUM MINMAX FUNCTION ME USE TOH KIYE HAI BUT HUMNE SORF STORE KARKE RAKHA AS VAHA PE HAAR BAAR PRINT KAR DETA HO PEEK AND SO PURA KAHTAM HONE KE BAAAD MAIN ME PRINT KIYA!!!