package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE;
import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES.II_BINARY_SEARCH_TREE.BinarySearchTree.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree {
    static Node root;

    BinaryTree() {
        this.root = null;
    }
}

class BinarySearchTree {
    static Node root;
    static Node prev = null;
    static Node head = null;

    public BinarySearchTree() {
        this.root = null;
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Convert BST to Doubly Linked List
    static void bstTOdll(Node root) {
        if (root == null) return;

        bstTOdll(root.left);

        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;

        bstTOdll(root.right);
    }

    static void printDLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
        System.out.println();
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class YOO_XXXVIII_FLATTERN_BST_OR_CONVERT_TO_SLL {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        // Must be a BST for bstTOdll to make sense
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 1);
        insert(root, 7);
        insert(root, 40);
        insert(root, 50);

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        bstTOdll(root);

        System.out.print("Doubly Linked List (inorder): ");
        printDLL(head); // Print using DLL traversal
    }
}
