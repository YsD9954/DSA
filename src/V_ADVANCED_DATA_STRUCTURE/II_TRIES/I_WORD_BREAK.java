//package V_ADVANCED_DATA_STRUCTURE.II_TRIES;
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
//
//public class I_WORD_BREAK {
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
//    public static boolean wordBreak(String key) {
//        int len = key.length();
//        if(len == 0) {
//            return true;
//        }
//        for(int i=1; i<=len; i++) {
//            if( search(key.substring(0, i)) && wordBreak(key.substring(i)) ) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        String words[] = {"i","like","sam","samsung","mobile"};
//        String key = "ilikesam";
//
//        for (int i=0;i<words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(wordBreak(key));
//
//    }
//}
//
//
////just word break fiucgtion add kiya
////SO SIMPLY ..CHECK KARO IN COMPLE LIST IS THE UBSTRIGN HAI KI NHI