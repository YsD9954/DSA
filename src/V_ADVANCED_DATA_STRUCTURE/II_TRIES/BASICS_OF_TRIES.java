//package V_ADVANCED_DATA_STRUCTURE.II_TRIES;
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
//
//public class INTRO_TO_TRIES {
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
//    public static void main(String[] args) {
//        String words[] = {"the","a","there","their","any"};
//
//        for (int i=0;i<words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(search("their"));
//        System.out.println(search("any"));
//        System.out.println(search("an"));
//
//
//    }
//}
