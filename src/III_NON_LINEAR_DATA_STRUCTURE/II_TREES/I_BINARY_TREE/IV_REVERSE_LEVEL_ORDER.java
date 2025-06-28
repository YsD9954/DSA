//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.reverseLevel;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right = null;
//    }
//
//}
//class BinaryTree{
//
//    Node root;
//
//    public BinaryTree(){
//        root=null;
//    }
//
//
//    static void reverseLevel(Node root){
//         if (root==null){
//                System.out.print(-1+" ");
//                return;
//            }
//         Queue<Node> q = new LinkedList<>();
//         Stack<Integer> s = new Stack<>();
//
//         q.add(root);
//         q.add(null);
//         s.push(root.data);
//         s.push(-1);
//
//         while (!q.isEmpty()){
//             Node curr = q.remove();
//
//             if (curr==null){
////                 System.out.println();
//                 if (q.isEmpty()){//tree khatm!!
//                     break;
//                 }
//                 else { //ek level khatam hui hai bass ...
//                     q.add(null);
//                     s.push(-1);
//                 }
//             }
//             else {
////                 System.out.print(curr.data+" ");
//                 if (curr.right!=null){//pahile right hi karo !!nho toh add karne me problem hoga..!!
//                     q.add(curr.right);
//                     s.push(curr.right.data);
//                 }
//                 if (curr.left!=null){ //left hai toh left add kar!!
//                     q.add(curr.left);
//                     s.push(curr.left.data);
//                 }
//
//             }
//         }
//
//         while(!s.isEmpty()){
//             if (s.peek()==-1){
//                 s.pop();
//                 System.out.println();
//             }
//             else {
//                 System.out.print(s.peek()+" ");
//                 s.pop();
//             }
//
//         }
//    }
//
//}
//
//public class IV_REVERSE_LEVEL_ORDER {
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        reverseLevel(tree.root);
//    }
//}
