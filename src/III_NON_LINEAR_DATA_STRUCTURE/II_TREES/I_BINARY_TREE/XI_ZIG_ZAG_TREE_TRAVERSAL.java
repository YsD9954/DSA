package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE.BinaryTree.zigZagTraversal;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=left;
        this.right= right;

    }

}
class BinaryTree{
    Node root;
    public BinaryTree(){
        this.root=null;
    }
    static void zigZagTraversal(Node root) {
        if (root == null) {
            System.out.println(-1);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            int[] level = new int[size]; // To store level elements in correct order

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                // Fill from left or right based on direction
                int index = leftToRight ? i : size - i - 1;
                level[index] = curr.data;

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }

            // Print current level
            for (int val : level)
                System.out.print(val + " ");
            System.out.println();

            // Toggle direction
            leftToRight = !leftToRight;
        }
    }

}
public class XI_ZIG_ZAG_TREE_TRAVERSAL {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        zigZagTraversal(tree.root);


    }
}

//NOTE=>
//1. LEVEL OREDER HI HAI!! BAS ZERO SE NAHI 1 SE SHURU HOGA!!
//2. ODD LEVES-> LEFT TO RIGHT!!
//3 EVEN LEVELS-> RIGHT TO LEFT!!
