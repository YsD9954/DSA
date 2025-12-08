package III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS;


import java.util.*;

import static III_NON_LINEAR_DATA_STRUCTURE.IV_HEAPS.BinarySearchTree.*;

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

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static void inorder(Node root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        inorder(root.left, arrayList);
        arrayList.add(root.data);
        System.out.print(root.data + " ");
        inorder(root.right, arrayList);
    }
}

public class XIII_BST_TO_MINHEAP {
    public static void main(String[] args) {
        int bst[] = {1, 2, 3, 6, 5, 4};
        Node root = null;
        for (int i = 0; i < bst.length; i++) {
            root = insert(root, bst[i]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        inorder(root,arrayList);

        System.out.println();
        for (int i=0;i<arrayList.size();i++){
            minHeap.add(arrayList.get(i));
        }
        System.out.println("MinHeap");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll()+" ");
        }


    }

}
