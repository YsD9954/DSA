//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE;
//import java.util.LinkedList;
//import java.util.Queue;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE.BinaryTree.*;
//
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
//public class I_TRAVERSAL_TECHNIQUES_LL_IN_BT {
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


package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

class MyNode{
    MyNode left;
    MyNode right;
    int data;

    MyNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }

}
public class I_TRAVERSAL_TECHNIQUES_LL_IN_BT{
    public static int idx=-1;
    public static MyNode buildTree(int nodes[]){
        idx++;

        if(nodes[idx]==-1){
            return null;
        }
        MyNode mynode = new MyNode(nodes[idx]);
        mynode.left=buildTree(nodes); //left sub tree...
        mynode.right = buildTree(nodes);//right sub tree ...

        return mynode; //last me root aana mangta
    }
    public static void preorder(MyNode root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.left);

    }
    public static void inorder(MyNode root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.left);

    }

    public static void postorder(MyNode root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.left);
        System.out.print(root.data+" ");

    }


    public static void levelorder(MyNode root){
        if(root==null){
            return;
        }
        Queue<MyNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            MyNode curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data);
                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);

                }
            }
        }
    }

    static  int count=0;
    public static int countnodes(MyNode root){
        if(root==null){
            return 0;
        }

        int leftcount = countnodes(root.left);
        int rightcount =countnodes(root.right);

        return leftcount+rightcount+1; //1 for root as root se shuru karre but add sirf left and right karre but count toh root bhui hoga so +1!!
    }
    static  int sum=0;

    public static int sumnodes(MyNode root){
        if(root==null){
            return 0;
        }
        int leftSum = sumnodes(root.left);
        int rightSum = sumnodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int height(MyNode root) {
        if (root == null) {
            return 0;
        }

        Queue<MyNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int height = 0;

        while (!q.isEmpty()) {
            MyNode curr = q.remove();

            if (curr == null) {
                height++;
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return height;
    }


    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        MyNode root = buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println();
        int count=countnodes(root);
        System.out.println(count);
        System.out.println();
        int sum = sumnodes(root);
        System.out.println(sum);
        System.out.println();
        int h = height(root);
        System.out.println(h);

    }

}
