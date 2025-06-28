//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//class BinaryTree {
//    Node root;
//    static int leafLevel = -1;  // To store level of first encountered leaf
//
//    BinaryTree() {
//        root = null;
//    }
//
//    // Returns the height of the tree using level-order traversal
//    public static int levelorder(Node root) {
//        if (root == null) {
//            System.out.print(-1 + " ");
//            return 0;
//        }
//
//        int level = 1;
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//
//        while (!q.isEmpty()) {
//            Node curr = q.remove();
//
//            if (curr == null) {
//                if (q.isEmpty()) break;
//                q.add(null);
//                level++;
//            } else {
//                if (curr.left != null) q.add(curr.left);
//                if (curr.right != null) q.add(curr.right);
//            }
//        }
//        return level;
//    }
//
//    // Recursive function to check if all leaf nodes are at same level
//    static boolean checkLeafLevel(Node node, int level) {
//        if (node == null) return true;
//
//        if (node.left == null && node.right == null) {
//            if (leafLevel == -1) {
//                leafLevel = level;
//                return true;
//            }
//            return level == leafLevel;
//        }
//
//        return checkLeafLevel(node.left, level + 1) && checkLeafLevel(node.right, level + 1);
//    }
//}
//
//public class XVIII_LEAVES_AT_SAME_LEVELS {
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(8);
//        tree.root.left = new Node(3);
//        tree.root.right = new Node(10);
//        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(6);
//        tree.root.right.right = new Node(14);
//        tree.root.right.right.left = new Node(13);
//        tree.root.left.right.left = new Node(4);
//        tree.root.left.right.right = new Node(7);
//
//        System.out.println("Tree height: " + BinaryTree.levelorder(tree.root));
//        boolean result = BinaryTree.checkLeafLevel(tree.root, 0);
//        System.out.println("All leaves at same level? " + result);
//    }
//}
