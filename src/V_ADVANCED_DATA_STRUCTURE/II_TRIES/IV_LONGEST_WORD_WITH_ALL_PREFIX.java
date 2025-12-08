//package V_ADVANCED_DATA_STRUCTURE.II_TRIES;
//
//class Node {
//    Node[] children = new Node[26];
//    boolean eow;
//
//    public Node() {
//        for (int i = 0; i < 26; i++) {
//            children[i] = null;
//        }
//        eow = false;
//    }
//}
//
//public class IV_LONGEST_WORD_WITH_ALL_PREFIX {
//    static Node root = new Node();
//    static String ans = "";
//
//    public static void insert(String s) {
//        Node curr = root;
//        for (int i = 0; i < s.length(); i++) {
//            int idx = s.charAt(i) - 'a';
//            if (curr.children[idx] == null) {
//                curr.children[idx] = new Node();
//            }
//            curr = curr.children[idx];
//        }
//        curr.eow = true;
//    }
//
//    public static void longestWord(Node node, StringBuilder curr) {
//        // ❗ Only go deeper if root or current node marks a valid word
//        if (node != root && !node.eow) return;
//
//        if (curr.length() > ans.length()) {
//            ans = curr.toString();
//        }
//
//        for (int i = 0; i < 26; i++) {
//            if (node.children[i] != null) {
//                curr.append((char) (i + 'a'));
//                longestWord(node.children[i], curr);
//                curr.deleteCharAt(curr.length() - 1);  // backtrack
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
//        for (String word : words) {
//            insert(word);
//        }
//
//        longestWord(root, new StringBuilder());
//        System.out.println(ans);
//    }
//}
