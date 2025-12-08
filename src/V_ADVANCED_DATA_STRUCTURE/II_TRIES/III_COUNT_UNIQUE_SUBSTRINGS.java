//package V_ADVANCED_DATA_STRUCTURE.II_TRIES;
//
//
//
//
//
//
//class Node{
//    Node children[] = new Node[26];
//    Boolean eow;
//    public Node(){
//        for (int i=0;i<26;i++){
//            children[i] = null;
//        }
//        eow=false;
//    }
//}
//
//public class III_COUNT_UNIQUE_SUBSTRINGS {
//    static Node root = new Node();
//    public static void insert(String s){
//        Node curr = root;
//        for (int i=0;i<s.length();i++){
//            int idx = s.charAt(i)-'a';
//            if(curr.children[idx]==null){
//                curr.children[idx] = new Node();
//            }
//            if(i==s.length()-1){        // har ek strign khatam hone ke baad eow = true..
//
//                curr.eow=true;
//            }
//            curr=curr.children[idx];
//
//        }
//    }
//
//
//    public static boolean search(String s){
//        Node curr = root;
//        for (int i=0;i<s.length();i++){
//            int idx = s.charAt(i)-'a';
//            if (curr.children[idx]==null){
//                return false;
//            }
//            if(i==s.length()-1 && curr.eow==false){
//                return false;
//            }
//            curr=curr.children[idx];
//        }
//        return true;
//    }
//    public static int countNode(Node root){
//        if (root==null){
//            return 0;
//        }
//        int count=0;
//        for (int i=0;i<26;i++){
//            if (root.children[i]!=null){
//                count+=countNode(root.children[i]);
//
//            }
//        }
//        return count+1;
//
//    }
//
//    public static void main(String[] args) {
//        String str = "apple";
//
//        for (int i=0;i<str.length();i++){
//            String suffix = str.substring(i);
//            insert(suffix);
//        }
//        System.out.println(countNode(root));
//    }
//}
//
//
//
////NOTE=>
////SUFFIX NIKALO..
////INSERT SUFFIX IN TRIE
////FIND COUNT OF NODES LIKE TREES!!