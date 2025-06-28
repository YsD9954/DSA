//package III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE;
//
//
//import static III_NON_LINEAR_DATA_STRUCTURE.II_TREES_AND_BINARY_TREE_AND_BINARY_SEARCH_TREE.BinaryTreeArray.*;
//
//class BinaryTreeArray{
//    static int size;
//    static int lastIdx;
//    static int[] tree;
//    public BinaryTreeArray(int size){
//        this.size=size;
//        tree=new int[size];
//    }
//
//    public static void add(int data){
//        if (lastIdx+1>=size){
//            System.out.println("Tree is full");
//            return;
//        }
//        lastIdx++;
//        tree[lastIdx]=data;
//    }
////    PREORDER TRAVERSAL->ROOT+LEFT+RIGHT
//    public static void preorder(int index){ //INDEX IS KAHA SE TREE START HORA..THAT IS 0 SE HAI HOTA HAI MOSTLY..
//        if (index>lastIdx){
//            return;
//        }
//        System.out.print(tree[index]+" ");
//        preorder(2*index+1);//LEFT
//        preorder(2*index+2);//RIGHT
//    }
//
////    INORDER TRAVERSAL->LEFT+ROOT+RIGHT
//    public static void inorder(int index){
//        if (index>lastIdx){
//            return;
//        }
//        inorder(2*index+1);//LEFT
//        System.out.print(tree[index]+" ");
//        inorder(2*index+2);//RIGHT
//    }
//
//    //    POSTORDER TRAVERSAL->LEFT+RIGHT+ROOT
//    public static void postorder(int index){
//        if (index>lastIdx){
//            return;
//        }
//        postorder(2*index+1);//LEFT
//        postorder(2*index+2);//RIGHT
//        System.out.print(tree[index]+" ");
//
//    }
//
////    LEVEL ORDER->
////    ROOT
////    LEVEL1
////    LEVEL2
//
//    public static void levelorder(){
//        int level = 0;
//        while (true){
//            int start = (int)Math.pow(2,level)-1;
//            int end = Math.min((int) Math.pow(2,level+1)-2,lastIdx);
//            if (start>lastIdx) break;
//            for (int i=start;i<=end;i++){
//                System.out.print(tree[i]+" ");
//            }
//            System.out.println();
//            level++;
//        }
//
//
//    }
//
//
//}
//public class II_TRAVERSAL_TECHNIQUES_ARRAY_IN_BT {
//    public static void main(String[] args) {
//        BinaryTreeArray tree = new BinaryTreeArray(5);
//        tree.add(1);
//        tree.add(2);
//        tree.add(3);
//        tree.add(4);
//        tree.add(5);
//
//        preorder(0);
//        System.out.println();
//        inorder(0);
//        System.out.println();
//        postorder(0);
//        System.out.println();
//        levelorder();
//
//    }
//}
