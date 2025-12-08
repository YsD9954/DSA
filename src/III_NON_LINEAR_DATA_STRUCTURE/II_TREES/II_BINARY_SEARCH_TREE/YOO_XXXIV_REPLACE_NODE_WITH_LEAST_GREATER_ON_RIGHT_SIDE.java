//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
//
//class Node {
//    int data;
//    Node right;
//    Node left;
//
//    Node(int data) {
//        this.data = data;
//        this.right = null;
//        this.left = null;
//    }
//}
//
//class BinarySearchTree {
//    static Node root;
//
//    BinarySearchTree() {
//        this.root = null;
//    }
//
//    // Normal BST insert (used in original version, not used now)
//    static Node insert(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        } else if (data < root.data) {
//            root.left = insert(root.left, data);
//        } else {
//            root.right = insert(root.right, data);
//        }
//        return root;
//    }
//
//    // Modified insert: tracks successor while inserting
//    static Node insertWithSuccessorTracking(Node root, int data, Node[] succ) {
//        if (root == null) return new Node(data);
//
//        if (data < root.data) {
//            succ[0] = root; // possible successor
//            root.left = insertWithSuccessorTracking(root.left, data, succ);
//        } else {
//            root.right = insertWithSuccessorTracking(root.right, data, succ);
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
//
//public class YOO_XXXIV_REPLACE_NODE_WITH_LEAST_GREATER_ON_RIGHT_SIDE {
//    public static void main(String[] args) {
//        int bst[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
//
//        int[] result = new int[bst.length];
//        Node root = null;
//
//        // Traverse array from right to left
//        for (int i = bst.length - 1; i >= 0; i--) {
//            Node[] succ = new Node[1]; // successor holder
//            root = BinarySearchTree.insertWithSuccessorTracking(root, bst[i], succ);
//            if (succ[0] != null) {
//                result[i] = succ[0].data;
//            } else {
//                result[i] = -1;
//            }
//        }
//
//        // Print final result
//        for (int val : result) {
//            System.out.print(val + " ");
//        }
//    }
//}
//
//
////logicall ye question um directly arrays se kar sakte hai..hut do loop laga ke unme sabse chota max thab my arr[i]..that 's bet..
//
//// for (int i = 0; i < n; i++) {
////    int minGreater = Integer.MAX_VALUE;
////    for (int j = i + 1; j < n; j++) {
////        if (arr[j] > arr[i] && arr[j] < minGreater) {
////            minGreater = arr[j];
////        }
////    }
////    result[i] = (minGreater == Integer.MAX_VALUE) ? -1 : minGreater;
////}