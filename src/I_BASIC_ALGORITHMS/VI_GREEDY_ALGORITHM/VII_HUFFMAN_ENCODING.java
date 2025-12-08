package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // PriorityQueue will use this to sort nodes
    public int compareTo(Node other) {
        return this.data - other.data;
    }
}

public class VII_HUFFMAN_ENCODING {

    // Traverse the Huffman Tree and print code for each leaf
    static void traverse(Node root, String code) {
        if (root.left == null && root.right == null) {
            System.out.println(root.data + " : " + code);
            return;
        }

        traverse(root.left, code + '0');
        traverse(root.right, code + '1');
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 9, 12, 13, 16, 45};

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int val : arr) {
            pq.add(new Node(val));
        }

        // Build Huffman Tree
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node merged = new Node(left.data + right.data);
            merged.left = left;
            merged.right = right;
            pq.add(merged);
        }

        // Root of Huffman Tree
        Node root = pq.peek();

        // Print Huffman Codes
        traverse(root, "");
    }
}


//Note=>
//1. same like previous minheap..karo and naya node add karte jao ..
//2. traverse karte tinme bas left me 0 and right me e1
//3. comparable karna bhulna  mat
