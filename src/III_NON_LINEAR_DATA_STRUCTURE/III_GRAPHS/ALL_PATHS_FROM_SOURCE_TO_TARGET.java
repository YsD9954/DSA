//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//
//import java.util.ArrayList;
//import java.util.Queue;
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
//
//
//}
//public class I_ALL_PATHS_FROM_SOURCE_TO_TARGET {
//
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
//    static void allPaths(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
//        if (curr==tar){
//            System.out.println(path);
//            return;
//        }
//        for (int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if (!vis[e.dest]){
//                vis[curr]=true;
//                allPaths(graph,vis,e.dest,path+e.dest,tar);
//                vis[curr] = false;
//
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        constructGraphs(graph);
//        int src = 0,tar=5;
//        boolean vis[] = new boolean[v];
//        allPaths(graph,vis,src,"0",tar);  // 0 jo ki start hai vho dalna padega first!!
//
//    }
//}
