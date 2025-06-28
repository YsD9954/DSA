//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left = this.right = null;
//    }
//}
//
//class BinaryTree {
//    Node root;
//
//    public BinaryTree() {
//        root = null;
//    }
//
//    // Step 1: Mirror the tree
//    static void mirror(Node node) {
//        if (node == null) return;
//
//        Node temp = node.left;
//        node.left = node.right;
//        node.right = temp;
//
//        mirror(node.left);
//        mirror(node.right);
//    }
//
//    // Step 2: Check if two trees are identical
//    static boolean isSame(Node a, Node b) {
//        if (a == null && b == null)
//            return true;
//        if (a == null || b == null)
//            return false;
//        if (a.data != b.data)
//            return false;
//
//        return isSame(a.left, b.left) && isSame(a.right, b.right);
//    }
//
//    // Step 3: Create a deep copy of tree
//    static Node clone(Node root) {
//        if (root == null) return null;
//        Node newNode = new Node(root.data);
//        newNode.left = clone(root.left);
//        newNode.right = clone(root.right);
//        return newNode;
//    }
//
//    // Step 4: Is tree symmetric (mirror of itself)?
//    static boolean isSymmetric(Node root) {
//        Node cloneRoot = clone(root);
//        mirror(cloneRoot);
//        return isSame(root, cloneRoot);
//    }
//}
//
//public class XX_CHECK_MIRROR_IN_N_ARY_TREE {
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(2);
//        tree.root.left.left = new Node(3);
//        tree.root.right.right = new Node(3);
//
//        boolean result = BinaryTree.isSymmetric(tree.root);
//        System.out.println(result);
//    }
//}
