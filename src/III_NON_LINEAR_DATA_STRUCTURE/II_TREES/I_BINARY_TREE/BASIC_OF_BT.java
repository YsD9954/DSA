
// TREE => NON LINEAR DATA STRUCTURE -> COLLECTION OF ENTITIES(NODES) LINKED TOGETHER TO STIMULATE A *HIERARCHY*!!!
//NODES = SAB ELEMENT KO HI NODES BOLTE ... LINKEDLIST JAISE!!
//ROOT = JISKA NO PARENT ELEMENT ...
//PARENT ELEMENT/NODE = JIS  NODE SE AAGE TREE CHALU HAI....
//CHILD = JISKE NICHE HAI USKO HI CHILD BOLTE ..
//LEAF = LAST NODE JISKE BAAAD KUCH NAHI HAI..

// NORMAL TREE =>

// LEAF
// /|\
//  |
// BRANCHES
// /|\
//  |
// ROOTS


// CODING TREE =>

// ROOT NODES
//   |
//  \|/
// BRANCHES
//   |
//  \|/
//  LEAF


// BINARY TREES <=> "ONLY TWO NODE AT MAX !!!!" ----> [LEFT|NODE|RIGHT]
//VERY SIMILAR TO THE LINKED LIST!!!

//LL-NODE => SOME DATA + NODE next
//BST-NODE => SOME DATA + NODE left + NODE right {TWO POINTER/TWO NODES}


//             A         ----
//             / \           |
//          B    C          |__|A|B|C|D|E|F|G|....>ARRAY!!!
//         / \  / \        |
//       D   E  F  G    ----

// IF BICH VALE MISSING REMAIN THEM AS IT IS !!!

// RELTn =>
// IF , NODE AT INDEX ---> i
// IT'S LEFT CHILD ---> 2i
// IT'S RIGHT CHILD ---> 2i+1
// IT'S PARENT  ---> (int)i/2..



//TYPES OF BINARY TREE=>
//|-> FULL/STRICT BINARY TREE .=> ALL NODES ARE COMPLETELY FILLED!!
//|-> COMPLETE BINARY TREE .==> ALL LEVELS ARE COMPLETELY FILLED EXCEPT LAST... N
//|-> PREFECT BINARY TREE ---{ALL FILLED NODES ARE AT SAME LEVEL!!}
//|-> HIEGHT BALANCED BINARY TREE ---{AVG HEIGHT O(logN)}
//|-> SKEWED BINARY TREE ---{HEIGHT O(N)}
//|-> ORDERED BINARY TREE ---{EVERY NODE HAS SOME PROPERTY!!}



//PROPERTIES=>

//1.PERFECT BINARY TREE , HEIGHT = H
//TOTAL NODES = 2^(n+1) - 1

//2.LEAF NODES IN PERFECT BINARY TREE =2^H
//2^H+1 - 1 - 2^H = 2^H - 1

//3. N = NO . OF LEAVES!!
//log(N+1) LEVELS ATLEAST

//4.STRICT BINARY TREE !!
//N-> LEAF NODES!!
//N-1 => INTERNAL NODES !!
//{ LEAF NODES => INTERNAL NODES + 1 }



//IMPLEMENTATION =>

//1.LINKED-LIST REPRESENTATION !!>>>>
//2.SEQUENTIAL => USING ARRAY !!



//                                        1.LINKED-LIST REPRESENTATION !!>>>>
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES.I_BINARY_TREE;
//
//// Node class representing each element of the binary tree
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//// BinaryTree class for managing the tree
//class BinaryTree {
//    Node root;
//
//    BinaryTree() {
//        root = null;
//    }
//}
//
//public class BASIC_OF_BT {
//    public static void main(String[] args) {
//
//        // Creating the tree manually:
//        //         1
//        //       /   \
//        //     2       3
//        //   /   \
//        //  4     5
//
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//    }
//}

//                                        1.ARRAY REPRESENTATION !!>>>>

//
//
//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//class ArrayBinaryTree {
//    int[] tree;
//    int size;
//    int lastUsedIndex = -1;
//
//    public ArrayBinaryTree(int capacity) {
//        size = capacity;
//        tree = new int[size];
//    }
//
//    public void add(int value) {
//        if (lastUsedIndex + 1 >= size) {
//            System.out.println("Tree is full");
//            return;
//        }
//        lastUsedIndex++;
//        tree[lastUsedIndex] = value;
//    }
//}
//
//public class BASIC_OF_BT_ARRAY {
//    public static void main(String[] args) {
//
//        // Creating a binary tree with capacity 10
//        ArrayBinaryTree tree = new ArrayBinaryTree(10);
//
//        // Manually adding elements to match this structure:
//        //         1
//        //       /   \
//        //     2       3
//        //   /   \
//        //  4     5
//
//        tree.add(1); // root
//        tree.add(2); // left child of 1
//        tree.add(3); // right child of 1
//        tree.add(4); // left child of 2
//        tree.add(5); // right child of 2
//    }
//}
