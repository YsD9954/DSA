//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//import java.util.ArrayList;
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
//    Node root;
//
//    public BinarySearchTree() {
//        this.root = null;
//    }
//
//    static Node constructBST(ArrayList<Integer> arrayList, int low, int high) {
//        if (low > high) return null;
//        int mid = low + (high - low) / 2;
//        Node curr = new Node(arrayList.get(mid));
//        curr.left = constructBST(arrayList, low, mid - 1);
//        curr.right = constructBST(arrayList, mid + 1, high);
//        return curr;
//    }
//
//    static void inorderTraverse(Node root, ArrayList<Integer> arrayList) {
//        if (root == null) return;
//        inorderTraverse(root.left, arrayList);
//        arrayList.add(root.data);
//        inorderTraverse(root.right, arrayList);
//    }
//
//    static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        ArrayList<Integer> merged = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i) < list2.get(j)) merged.add(list1.get(i++));
//            else merged.add(list2.get(j++));
//        }
//        while (i < list1.size()) merged.add(list1.get(i++));
//        while (j < list2.size()) merged.add(list2.get(j++));
//        return merged;
//    }
//
//    static Node mergeBalanceBST(Node root1, Node root2) {
//        if (root1 == null) return root2;
//        if (root2 == null) return root1;
//
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//
//        inorderTraverse(root1, arrayList1);
//        inorderTraverse(root2, arrayList2);
//
//        System.out.println("Inorder of tree1: " + arrayList1);
//        System.out.println("Inorder of tree2: " + arrayList2);
//
//        ArrayList<Integer> mergedList = mergeSortedLists(arrayList1, arrayList2);
//        System.out.println("Merged List: " + mergedList);
//
//        return constructBST(mergedList, 0, mergedList.size() - 1);
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
//public class YOO_XXIX_MERGE_2_BST {
//    public static void main(String[] args) {
//        BinarySearchTree tree1 = new BinarySearchTree();
//        tree1.root = new Node(100);
//        tree1.root.left = new Node(50);
//        tree1.root.right = new Node(300);
//        tree1.root.left.left = new Node(20);
//        tree1.root.left.right = new Node(70);
//
//        BinarySearchTree tree2 = new BinarySearchTree();
//        tree2.root = new Node(80);
//        tree2.root.left = new Node(40);
//        tree2.root.right = new Node(120);

//        System.out.println("Tree1 root: " + (tree1.root != null ? tree1.root.data : "null"));
//        System.out.println("Tree2 root: " + (tree2.root != null ? tree2.root.data : "null"));
//
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.root = BinarySearchTree.mergeBalanceBST(tree1.root, tree2.root);
//
//        System.out.println("Merged tree root: " + (tree.root != null ? tree.root.data : "null"));
//        System.out.println("The Inorder traversal of the merged BST is: ");
//        BinarySearchTree.inorder(tree.root);
//        System.out.println();  // for clean newline
//    }
//}
