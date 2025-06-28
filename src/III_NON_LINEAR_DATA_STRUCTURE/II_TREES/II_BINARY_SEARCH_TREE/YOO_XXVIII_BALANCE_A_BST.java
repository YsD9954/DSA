//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
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
//
//
//
//
//class BinarySearchTree{
//    static Node root;
//    public BinarySearchTree(){
//        this.root=null;
//    }
//
//
//    static Node construstBST(ArrayList<Integer> arrayList,int low,int high){
//        if (low>high){
//            return null;
//        }
//        int mid=low+(high-low)/2;
//        Node curr = new Node(arrayList.get(mid));
//        curr.left = construstBST(arrayList,low,mid-1);
//        curr.right = construstBST(arrayList,mid+1,high);
//
//        return curr;
//
//    }
//;
//    static void inorderTraverse(Node root,ArrayList<Integer> arrayList){
//        if(root ==null){
//            return;
//        }
//        inorderTraverse(root.left,arrayList);
//        arrayList.add(root.data);
//        inorderTraverse(root.right,arrayList);
//    }
//
//
//    static Node balanceBST(Node root) {
//        if (root==null){
//            return null;
//        }
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        inorderTraverse(root,arrayList);
//        return construstBST(arrayList,0,arrayList.size()-1);
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
//}
//public class YOO_XXVIII_BALANCE_A_BST {
//    public static void main(String[] args) {
////        let's creaate firt our binarytree and then use..
//
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.root = new Node(4);
//        tree.root.left=new Node(3);
//        tree.root.right = new Node(5);
//        tree.root.left.left=new Node(2);
//        tree.root.right.right=new Node(6);
//        tree.root.left.left.left=new Node(1);
//        tree.root.right.right.right=new Node(7);
//
//
//        Node node = balanceBST(tree.root);
//        inorder(node);
//
//    }
//}
//
//
////Note=>
////1.jamne already bt to bstkiya toh hame malum hai kais e inorder way me element ko store karneka and then usko bst me convert..
////2. but queue me dalne se problem is key hum traverse nahi karsakte ..as hamko merge sort karna hai by finding inoredr lisgt..
////3.so we take arryidt not array bebcuse hako arY ko define me size nhi pata..
////4. abhi toh first hamen sab normal inorder travese karke arrylist me sab value dal diye..
////5.now hamne consrst a balanced bst method banaya so vho vho arrylist ko mid me divide karega so ham mid element ke left and right add karenge values ..
////        i. mid lele usse chote left me nad usse bade right me ..
////        ii. again contiue thjis for jo naye left and right bane hai ..and uske left me chota nad right me bada and so ..recursvive wise hum el low and high values denge..
////        iii. note thwt low and high values will change fo rleft adn right ..for left=> low=low and high = mid-1 and for right => low = mid+1 and high=high..
////6.bass us node ko return kardo balaanced bst construct ho jayegi
////7. last me bstbalanced method me pne constuct method ko call karo and return node..