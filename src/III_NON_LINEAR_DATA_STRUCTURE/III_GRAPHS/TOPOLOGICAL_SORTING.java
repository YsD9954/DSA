//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
//import java.util.Stack;
//
//class Edge{
//    int src;
//    int dest;
//    int wght;
//    Edge(int s, int e,int w){
//        this.src = s;
//        this.dest = e;
//        this.wght = w;
//    }
//}
//public class TOPOLOGICAL_SORTING {
//    public static void  constructGraphs(ArrayList<Edge> graph[]){
//        for (int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
//        graph[0].add(new Edge(0, 1, 1));
//        graph[0].add(new Edge(0, 2, 1));
//
//        graph[1].add(new Edge(1, 0, 1));
//        graph[1].add(new Edge(1, 3, 1));
//
//        graph[2].add(new Edge(2, 0, 1));
//        graph[2].add(new Edge(2, 4, 1));
//
//        graph[3].add(new Edge(3, 1, 1));
//        graph[3].add(new Edge(3, 4, 1));
//        graph[3].add(new Edge(3, 5, 1));
//
//        graph[4].add(new Edge(4, 2, 1));
//        graph[4].add(new Edge(4, 3, 1));
//        graph[4].add(new Edge(4, 5, 1));
//
//        graph[5].add(new Edge(5, 3, 1));
//        graph[5].add(new Edge(5, 4, 1));
//        graph[5].add(new Edge(5, 6, 1));
//        graph[5].add(new Edge(6, 5, 1));
//
//    }
//    public static void topologicalSort(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> stack){
//        vis[curr] = true;
//        for (int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if (!vis[e.dest]){
//                topologicalSort(graph,vis,e.dest,stack);
//            }
//        }
//        stack.push(curr);
//
//    }
//    public static void main(String[] args) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        constructGraphs(graph);
//        boolean vis[] = new boolean[v];
//        Stack<Integer> stack = new Stack<>();
//
//        for(int i=0;i<v;i++){
//            if (vis[i]==false){
//                topologicalSort(graph,vis,i,stack);
//            }
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop()+" ");
//        }
//
//    }
//}
//
//
//
//
////NOTE => TOPOLOGICAL SORTING...
////1. ACTION 1 -> ACTION 2-> ACTION 3 -|__\  ACTION 5 .......
////                      |-> ACTION 4 -|  /
//
////
////        1
////        |
////        2
////      /   \
////     3     4
////      \   /
////        5
//
////SO TOPLOGICAL SORTING WILL BE 1->2->3->4->5 OR 1->2->4->3->5