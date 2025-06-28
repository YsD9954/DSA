//import java.util.*;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}
//
//class BinaryTree {
//    Node root;
//    Map<String, Integer> map = new HashMap<>();
//    List<Node> duplicates = new ArrayList<>();
//
//    // Main function to detect duplicates
//    public void findDuplicateSubtrees() {
//        serialize(root);
//        System.out.println("Duplicate Subtree Root Values:");
//        for (Node n : duplicates) {
//            System.out.println(n.data);
//        }
//    }
//
//    // Serialize subtree and detect duplicates
//    private String serialize(Node node) {
//        if (node == null) return "#";
//
//        String serial = "(" + serialize(node.left) + ")" + node.data + "(" + serialize(node.right) + ")";
//
//        map.put(serial, map.getOrDefault(serial, 0) + 1);
//
//        if (map.get(serial) == 2) { // Only add once
//            duplicates.add(node);
//        }
//
//        return serial;
//    }
//}
//
//public class XIX_DUPLICATE_SUBTREE{
//
//public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        // Example tree:
//        /*
//                  1
//                 / \
//                2   3
//               /   / \
//              4   2   4
//                 /
//                4
//         */
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.right.left = new Node(2);
//        tree.root.right.right = new Node(4);
//        tree.root.right.left.left = new Node(4);
//
//        tree.findDuplicateSubtrees();
//    }
//}
