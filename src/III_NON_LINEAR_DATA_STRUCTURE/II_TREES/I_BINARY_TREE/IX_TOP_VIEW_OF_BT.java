//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Queue;
//import java.util.TreeMap;
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTree.printTopView;
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
//    static void printTopView(Node root) {
//        if (root == null) return;
//
//        class Pair {
//            Node node;
//            int hd; // horizontal distance
//
//            Pair(Node node, int hd) {
//                this.node = node;
//                this.hd = hd;
//            }
//        }
//
//        Map<Integer, Integer> topViewMap = new TreeMap<>();
//        Queue<Pair> q = new LinkedList<>();
//        q.add(new Pair(root, 0));
//
//        while (!q.isEmpty()) {
//            Pair curr = q.poll();
//
//            // If this HD is not already present, add it
//            if (!topViewMap.containsKey(curr.hd)) {
//                topViewMap.put(curr.hd, curr.node.data);
//            }
//
//            if (curr.node.left != null)
//                q.add(new Pair(curr.node.left, curr.hd - 1));
//
//            if (curr.node.right != null)
//                q.add(new Pair(curr.node.right, curr.hd + 1));
//        }
//
//        // Print top view
//        for (int val : topViewMap.values()) {
//            System.out.print(val + " ");
//        }
//    }
//
//
//}
//
//public class IX_TOP_VIEW_OF_BT {
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
//        printTopView(tree.root);
//    }
//}
