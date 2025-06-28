//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.Stack;
//
//class Node {
//    char data;
//    Node left, right;
//    public Node(char data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//class BinaryTree {
//    static Node constructTree(String s) {
//        if (s == null || s.length() == 0) return null;
//
//        Stack<Node> stack = new Stack<>();
//        Node root = null;
//        Node curr = null;
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (Character.isLetterOrDigit(ch)) {
//                Node newNode = new Node(ch);
//                if (root == null) {
//                    root = newNode;
//                } else {
//                    Node parent = stack.peek();
//                    if (parent.left == null) {
//                        parent.left = newNode;
//                    } else {
//                        parent.right = newNode;
//                    }
//                }
//                stack.push(newNode);
//            } else if (ch == ')') {
//                stack.pop(); // finished this subtree
//            }
//            // ignore '(' as it only signals start of a child
//        }
//
//        return root;
//    }
//
//    static void inorder(Node root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//}
//public class XV_CONSTRUCT_BT_FROM_STRING_WITH_BRACKET {
//    public static void main(String[] args) {
//        String s = "1(2(4)(5))(3)";
//        Node root = BinaryTree.constructTree(s);
//        System.out.print("Inorder Traversal: ");
//        BinaryTree.inorder(root);
//    }
//}
